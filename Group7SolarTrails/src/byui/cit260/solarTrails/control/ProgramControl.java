/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.Player;
import group7solartrails.Group7SolarTrails;

/**
 *
 * @author Hiatt-Adam
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Group7SolarTrails.setPlayer(player); // save the player
        
        return player;
    }
}
