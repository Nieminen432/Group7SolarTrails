/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.exceptions.SceneException;
import group7solartrails.Group7SolarTrails;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            case 'N':
                try {
                    this.startNewGame();
                } catch (SceneException ex) {
                    ErrorView.display("MainMenuView", ex.getMessage());
                }
                break;
            case 'L': // get and start an existing game
                this.startExistingGameMenu();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'E': // Exit the program
                System.exit(0);
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
                
        } 
        return false;
    }

    private void startNewGame() throws SceneException {
        // create a new game
        GameControl.createNewGame(Group7SolarTrails.getPlayer());
                
        // display the game menu
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();        
    }

    private void startExistingGameMenu() {
        this.console.println("\n\nEnter the file path for the file where the game "
                            + "is to be loaded from.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.loadGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void exitProgram() {
        // Exit Program
    }
    
}
