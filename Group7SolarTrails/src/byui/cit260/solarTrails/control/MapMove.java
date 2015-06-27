/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.control.Scene.SceneType;
import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;

/**
 *
 * @author Hiatt-Adam
 */
public class MapMove {

    public static Map createMap() {
        Map map = new Map();
        
        Scene[] scenes = Scene.createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveShipToStartingPoint() {
        //move ship
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[] locations = map.getPlanets();
        
        locations[0].setScene(scenes[SceneType.start.ordinal()]);
        locations[1].setScene(scenes[SceneType.research.ordinal()]);
        locations[2].setScene(scenes[SceneType.random.ordinal()]);
        locations[3].setScene(scenes[SceneType.object.ordinal()]);
        locations[4].setScene(scenes[SceneType.location.ordinal()]);
    }
    
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
