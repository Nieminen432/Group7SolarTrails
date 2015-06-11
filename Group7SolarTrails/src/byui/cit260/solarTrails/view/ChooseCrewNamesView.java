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
public class ChooseCrewNamesView {

   private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\nA - Abby"
            + "\nB - Bob"
            + "\nC - Charles"
            + "\nE - Esther"
            + "\nF - Frank"
            + "\nG - Greg"
            + "\nH - Hank"
            + "\nI - Irene"
            + "\nJ - Joe"
            + "\nK - Katherine"
            + "\nL - Linda"
            + "\nR - Reset the names you have picked."
            + "\nD - When you are Done, go back and continue to prepare for your trip."
            + "\n------------------------------------";

    void displayMenu() {
            
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        
        } while (selection != 'D'); // a selection that is not "Back"
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
            case 'A': // create and start a new game
                this.chooseAbby();
                break;
            case 'B': // get and start an existing game
                this.chooseBob();
                break;
            case 'C': // get and start an existing game
                this.chooseCharles();
                break;
            case 'E': // create and start a new game
                this.chooseEsther();
                break;
            case 'F': // get and start an existing game
                this.chooseFrank();
                break;
            case 'G': // get and start an existing game
                this.chooseGreg();
                break;
            case 'H': // create and start a new game
                this.chooseHank();
                break;
            case 'I': // get and start an existing game
                this.chooseIrene();
                break;
            case 'J': // get and start an existing game
                this.chooseJoe();
                break;
            case 'K': // create and start a new game
                this.chooseKatherine();
                break;
            case 'L': // get and start an existing game
                this.chooseLinda();
                break;
            case 'R': // display the help menu
                this.resetCrewNames();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
}

    private void chooseAbby() {
        // choose Abby as a crew member name
    }

    private void chooseBob() {
        // choose Bob as a crew member name
    }

    private void chooseCharles() {
        // choose Charles as a crew member name
    }

    private void chooseEsther() {
        // choose Esther as a crew member name
    }

    private void chooseFrank() {
        // choose Frank as a crew member name
    }

    private void chooseGreg() {
        // choose Greg as a crew member name
    }

    private void chooseHank() {
        // choose Hank as a crew member name
    }

    private void chooseIrene() {
        // choose Irene as a crew member name
    }

    private void chooseJoe() {
        // choose Joe as a crew member name
    }

    private void chooseKatherine() {
        // choose Katherine as a crew member name
    }

    private void chooseLinda() {
        // choose Linda as a crew member name
    }

    private void resetCrewNames() {
        // reset crew names picked
    }

    private void previousMenu() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.displayMenu();
    }
}