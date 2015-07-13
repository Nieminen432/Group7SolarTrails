/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseShipSizeView extends View{
    public ChooseShipSizeView () {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your ship type"
            + "\n-----------------------------------"
            + "\nS - This is the small ship type. It holds 10,000 inventory and carries 3 crew members"
            + "\n    This ship is easier to maneuver."
            + "\nM - This is the medium ship type. It holds 20,000 inventory and carries 6 crew members"
            + "\n    This ship has a medium difficulty in maneuvering"
            + "\nL - This is the large ship type. It only holds 30,000 inventory and carries 9 crew members"
            + "\n    This ship is harder to maneuver."
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
            case 'S': // create and start a new game
                this.chooseSmallShipType();
                break;
            case 'M': // get and start an existing game
                this.chooseMediumShipType();
                break;
            case 'L': // get and start an existing game
                this.chooseLargeShipType();
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

    private void chooseSmallShipType() {
        // Select SmallShipType
        this.console.println("You have selected the small ship type.");
        Group7SolarTrails.getShip().setSize(1);
        Group7SolarTrails.getShip().setMaxInventory(10000);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void chooseMediumShipType() {
        // Select MediumShipType
        this.console.println("You have selected the medium ship type.");
        Group7SolarTrails.getShip().setSize(2);
        Group7SolarTrails.getShip().setMaxInventory(20000);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void chooseLargeShipType() {
        // Select LargeShipType
        this.console.println("You have selected the large ship type.");
        Group7SolarTrails.getShip().setSize(3);
        Group7SolarTrails.getShip().setMaxInventory(30000);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }

    private void resetShipOptions() {
        // reset ship type
        Group7SolarTrails.getShip().setSize(1);
        Group7SolarTrails.getShip().setMaxInventory(10000);
    }

    private void previousMenu() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
}