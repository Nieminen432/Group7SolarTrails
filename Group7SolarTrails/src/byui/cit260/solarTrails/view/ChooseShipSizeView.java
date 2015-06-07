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
public class ChooseShipSizeView {
    private final String MENU = "\n"
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
            + "\nB - Go Back to the previous menu"
            + "\n-----------------------------------";

    void displayMenu() {
            
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        
        } while (selection != 'B'); // a selection that is not "Back"
    }

    public String getInput() {
       boolean valid = false; // indicates if the input has been retrieved
       String input = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { // while a valid input has not been retreved
           
           // prompt for a menu item
           System.out.println("Select a menu item.");
           
           // get the input from the keyboard and trim off the blanks
           input = keyboard.nextLine();
           input = input.trim();
           input = input.toUpperCase();
           
           // if the input is invalid (more than 1 character)
           if (input.length() > 1) {
               System.out.println("Invalid selection - please enter a menu item.");
               continue; // and repeat again
           }
           break; // exit repetition
       }
       return input; // return the input
       
    }

    public void doAction(char choice) {
        
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
            case 'B': // Exit the program
                this.previousMenu();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

    }

    
}

    private void chooseSmallShipType() {
        // Select SmallShipType
        System.out.println("You have selected the small ship type.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void chooseMediumShipType() {
        // Select MediumShipType
        System.out.println("You have selected the medium ship type.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void chooseLargeShipType() {
        // Select LargeShipType
        System.out.println("You have selected the large ship type.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void resetShipOptions() {
        // reset ship type
    }

    private void previousMenu() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }
}