/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.view.NewGameMenuView;
import group7solartrails.Group7SolarTrails;
import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Main Menu                       "
            + "\n-----------------------------------"
            + "\nN - New Game"
            + "\nH - Get help on how to play the game"
            + "\nL - Load Game"
            + "\nE - Exit"
            + "\n-----------------------------------";
    

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        
        } while (selection != 'E'); // a selection that is not "Exit"
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'L': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'E': // Exist the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Group7SolarTrails.getPlayer());
                
        // display the game menu
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.displayMenu();        
    }

    private void startExistingGame() {
        // Load existing game
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
    
}
