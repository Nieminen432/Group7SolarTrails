/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;
import byui.cit260.solarTrails.model.*;

/**
 *
 * @author Joseph
 */
public class SynthesizerControl {
    int senthesizeItem(int reqMats, int itemType, int quantity) {
        if (reqMats < 0 || reqMats > 1000) {
            return -1;
        }
        if (itemType < 1 || itemType > 30) {
            return -1;
        }
        if (quantity < 1 || quantity > 100) {
            return -1;
        }
        
        /* for (int i = 1; i <= quantity && adequateMaterialsRemaining(reqMats, itemType) == true; i++) {
            Inventory.minerals -= reqMats * (1 + ItemSynthesizer.getStateOfRepair());
            Add to inventory
            ItemSynthesizer.setStateOfRepair();
        }*/
        return 0;
    }
}
