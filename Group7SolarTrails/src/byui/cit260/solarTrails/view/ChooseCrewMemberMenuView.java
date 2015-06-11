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
public class ChooseCrewMemberMenuView {
    
   private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\nA - Pick the amount of crew members you will take. "
            + "\n    Up to 3 for small ship, 6 for medium ship, 9 for large ship."
            + "\n    More team members means a higher percentage of research done each attempt"
            + "\n    but fewer members means a higher score for the research done."
            + "\n\nN - Choose the names of your crew members."
            + "\nS - Choose the Research Specialization for each crew member."
            + "\nR - Reset your crew and start over."
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
                this.chooseCrewSize();
                break;
            case 'N': // get and start an existing game
                this.chooseCrewNames();
                break;
            case 'S': // get and start an existing game
                this.chooseCrewResearchSpec();
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

    private void chooseCrewSize() {
        ChooseCrewSizeView chooseCrewSize = new ChooseCrewSizeView();
        chooseCrewSize.displayMenu();
    }

    private void chooseCrewNames() {
        ChooseCrewNamesView chooseCrewNames = new ChooseCrewNamesView();
        chooseCrewNames.displayMenu();
    }

    private void chooseCrewResearchSpec() {
        ChooseCrewResearchSpecMenuView chooseCrewResearchSpec = new ChooseCrewResearchSpecMenuView();
        chooseCrewResearchSpec.displayMenu();  
    }

    private void resetCrewOptions() {
        // reset crew options 
    }

    private void previousMenu() {
        NewGameMenuView newGame = new NewGameMenuView();
        newGame.displayMenu();
    }
}