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
public class ChooseEngineTypeView {
    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Pick your ship type"
            + "\n-----------------------------------"
            + "\nS - This is the combustion engine. Its max speed is 20AU/hour."
            + "\n    This engine burns rocketfuel which can be harvested or synthesized. "
            + "\n    This engine is tried and tested and doesn't have many problems."
            + "\n\nM - This is the impulse engine. It's max speed is 60AU/hour"
            + "\n    This engine burns <SOMETHING?> which can be harvested or synthesized."
            + "\n    This engine has gone through extensive testing but still experiences breakdowns."
            + "\nL - This is the hyperdrive engine. It's max speed is 107AU/hour."
            + "\n    This engine runs on solar power and it is a very new technology that has a tendancy to breakdown."
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
            case 'C': // create and start a new game
                this.chooseCombustionEngine();
                break;
            case 'I': // get and start an existing game
                this.chooseImpulseEngine();
                break;
            case 'H': // get and start an existing game
                this.chooseHyperdriveEngine();
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

    private void chooseCombustionEngine() {
        // Select SmallShipType
        System.out.println("You have selected the Combustion Engine.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void chooseImpulseEngine() {
        // Select MediumShipType
        System.out.println("You have selected the Impulse Engine.");
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void chooseHyperdriveEngine() {
        // Select LargeShipType
        System.out.println("You have selected the Hyperdrive.");
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
