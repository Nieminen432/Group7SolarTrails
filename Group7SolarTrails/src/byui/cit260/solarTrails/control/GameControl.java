/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.*;
import byui.cit260.solarTrails.exceptions.*;
import group7solartrails.Group7SolarTrails;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hiatt-Adam
 */
public class GameControl {

    static void assignScenesToLocations(Map map, Scene[] scenes) {

    }

    public static void saveGame(Game currentGame, String filePath)
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); // write the game object out to the file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void loadGame(String filePath)
        throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } 
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        Group7SolarTrails.setCurrentGame(game);
    }
    
    public enum Item {
        food,
        mineral,
        parts,
        medicine,
        fuel;
    }
    
    public static void createNewGame(Player player) throws SceneException {
        Game game = new Game();
        Group7SolarTrails.setCurrentGame(game);
        
        game.setPlayer(player);
        
        ArrayList<InventoryItem> inventoryList = new ArrayList<>();
        inventoryList = Group7SolarTrails.inventory;
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        AlienObjects alienObject = new AlienObjects();
        game.setAlienObjects(ship);
    }

    /*private static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantity(0);
        inventory[Item.food.ordinal()] = food;
        
        InventoryItem mineral = new InventoryItem();
        mineral.setDescription("Mineral");
        food.setQuantity(0);
        inventory[Item.mineral.ordinal()] = mineral;
        
        InventoryItem parts = new InventoryItem();
        parts.setDescription("Parts");
        food.setQuantity(0);
        inventory[Item.parts.ordinal()] = parts;
        
        InventoryItem medicine = new InventoryItem();
        medicine.setDescription("Medicine");
        food.setQuantity(0);
        inventory[Item.medicine.ordinal()] = medicine;
        
        InventoryItem fuel = new InventoryItem();
        fuel.setDescription("Fuel");
        food.setQuantity(0);
        inventory[Item.fuel.ordinal()] = fuel;
        
        return inventory;
    }

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList = 
                Group7SolarTrails.getCurrentGame().getInventory();
        
        InventoryItem[] newInventoryList = doInsertionSort(originalInventoryList);
        
        return newInventoryList;
    }
    
    //Sorting by quantity in inventory
    public static InventoryItem[] doInsertionSort(InventoryItem[] input) {
        InventoryItem temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i; j > 0; j--) {
                if (input[j].getQuantity() < input[j-1].getQuantity()) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }*/
}
