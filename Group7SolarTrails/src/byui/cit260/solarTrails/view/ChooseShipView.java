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
public class ChooseShipView {
    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Customize your ship"
            + "\n-----------------------------------"
            + "\nS - Choose Ship Type"
            + "\nE - Choose Engine Type"
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
                this.chooseShipType();
                break;
            case 'E': // get and start an existing game
                this.chooseEngineType();
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

    private void chooseShipType() {
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.displayMenu();
    }

    private void chooseEngineType() {
        ChooseEngineTypeView chooseEngine = new ChooseEngineTypeView();
        chooseEngine.displayMenu();
    }

    private void resetShipOptions() {
        // Clear the ship type and engine type and select them again
    }

    private void previousMenu() {
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.displayMenu(); 
    }
    
}
