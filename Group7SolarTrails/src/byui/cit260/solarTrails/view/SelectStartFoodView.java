/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

/**
 *
 * @author Hiatt-Adam
 */
public class SelectStartFoodView extends View{
    public SelectStartFoodView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Select starting food"
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
            case '1': // create and start a new game
                this.choose10Percent();
                break;
            case '2': // get and start an existing game
                this.choose20Percent();
                break;
            case '3': // display the help menu
                this.choose30Percent();
                break;
            case '4': // create and start a new game
                this.choose40Percent();
                break;
            case '5': // get and start an existing game
                this.choose50Percent();
                break;
            case '6': // display the help menu
                this.choose60Percent();
                break;
            case '7': // create and start a new game
                this.choose70Percent();
                break;
            case '8': // get and start an existing game
                this.choose80Percent();
                break;
            case '9': // display the help menu
                this.choose90Percent();
                break;
            case 'R': // Reset Options
                this.chooseReset();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        } return false;
    }

    private void choose10Percent() {
        // Fill 10 Percent of current cargo hold with food.
    }

    private void choose20Percent() {
        // Fill 20 Percent of current cargo hold with food.
    }

    private void choose30Percent() {
        // Fill 30 Percent of current cargo hold with food.
    }

    private void choose40Percent() {
        // Fill 40 Percent of current cargo hold with food.
    }

    private void choose50Percent() {
        // Fill 50 Percent of current cargo hold with food.
    }

    private void choose60Percent() {
        // Fill 60 Percent of current cargo hold with food.
    }

    private void choose70Percent() {
        // Fill 70 Percent of current cargo hold with food.
    }

    private void choose80Percent() {
        // Fill 80 Percent of current cargo hold with food.
    }

    private void choose90Percent() {
        // Fill 90 Percent of current cargo hold with food.
    }

    private void chooseReset() {
        // Reset food selection
    }

    private void previousMenu() {
        SelectStartInventoryView startInventory = new SelectStartInventoryView();
        startInventory.display();
    }
}
