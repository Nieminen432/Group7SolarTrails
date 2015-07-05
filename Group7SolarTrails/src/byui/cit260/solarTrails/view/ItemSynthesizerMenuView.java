/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.exceptions.SynthesizerControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiatt-Adam
 */
public class ItemSynthesizerMenuView extends View{ // menu to synthesize items. List items to create.
    public ItemSynthesizerMenuView() {
    super("\n"
            + "\n---------------------------------------"
            + "\n | Synthesizer Menu - Choose an item to make"
            + "\n---------------------------------------"
            + "\nM - Medicine."
            + "\nF - Food."
            + "\nU - Fuel. "
            + "\nP - Parts."
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }
@Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'M': // create and start a new game
                this.chooseMakeMedicine();
                break;
            case 'F': // get and start an existing game
                this.chooseMakeFood();
                break;
            case 'U': // display the help menu
                this.chooseMakeFuel();
                break;
            case 'P': // Exit the program
                this.previousMakeFuel();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

    } return false;
    }static {

}

    private void chooseMakeMedicine() {
        try {
            /* Request amount to be made. Multiply that by minerals required and check amount against current inventory. If inventory is less than needed, throw error
            "Not enough minerals. Try a lesser amount or mine for more minerals."  If amount is adequate, subtract needed amount from inventory and add
            the amount of items to be created to the inventory.
            */
            throw new SynthesizerControlException("Not supported yet."); //Replace with try/catch when the formula needed and test it.
        } catch (SynthesizerControlException ex) {
            Logger.getLogger(ItemSynthesizerMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void chooseMakeFood() {
        try {
            /* Request amount to be made. Multiply that by minerals required and check amount against current inventory. If inventory is less than needed, throw error
            "Not enough minerals. Try a lesser amount or mine for more minerals."  If amount is adequate, subtract needed amount from inventory and add
            the amount of items to be created to the inventory.
            */
            throw new SynthesizerControlException("Not supported yet."); //Replace with try/catch when the formula needed and test it.
        } catch (SynthesizerControlException ex) {
            Logger.getLogger(ItemSynthesizerMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void chooseMakeFuel() {
        try {
            /* Request amount to be made. Multiply that by minerals required and check amount against current inventory. If inventory is less than needed, throw error
            "Not enough minerals. Try a lesser amount or mine for more minerals."  If amount is adequate, subtract needed amount from inventory and add
            the amount of items to be created to the inventory.
            */
            throw new SynthesizerControlException("Not supported yet."); //Replace with try/catch when the formula needed and test it.
        } catch (SynthesizerControlException ex) {
            Logger.getLogger(ItemSynthesizerMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void previousMakeFuel() {
        try {
            /* Request amount to be made. Multiply that by minerals required and check amount against current inventory. If inventory is less than needed, throw error
            "Not enough minerals. Try a lesser amount or mine for more minerals."  If amount is adequate, subtract needed amount from inventory and add
            the amount of items to be created to the inventory.
            */
            throw new SynthesizerControlException("Not supported yet."); //Replace with try/catch when the formula needed and test it.
        } catch (SynthesizerControlException ex) {
            Logger.getLogger(ItemSynthesizerMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void previousMenu() {
        try {
            /* Request amount to be made. Multiply that by minerals required and check amount against current inventory. If inventory is less than needed, throw error
            "Not enough minerals. Try a lesser amount or mine for more minerals."  If amount is adequate, subtract needed amount from inventory and add
            the amount of items to be created to the inventory.
            */
            throw new SynthesizerControlException("Not supported yet."); //Replace with try/catch when the formula needed and test it.
        } catch (SynthesizerControlException ex) {
            Logger.getLogger(ItemSynthesizerMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}