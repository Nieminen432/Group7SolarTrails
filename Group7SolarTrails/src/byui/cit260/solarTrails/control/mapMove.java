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
public class mapMove {
    
    public double moveShip (int currentLocation, int destinationLocation, double fuelRemaining) {
        
        if (currentLocation <= 0 || currentLocation > 9)
		return -1;
	if (destinationLocation <= 0 || destinationLocation > 9)
		return -1;
	if (destinationLocation == currentLocation)
		return -1;
	if (fuelRemaining <= 0 || fuelRemaining > 10000)
		return -1;
        
        double timeToLocation = (currentLocation * destinationLocation * 10) * (destinationLocation - currentLocation);

        return timeToLocation;
    }
}
