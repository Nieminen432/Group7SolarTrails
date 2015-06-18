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
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Main Menu                       "
            + "\n-----------------------------------"
            + "\nN - New Game"
            + "\nH - Get help on how to play the game"
            + "\nL - Load Game"
            + "\nE - Exit"
            + "\n-----------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'L': // get and start an existing game
                this.startExistingGameMenu();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'E': // Exit the program
                this.exitProgram();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        } return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Group7SolarTrails.getPlayer());
                
        // display the game menu
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();        
    }

    private void startExistingGameMenu() {
        // Load existing game
        // StartExistingGameMenu existingGame  = new StartExistingGameMenu();
        // existingGame.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void exitProgram() {
        // Exit Program
    }
    
}
