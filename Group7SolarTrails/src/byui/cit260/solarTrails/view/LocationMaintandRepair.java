/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

/**
 *
 * @author Nixon-Joseph
 */
public class LocationMaintandRepair {
       void startAlienObjectMenu() {
        this.displayMenu();
    }
    
    private final String MENU = "\n"
        + "\n-----------------------------------"
        + "\n | Maintenance menu"
        + "\n | Please select an option."
        + "\n-----------------------------------"
        + "\nS - Ship"
        + "\nE - Engine"
        + "\nY - Synthesizer"
        + "\nB - Back"
        + "\n-----------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        System.out.println(MENU); // display the new game menu

        String input = this.getInput(); // get the user's selection
        selection = input.charAt(0); // get first character of string

        this.doAction(selection); // do action based on selection
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
            case 'S': // Research Object
                this.chooseShip();
                break;
            case 'E': // Leave Object
                this.chooseEngine();
                break;
            case 'Y': // Research Object
                this.chooseSynthesizer();
                break;
            case 'B': // Leave Object
                this.chooseBack();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                getInput();
                break;
        }
    }

    private void chooseShip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseSynthesizer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
