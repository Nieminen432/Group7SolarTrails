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
public class NewGameMenuView {
    
    private final String MENU = "\n"
        + "\n-----------------------------------"
        + "\n | New Game Menu                       "
        + "\n | Please select an option from each menu below."
        + "\n | If you do not select an option, a random option will be assigned to you."
        + "\n-----------------------------------"
        + "\nS - Choose your ship"
        + "\nR - Choose your Research Specialization"
        + "\nC - Choose crew members and their specializations"
        + "\nI - Choose your starting inventory (food, medicine, minerals)"
        + "\nM - Return to the main menu"
        + "\nP - Select P when you are ready to play!"
        + "\n-----------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the new game menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != 'P'); // while selection is not Play
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
            case 'S': // choose the ship
                this.chooseYourShip();
                break;
            case 'R': // get and start an existing game
                this.chooseResearchSpecialization();
                break;
            case 'C': // choose number of crew members and specializations
                this.chooseCrewAndSpecialty();
                break;
            case 'I': // choose how much food you will start with
                this.chooseStartingInventory();
                break;
            case 'M': // back to the main menu
                this.chooseMainMenu();
                break;                
            case 'P': // Begin the game
                this.choosePlayGame();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void chooseYourShip() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.displayMenu();
    }

    private void chooseResearchSpecialization() {
        ChooseResearchSpecializationMenuView chooseResearchSpec = new ChooseResearchSpecializationMenuView();
        chooseResearchSpec.displayMenu();        
    }

    private void chooseCrewAndSpecialty() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.displayMenu();
    }
    
    private void chooseMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu(); 
    }
    private void chooseStartingInventory() {
        SelectStartInventoryView selectStartInv = new SelectStartInventoryView();
        selectStartInv.displayMenu();
    }

    private void choosePlayGame() {
        // starts a new game
    }
}
    

