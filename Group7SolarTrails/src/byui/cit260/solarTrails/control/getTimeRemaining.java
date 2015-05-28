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
public class getTimeRemaining {
    
    public double timeOfObjectRemaining(double speed, double distance) {
    
        if (speed > 881000 || speed < 0) { //speed faster than speed of light or negative?
            return -1;
    }
        if (distance < 0 || distance > 107) { //distance negative or greater than total distance?
            return -1;
    }
        
    double timeToUranus = ((distance * 92956229.4)/ (speed * 761))/24;
    
    return timeToUranus;
            
}
            
    
}
