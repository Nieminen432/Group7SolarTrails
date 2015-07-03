/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.SceneException;
import byui.cit260.solarTrails.model.Game;
import group7solartrails.Group7SolarTrails;

/**
 *
 * @author Joseph
 */
public class Scene {

    private void setTravelTime(int i) {
        //Set TravelTime
    }

    private void setDescription(String string) {
        //Set Desc
    }
    
    public enum SceneType {
        start,
        location,
        random,
        research,
        object;
    }
    
    public static Scene[] createScenes() throws SceneException {
        Game game = Group7SolarTrails.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("\nYou have started!");
        startingScene.setTravelTime(30);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene locationScene = new Scene();
        locationScene.setDescription("\nYou have made it somewhere!");
        locationScene.setTravelTime(30);
        scenes[SceneType.location.ordinal()] = locationScene;
        
        Scene randomScene = new Scene();
        randomScene.setDescription("\nYou have encountered something random!");
        randomScene.setTravelTime(30);
        scenes[SceneType.random.ordinal()] = randomScene;
        
        Scene researchScene = new Scene();
        researchScene.setDescription("\nYou have researched something!");
        researchScene.setTravelTime(30);
        scenes[SceneType.research.ordinal()] = researchScene;
        
        Scene objectScene = new Scene();
        objectScene.setDescription("\nYou have made it to the object!");
        objectScene.setTravelTime(30);
        scenes[SceneType.object.ordinal()] = objectScene;
        
        return scenes;
    }
}
