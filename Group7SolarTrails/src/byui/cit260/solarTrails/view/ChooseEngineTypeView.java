/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseEngineTypeView extends View{
    public ChooseEngineTypeView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your ship type"
            + "\n-----------------------------------"
            + "\nC - This is the combustion engine. Its max speed is 20AU/hour."
            + "\n    This engine burns rocketfuel which can be harvested or synthesized. "
            + "\n    This engine is tried and tested and doesn't have many problems."
            + "\nI - This is the impulse engine. It's max speed is 40AU/hour"
            + "\n    This engine burns <SOMETHING?> which can be harvested or synthesized."
            + "\n    This engine has gone through extensive testing but still experiences breakdowns."
            + "\nS - This is the hyperdrive engine. It's max speed is 60AU/hour."
            + "\n    This engine runs on solar power and it is a very new technology that has a tendancy to breakdown."
            + "\nR - Reset currently selected ship options"
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }



    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'C': // create and start a new game
                this.chooseCombustionEngine();
                break;
            case 'I': // get and start an existing game
                this.chooseImpulseEngine();
                break;
            case 'S': // get and start an existing game
                this.chooseSolarSail();
                break;
            case 'R': // display the help menu
                this.resetShipOptions();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void chooseCombustionEngine() {
        // Select SmallShipType
        this.console.println("You have selected the Combustion Engine.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void chooseImpulseEngine() {
        // Select MediumShipType
        this.console.println("You have selected the Impulse Engine.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void chooseSolarSail() {
        // Select LargeShipType
        this.console.println("You have selected the Hyperdrive.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void resetShipOptions() {
        // reset ship type
    }

    private void previousMenu() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
}
