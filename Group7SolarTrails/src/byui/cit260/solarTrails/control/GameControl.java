/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.*;
import byui.cit260.solarTrails.exceptions.*;
import byui.cit260.solarTrails.view.GameMenuView;
import group7solartrails.Group7SolarTrails;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

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

    public static InventoryItem[] getSortedInventoryList() {
        return null;
        
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
    
    
    
    public static void startNewGame(Group7SolarTrails game) {
        boolean playing = true;
        int days = 0;
        Random rand = new Random();
        while (playing) {
            try {
                Thread.sleep(300L);    // one second
            }
            catch (Exception e) {}
            System.out.println("Day " + days);
            
            int chance = rand.nextInt(30);
            if (chance % 9 == 0) {
                System.out.println("You have exploded!!!!!!"
                                + "\nHave a nice day");
                System.exit(0);
            }
            
            days++;
            if (days == 365) {
                playing = false;
            }
        }
    }
}
