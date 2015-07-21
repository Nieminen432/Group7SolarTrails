/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.InventoryItem;
import group7solartrails.Group7SolarTrails;

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
            + "\n1 - 10% of your current cargo size."
            + "\n2 - 20% of your current cargo size."
            + "\n3 - 30% of your current cargo size."
            + "\n4 - 40% of your current cargo size."
            + "\n5 - 50% of your current cargo size."
            + "\n6 - 60% of your current cargo size."
            + "\n7 - 70% of your current cargo size."
            + "\n8 - 80% of your current cargo size."
            + "\n9 - 90% of your current cargo size."
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
        System.out.println(quantity);
        Group7SolarTrails.inventory.add(new InventoryItem(2, quantity, "Medicine"));
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
