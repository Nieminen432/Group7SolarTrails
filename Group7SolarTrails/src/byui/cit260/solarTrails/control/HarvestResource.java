/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.HarvestResourceException;

/**
 *
 * @author Hiatt-Adam
 */
public class HarvestResource {
    
    public static int resourceGathered (int amountRemaining, int amountGathered, int shipType, int currentInventory) 
            throws HarvestResourceException  {
        
        if (amountRemaining < 0 )
		throw new HarvestResourceException("There are no more resources left here.");
        if (amountRemaining > 1000)
                throw new HarvestResourceException("This resource plot cannot possibly exist.");
	if (amountGathered <= 0)
		throw new HarvestResourceException("No resources have been gathered from here.");
	if (shipType <=0 || shipType > 3)
		throw new HarvestResourceException("Ship Type does not exist.");
        if (currentInventory < 0)
                throw new HarvestResourceException("Cannot have negative resources.");
        if (currentInventory == 0)
                throw new HarvestResourceException("Your inventory is empty! You have no supplies to continue your trip!");
        
        int inventoryRemaining = ((shipType * 10000) - currentInventory) - amountGathered;
	
        return inventoryRemaining;
        
    }
}
