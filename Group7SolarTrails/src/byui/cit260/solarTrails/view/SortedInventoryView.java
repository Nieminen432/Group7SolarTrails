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
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


/**
 *
 * @author Hiatt-Adam
 */
public class SortedInventoryView {
    private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public SortedInventoryView(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    public static void sortItems(InventoryItem currentGame, String filePath)
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); // write the game object out to the file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
    public void sortedInventoryView () {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        this.console.println("\nList of Inventory Items");
        this.console.println("\nDescription" + "\t" +
                "In Stock");
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getInventoryType() + "\t   "
                    + inventoryItem.getQuantityInStock());
        }
}
}
