/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

/**
 *
 * @author Hiatt-Adam
 */
public class harvestResource {
    
    public int resourceGathered (int amountRemaining, int amountGathered, int shipType, int currentInventory)  {
        
        if (amountRemaining < 0 || amountRemaining > 2000)
		return -1;
	if (amountGathered <= 0)
		return -1;
	if (shipType <=0 || shipType > 3)
		return -1;
        if (currentInventory <= 0)
            return -1;
        
        int inventoryRemaining = ((shipType * 10000) - currentInventory) - amountGathered;
	
        return inventoryRemaining;
        
    }
}
