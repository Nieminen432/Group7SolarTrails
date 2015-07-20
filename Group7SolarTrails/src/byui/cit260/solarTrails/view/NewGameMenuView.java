/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

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
            case 'M': // back to the main menu
                this.chooseMainMenu();
                break;                
            case 'P': // Begin the game
                this.choosePlayGame();
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

    private void choosePlayGame() {
        // starts a new game
    }
}
    

