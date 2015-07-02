/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;
import byui.cit260.solarTrails.exceptions.SynthesizerControlException;
import byui.cit260.solarTrails.model.*;

/**
 *
 * @author Joseph
 */
public class SynthesizerControl {int senthesizeItem(int reqMats, int itemType, int quantity) 
            throws SynthesizerControlException {
        if (reqMats < 0) {
            throw new SynthesizerControlException("You do not have any of the required materials.");
        }
        if (reqMats > 1000) {
            throw new SynthesizerControlException("Too many materials are in the Synthesizer.");
        }
        if (itemType < 1 || itemType > 5) {
            throw new SynthesizerControlException("No such item.");
        }
        if (quantity < 1) {
            throw new SynthesizerControlException("You must create at least 1 item.");
        }
        if (quantity > 100) {
            throw new SynthesizerControlException("The synthesizer cannot make more than 100 items at a time.");
        }
        
        /* for (int i = 1; i <= quantity && adequateMaterialsRemaining(reqMats, itemType) == true; i++) {
            Inventory.minerals -= reqMats * (1 + ItemSynthesizer.getStateOfRepair());
            Add to inventory
            ItemSynthesizer.setStateOfRepair();
        }*/
        return 0;
    }
}
