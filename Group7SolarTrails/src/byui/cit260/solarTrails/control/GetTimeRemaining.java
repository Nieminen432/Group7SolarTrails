/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.GetTimeRemainingException;
import byui.cit260.solarTrails.model.Map;
import group7solartrails.Group7SolarTrails;
import static java.lang.Math.abs;

/**
 *
 * @author Hiatt-Adam
 */
public class GetTimeRemaining {
    
    
    public double timeToUranus(double speed, double distance) 
            throws GetTimeRemainingException {

        try {
        if (speed > 20) { // speed faster than speed of light
            throw new GetTimeRemainingException("Ships cannot travel faster than the speed of light.");
        }        
        if (speed < 0) { // speed negative
            throw new GetTimeRemainingException("Ships cannot go a negative speed.");
        }
        if (distance > 136177.0) { // greater than total distance
            throw new GetTimeRemainingException("The distance is greater than that of the total distance to Uranus.");
        }
        if (distance < 0) { //distance negative
            throw new GetTimeRemainingException("Cannot have negative distance.");
        }
        
    double timeToUranus = abs(Map.PlanetDist.Mercury - Group7SolarTrails.getLocation().getCurrentLocation());
            
    
    return timeToUranus;
            
} catch (Exception oe){
    
} 
        return 0;
            
    }   
}