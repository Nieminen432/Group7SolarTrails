/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.InventoryItem;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class SelectStartMedicineView extends View{
  public SelectStartMedicineView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Select starting medicine"
            + "\n-----------------------------------"
            + "\n1 - 10% of your ship's cargo size."
            + "\n2 - 20% of your ship's cargo size."
            + "\n3 - 30% of your ship's cargo size."
            + "\n4 - 40% of your ship's cargo size."
            + "\n5 - 50% of your ship's cargo size."
            + "\n6 - 60% of your ship's cargo size."
            + "\n7 - 70% of your ship's cargo size."
            + "\n8 - 80% of your ship's cargo size."
            + "\n9 - 90% of your ship's cargo size."
            + "\nR - Reset choice."
            + "\nD - Done"
            + "\n-----------------------------------");
    }
        @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case '1':
                this.choosePercent(1);
                break;
            case '2':
                this.choosePercent(2);
                break;
            case '3':
                this.choosePercent(3);
                break;
            case '4':
                this.choosePercent(4);
                break;
            case '5':
                this.choosePercent(5);
                break;
            case '6':
                this.choosePercent(6);
                break;
            case '7':
                this.choosePercent(7);
                break;
            case '8':
                this.choosePercent(8);
                break;
            case '9':
                this.choosePercent(9);
                break;
            case 'R': // Reset Options
                this.chooseReset();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
                
        } return false;
    }

    private void choosePercent(double percent) {
        int quantity = (int) (percent*0.1*Group7SolarTrails.getShip().getMaxInventory());
        double amountLoaded = Group7SolarTrails.getShip().getAmountLoaded();
        double maxInventory = Group7SolarTrails.getShip().getMaxInventory();
        double storageRemaining = maxInventory - amountLoaded;
        int currentAmount = 0;
        //if this item is already in stock, get that quantity.
        for (InventoryItem inventory : Group7SolarTrails.inventory) {
            if (inventory.getInventoryType() == 2) {
                currentAmount = inventory.getQuantity();
                break;
            }
        }
        //if there's room
        if (storageRemaining >= quantity) {
            //add inventory item, initialize type, quantity, and name.
            Group7SolarTrails.inventory.add(new InventoryItem(2, quantity, "Medicine"));
            //set amount loaded
            int newAmountLoaded = (int) (quantity + amountLoaded - currentAmount);
            Group7SolarTrails.getShip().setAmountLoaded(newAmountLoaded);
            amountLoaded = newAmountLoaded;
            try {
                this.console.println("You have selected " + (int) (percent*10) + " percent Medicine.");
                this.console.println((int) (100 - amountLoaded / maxInventory * 100) + "% remaining.");
                this.console.println("------------ Press enter to continue ------------");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                SelectStartInventoryView selectStartInv = new SelectStartInventoryView();
                selectStartInv.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //if theres not enough room
            try {
                // give error and start over
                this.console.println("You don't have enough room to select that quantity.");
                this.console.println("You only have " + (int) (100 - amountLoaded / maxInventory * 100) + "% remaining");
                this.console.println("\n\nPress enter to retry");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                this.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseReset() {
        // Reset Medicine selection
        Group7SolarTrails.inventory.clear();
    }

    private void previousMenu() {
        SelectStartInventoryView startInventory = new SelectStartInventoryView();
        startInventory.display();
    }
}
