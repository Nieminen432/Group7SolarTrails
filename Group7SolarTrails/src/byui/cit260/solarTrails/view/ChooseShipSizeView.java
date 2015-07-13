/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.Ship;
import group7solartrails.Group7SolarTrails;
import static group7solartrails.Group7SolarTrails.getShip;

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
        try {
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

    }
} catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
} return false;
}

    private void chooseSmallShipType() {
        try {
        // Select SmallShipType
        this.console.println("You have selected the small ship type.");
        Ship ship = new Ship();
        ship.setSize(1);
        ship.setMaxInventory(10000);
        ship.setAmountLoaded(0);
        ship.setMaxCrew(3);
        Group7SolarTrails.setShip(ship);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
    } 
        finally {
        this.console.println("You have selected the " + getShip());
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
        }    
   }

    private void chooseMediumShipType() {
        try {
        // Select MediumShipType
        this.console.println("You have selected the medium ship type.");
        Ship ship = new Ship();
        ship.setSize(2);
        ship.setMaxInventory(20000);
        ship.setAmountLoaded(0);
        ship.setMaxCrew(6);
        Group7SolarTrails.setShip(ship);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
    } 
        finally {
        this.console.println("You have selected the " + getShip());
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
        }
    }
    
    private void chooseLargeShipType() {
        try {
        // Select MediumShipType
        this.console.println("You have selected the medium ship type.");
        Ship ship = new Ship();
        ship.setSize(3);
        ship.setMaxInventory(30000);
        ship.setAmountLoaded(0);
        ship.setMaxCrew(9);
        Group7SolarTrails.setShip(ship);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
    } 
        finally {
        this.console.println("You have selected the " + getShip());
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
        }
    }
    
/*
    private void chooseLargeShipType() {
        try {
        // Select LargeShipType
        this.console.println("You have selected the large ship type.");
        Group7SolarTrails.getShip().setSize(3);
        Group7SolarTrails.getShip().setMaxInventory(30000);
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
        } 
        finally {
        this.console.println("You have selected the " + getShip());   
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
        }
    }
*/
    private void resetShipOptions() {
        try {
        // reset ship type
        Group7SolarTrails.getShip().setSize(0);
        Group7SolarTrails.getShip().setMaxInventory(0);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a ship type");
    } 
        finally {
        this.console.println("You have selected the " + getShip());   
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
        }
    }

    private void previousMenu() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
}