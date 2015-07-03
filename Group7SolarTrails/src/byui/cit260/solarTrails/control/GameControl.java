/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.*;
import byui.cit260.solarTrails.exceptions.*;
import group7solartrails.Group7SolarTrails;

/**
 *
 * @author Hiatt-Adam
 */
public class GameControl {

    static void assignScenesToLocations(Map map, Scene[] scenes) {

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
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        AlienObjects alienObject = new AlienObjects();
        game.setAlienObjects(ship);

    }

    private static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        inventory[Item.food.ordinal()] = food;
        
        InventoryItem mineral = new InventoryItem();
        mineral.setDescription("Mineral");
        mineral.setQuantityInStock(0);
        inventory[Item.mineral.ordinal()] = mineral;
        
        InventoryItem parts = new InventoryItem();
        parts.setDescription("Parts");
        parts.setQuantityInStock(0);
        inventory[Item.parts.ordinal()] = parts;
        
        InventoryItem medicine = new InventoryItem();
        medicine.setDescription("Medicine");
        medicine.setQuantityInStock(0);
        inventory[Item.medicine.ordinal()] = medicine;
        
        InventoryItem fuel = new InventoryItem();
        fuel.setDescription("Fuel");
        fuel.setQuantityInStock(0);
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
                if (input[j].getQuantityInStock() < input[j-1].getQuantityInStock()) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
