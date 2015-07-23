/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.*;
import byui.cit260.solarTrails.exceptions.*;
import byui.cit260.solarTrails.view.ErrorView;
import byui.cit260.solarTrails.view.GameMenuView;
import group7solartrails.Group7SolarTrails;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private static void chooseYes() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private static void chooseNo() {
        
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
        game.getShip();
        
        Engine engine = new Engine();
        game.setEngine(engine);

        game.getCurrentScore();
        game.getNoPeople();
        game.getMap();
        game.getEngine();
        game.getFuel();
        game.getCrew();
        game.getMedicine();
        game.getMinerals();
        game.getParts();
        game.getSynthesizedItems();
        
        AlienObjects alienObject = new AlienObjects();
        game.setAlienObjects(ship);
    }
    
    
    
    public static void startNewGame(Group7SolarTrails game) {
        boolean playing = true;
        int days = 0;
        Random rand = new Random();
        int foodIndex = 0;
        int medsIndex = 0;
        int minIndex = 0;
        int partsIndex = 0;
        while (playing) {
            try {
                Thread.sleep(300L);    // one second
            }
            catch (Exception e) {}
            for (int i = 0; i < game.inventory.size(); i++) {
                if (game.inventory.get(i).getInventoryType() == 1) {
                    foodIndex = i;
                } else if (game.inventory.get(i).getInventoryType() == 2) {
                    medsIndex = i;
                } else if (game.inventory.get(i).getInventoryType() == 3) {
                    minIndex = i;
                } else if (game.inventory.get(i).getInventoryType() == 4) {
                    partsIndex = i;
                }
            }
            int currentFuel = game.getShip().getFuelRemaining();
            int currentFood = game.inventory.get(foodIndex).getQuantity();
            
            System.out.println("\n\nDay " + days);
            System.out.println("food left " + currentFood);
            System.out.println("Fuel left " + currentFuel);
            
            currentFuel -= (9 * game.getShip().getSize());
            game.getShip().setFuelRemaining(currentFuel);
            
            currentFood -= (9 * game.getShip().getNoCrew());
            game.inventory.get(foodIndex).setQuantity(currentFood);
            
            if (days % 10 == 0) {
                System.out.println("Do you want to open the game menu? (Y or N)");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                try {
                    String getChoices = br.readLine();
                    getChoices = getChoices.toUpperCase();
                    char choice = getChoices.charAt(0);
                        if (getChoices.length() > 1 || getChoices.length() < 1) {
                            System.out.println("Invalid selection - please enter a menu item.");
               continue; // and repeat again
                    }
                        
        switch (choice) {
            case 'Y': // create and start a new game
                GameControl.chooseYes();
                break;
            case 'N': // get and start an existing game
                GameControl.chooseNo();
                break;
                }
                    
                } catch (IOException ex) {
                    Logger.getLogger(GameControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            int chance = rand.nextInt(30);
            if (chance % 9 == 0) {
                System.out.println("A random thing happened!");
            }
            
            days++;
            if (days == 365) {
                playing = false;
            }
        }
    }
}
