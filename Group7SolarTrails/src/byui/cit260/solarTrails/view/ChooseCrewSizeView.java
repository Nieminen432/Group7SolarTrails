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
public class ChooseCrewSizeView {

private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\n1 - Only you will take this trip. This provides the highest amount of points but is also more dangerous."
            + "\n2 - You and one other will take this trip."
            + "\n3 - You and two others will take this trip. This is the maximum size for a small ship size."
            + "\n4 - You and three others will take this trip."
            + "\n5 - You and four others will take this trip."
            + "\n6 - You and five others will take this trip. This is the maximum size for a medium ship size."
            + "\n7 - You and six others will take this trip."
            + "\n8 - You and seven others will take this trip."
            + "\n9 - You and eight others will take this trip. This is the maximum size for a large ship size."
            + "\nR - Reset currently selected ship options"
            + "\nB - Go Back to the previous menu"
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
            case '1': // create and start a new game
                this.crewSizeOne();
                break;
            case '2': // get and start an existing game
                this.crewSizeTwo();
                break;
            case '3': // get and start an existing game
                this.crewSizeThree();
                break;
            case '4': // get and start an existing game
                this.crewSizeFour();
                break;
            case '5': // get and start an existing game
                this.crewSizeFive();
                break;
            case '6': // get and start an existing game
                this.crewSizeSix();
                break;
            case '7': // get and start an existing game
                this.crewSizeSeven();
                break;
            case '8': // get and start an existing game
                this.crewSizeEight();
                break;
            case '9': // get and start an existing game
                this.crewSizeNine();
                break;
            case 'R': // display the help menu
                this.resetCrewOptions();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

    }

    
}

    private void crewSizeOne() {
        // Going it alone
        System.out.println("You have decided to go alone.");
    }

    private void crewSizeTwo() {
        // You and one other
        System.out.println("You and one other will take this trip.");
    }

    private void crewSizeThree() {
        // Going it alone
        System.out.println("You and two others will take this trip.");
    }

    private void crewSizeFour() {
        // Going it alone
        System.out.println("You and three others will take this trip.");
    }

    private void crewSizeFive() {
        // Going it alone
        System.out.println("You and four others will take this trip.");
    }

    private void crewSizeSix() {
        // Going it alone
        System.out.println("You and five others will take this trip.");
    }

    private void crewSizeSeven() {
        // Going it alone
        System.out.println("You and six others will take this trip.");
    }

    private void crewSizeEight() {
        // Going it alone
        System.out.println("You and seven others will take this trip.");
    }

    private void crewSizeNine() {
        // Going it alone
        System.out.println("You and eight others will take this trip.");
    }

    private void resetCrewOptions() {
        // reset crew options
    }

    private void previousMenu() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.displayMenu();
    }
}