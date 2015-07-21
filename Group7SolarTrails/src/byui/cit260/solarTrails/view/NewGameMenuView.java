/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import static group7solartrails.Group7SolarTrails.getEngine;
import static group7solartrails.Group7SolarTrails.getShip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class NewGameMenuView extends View{
    public NewGameMenuView() {
        super("\n"
        + "\n-----------------------------------"
        + "\n | New Game Menu"
        + "\n | Please select an option from each menu below."
        + "\n | If you do not select an option, a random option will be assigned to you."
        + "\n-----------------------------------"
        + "\nS - Choose your ship"
        + "\nC - Choose your crew members, their names, and their specializations"
        + "\nI - Choose your starting inventory (food, medicine, minerals)"
        + "\nH - View the Help Menu"
        + "\nD - Display your current selections"
        + "\nM - Return to the main menu"
        + "\nP - Select P when you are ready to play!"
        + "\n-----------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'S': // choose the ship
                this.chooseYourShip();
                break;
            case 'C': // choose number of crew members and specializations
                this.chooseCrewAndSpecialty();
                break;
            case 'I': // choose how much food you will start with
                this.chooseStartingInventory();
                break;
            case 'M': // Back to the Main Menu
                this.chooseMainMenu();
                break;                
            case 'P': // Begin the game
                this.choosePlayGame();
                break;
            case 'H': // Display Help Menu
                this.chooseHelpMenu();
                break;
            case 'D': // Display current selections
                this.displayStats();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void chooseYourShip() {
        ChooseShipSizeView chooseShipSize = new ChooseShipSizeView();
        chooseShipSize.display();
    }

    private void chooseCrewAndSpecialty() {
        ChooseCrewSizeView chooseCrewSize = new ChooseCrewSizeView();
        chooseCrewSize.display();
    }
    
    private void chooseMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display(); 
    }
    private void chooseStartingInventory() {
        SelectStartInventoryView selectStartInv = new SelectStartInventoryView();
        selectStartInv.display();
    }
    
    private void chooseHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayStats() {
        this.console.println("\nYour current ship selections are:"
                            + "\nShip Type: " + getShip().getDescription()
                            + "\nInventory Allowed: " + getShip().getMaxInventory()
                            + "\nMax Crew: " + getShip().getMaxCrew()
                            + "\nCrew On Board: " + getShip().getNoCrew()
                            + "\nEngine Type: " + getEngine().getDescription()
                            
                            //+ "\n" + getEngine()
        );
        this.console.println("\n\nYour crew and research specs are:");
        
        try {
        this.console.println("\n------------------------"
                           + "\nPress Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                
        } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    private void choosePlayGame() {
        // starts a new game
    }

    private String getCrew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

} 
    

