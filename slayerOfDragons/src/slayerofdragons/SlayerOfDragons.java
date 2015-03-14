/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayerofdragons;

import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Player;
import byui.cit260.slayerOfDragons.view.StartProgramView;







/**
 *
 * @author ianmartin
 */
public class SlayerOfDragons {
    
    private static Game currentGame = null;
    private static Player player = null;
    public static Player getPlayer;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SlayerOfDragons.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SlayerOfDragons.player = player;
    }
    
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
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
    
    private static Scene[] createScenes() throws MapControlException {
        BufferedImage image = null;
        
        Game game = SlayerOfDragons.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "\nDescription coming soon!");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        ImageIcon startingSceneImage = MapControl.getImage(startingScene,
                "Image coming soon!");
        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                  "\nCongratulations! You apparently beat the game! You're the"
                + "best there ever wasn't!!");
        finshScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finish.setTravelTime(Double.POSITIVE_INFINITY);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
                "Image coming soon!");
            finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
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