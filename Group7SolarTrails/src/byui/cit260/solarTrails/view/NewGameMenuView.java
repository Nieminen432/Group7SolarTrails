/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
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
                            + "\nShip Type: " + Group7SolarTrails.getShip().getDescription()
                            + "\nInventory Allowed: " + Group7SolarTrails.getShip().getMaxInventory()
                            + "\nMax Crew: " + Group7SolarTrails.getShip().getMaxCrew()
                            + "\nCrew On Board: " + Group7SolarTrails.getShip().getNoCrew()
                            + "\nEngine Type: " + Group7SolarTrails.getEngine().getDescription());
        
        this.console.println("\n\nYour crew names and research specs are:");
        for (int i = 0; i < Group7SolarTrails.getShip().getNoCrew(); i++) {
            this.console.println("Crew member " + (i+1) + "'s name is " 
                                + Group7SolarTrails.crewList.get(i).getName() 
                                + " and their research specialization is "
                                + Group7SolarTrails.crewList.get(i).getSpecName());
        }
        
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
        BeginGame beginNewGame = new BeginGame();
        beginNewGame.display();
    }

    

} 
    

