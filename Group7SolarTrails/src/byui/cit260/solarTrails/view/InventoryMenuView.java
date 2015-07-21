/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.model.InventoryItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class InventoryMenuView extends View{
 public InventoryMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n | Game Menu Options"
            + "\n---------------------------------------"
            + "\nV - View Inventory"
            + "\nP - Print Inventory"
            + "\nD - Go Back to the previous menu");
 }

     @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'R': // create and start a new game
                this.chooseViewInventory();
                break;
            case 'M': // get and start an existing game
                this.choosePrintInventory();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
                default:
                try {
                this.console.println("\n*** Invalid selection *** "
                                   + "\nPrease enter to try again");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        }
                break;
            } return false;
    }
    // Display current inventory

    private void chooseViewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        this.console.println("\nList of Inventory Items");
        this.console.println("\nDescription" + "\t" +
                "In Stock");
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getInventoryType() + "\t   "
                  + inventoryItem.getQuantityInStock());
        }
    }

    private void choosePrintInventory() {
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
           // SortedInventoryView.sortItems(Group7SolarTrails.getInventory(), filePath);
        }catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void previousMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
