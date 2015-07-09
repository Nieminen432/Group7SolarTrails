/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.exceptions.GameControlException;
import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.InventoryItem;
import byui.cit260.solarTrails.model.Location;
import group7solartrails.Group7SolarTrails;

/**
 *
 * @author Hiatt-Adam
 */
public class GameMenuView extends View{
    public GameMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n | Game Menu Options"
            + "\n---------------------------------------"
            + "\nR - Status Report"
            + "\nM - Map"
            + "\nI - Inventory"
            + "\nC - Create an Item"
            + "\nS - Ship"
            + "\nH - SickBay - Heal your crew."
            + "\nF - Rations"
            + "\nA - Save your current progress."
            + "\nL - Load another game or previous progress."
            + "\nD - Go Back to the previous menu"
            + "\nE - Exit the game."
            + "\n-----------------------------------");
    }

        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'R': // create and start a new game
                this.chooseStatusReport();
                break;
            case 'M': // get and start an existing game
                this.chooseMap();
                break;
            case 'I': // display the help menu
                this.chooseInventory();
                break;
            case 'C': // create and start a new game
                this.chooseSynthesizer();
                break;
            case 'S': // get and start an existing game
                this.chooseShip();
                break;
            case 'H': // display the help menu
                this.chooseSickBay();
                break;
            case 'F': // create and start a new game
                this.chooseRations();
                break;
            case 'A': // get and start an existing game
                this.chooseSave();
                break;
            case 'L': // display the help menu
                this.chooseLoad();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            case 'E': // Exit the program
                this.exitProgram();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void chooseStatusReport() {
        // Choose Status Report
    }

    private void chooseMap() {
        Game game = Group7SolarTrails.getCurrentGame();
        
        int location = game.getLocation();
        System.out.println(location);
    }

    private void chooseInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("\nList of Inventory Items");
        System.out.println("\nDescription" + "\t" +
                "In Stock");
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getInventoryType() + "\t   "
                    + inventoryItem.getQuantityInStock());
        }
    }
    private void chooseSynthesizer() {
        // Choose Synthesizer
    }

    private void chooseShip() {
        // Choose Ship
    }

    private void chooseSickBay() {
        // Choose SickBay
    }

    private void chooseRations() {
        // Choose Rations
    }

    private void chooseSave() {
        // Choose Save
        System.out.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(Group7SolarTrails.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void chooseLoad() {
        // Choose Load
    }

    private void previousMenu() {
        // Choose Previous Menu or Go back to game
    }

    private void exitProgram() {
        // Exit the game
    }
}

