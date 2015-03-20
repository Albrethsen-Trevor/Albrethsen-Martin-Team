/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Location;
import byui.cit260.slayerOfDragons.model.Map;
import byui.cit260.slayerOfDragons.model.Scene;
import slayerofdragons.SlayerOfDragons;

/**
 *
 * @author trevoralbrethsen
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        MapControl.assignScenesToLocations(map, scenes);
        
        
        
        return map;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType {
        start,
        sword,
        shield,
        gold,
        iron,
        regular,
        resource,
        shop,
        finish;
    }
    
    private static Scene[] createScenes() {
        
        Game game = SlayerOfDragons.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "\nDescription coming soon!");
        startingScene.setSymbol(" ST ");
//        startingScene.setBlocked(false); talk to Ian about it
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                  "\nCongratulations! You apparently beat the game! You're the"
                + "best there ever wasn't!!");
        finishScene.setSymbol(" FN ");
//        finishScene.setBlocked(false); talk to Ian about it
        finishScene.setTravelTime(Double.POSITIVE_INFINITY); // talk to Ian
        scenes[SceneType.finish.ordinal()] = finishScene;
        return scenes;
    } 
    
    private static void assignScenesToLocation(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.regular.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.resource.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.shop.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.finish.ordinal()]);
    }
    
}
