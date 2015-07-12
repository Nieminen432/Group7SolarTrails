/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.exceptions.GeneralViewExceptions;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseShipView extends View{
    public ChooseShipView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Customize your ship"
            + "\n-----------------------------------"
            + "\nS - Choose Ship Type"
            + "\nE - Choose Engine Type"
            + "\nR - Reset currently selected ship options"
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }

        @Override
        public boolean doAction(Object obj) {
        try {
            String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
            
            switch (choice) {
                case 'S': // create and start a new game
                    this.chooseShipType();
                    break;
                case 'E': // get and start an existing game
                    this.chooseEngineType();
                    break;
                case 'R': // display the help menu
                    this.resetShipOptions();
                    break;
                case 'D': // Exit the program
                    this.previousMenu();
                    break;
                default:
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;
                    
            } throw new GeneralViewExceptions("Please make a valid selection.");
        } catch (GeneralViewExceptions e) {
            this.console.println(e.getMessage ());
        }
        return false;
    }

    private void chooseShipType() {
        ChooseShipSizeView chooseShip = new ChooseShipSizeView();
        chooseShip.display();
    }

    private void chooseEngineType() {
        ChooseEngineTypeView chooseEngine = new ChooseEngineTypeView();
        chooseEngine.display();
    }

    private void resetShipOptions() {
        // Clear the ship type and engine type and select them again
    }

    private void previousMenu() {
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display(); 
    }
    
}
