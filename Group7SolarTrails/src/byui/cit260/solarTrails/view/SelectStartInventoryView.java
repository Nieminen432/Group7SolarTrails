/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.exceptions.GeneralViewExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiatt-Adam
 */
public class SelectStartInventoryView extends View{

    public SelectStartInventoryView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n | Select starting food"
            + "\n----------------------------------------------"
            + "\nF - Select your starting amount of food."
            + "\nM - Select your starting amount of minerals."
            + "\nH - Select your starting amount of medicine."
            + "\nP - Select your starting amount of parts."
            + "\nD - Done"
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        try {
            String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
            
            switch (choice) {
                case 'F':
                    this.chooseStartingFood();
                    break;
                case 'M':
                    this.chooseStartingMinerals();
                    break;
                case 'H':
                    this.chooseStartingMedicine();
                    break;
                case 'P':
                    this.chooseStartingParts();
                    break;
                case 'D':
                    this.previousMenu();
                    break;
                default:
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;
                    
            } throw new GeneralViewExceptions ("You must make a selection");
        } catch (GeneralViewExceptions ex) {
            Logger.getLogger(SelectStartInventoryView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

        private void chooseStartingFood() {
            SelectStartFoodView foodView = new SelectStartFoodView();
            foodView.display();
        }

        private void chooseStartingMinerals() {
            // SelectStartMineralsView
        }

        private void chooseStartingMedicine() {
            // SelectStartMedicineView
        }

        private void chooseStartingParts() {
            // SelectStartPartsView
        }

        private void chooseStartingFuel() {
            // SelectStartPartsView
        }

        private void previousMenu() {
            NewGameMenuView newGameMenu = new NewGameMenuView();
            newGameMenu.display();
        }
}
