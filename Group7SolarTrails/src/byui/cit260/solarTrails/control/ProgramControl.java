/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.ProgramControlException;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.Ship;
import group7solartrails.Group7SolarTrails;

/**
 *
 * @author Hiatt-Adam
 */
public class ProgramControl {

    public static Player createPlayer(String name) 
            throws ProgramControlException {
        if (name == null) {
            throw new ProgramControlException("A name must be entered.");
        }
        Player player = new Player();
        player.setName(name);
        
        Group7SolarTrails.setPlayer(player); // save the player
        
        return player;
    }
    
    public static Ship createShip(int maxCrew) 
            throws ProgramControlException { // set crew size
        
            throw new ProgramControlException("A ship must be used for this trip.");
    }
    
}
