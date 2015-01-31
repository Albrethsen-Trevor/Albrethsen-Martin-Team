/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayerofdragons;

import byui.cit260.slayerOfDragons.model.BossScene;
import byui.cit260.slayerOfDragons.model.Location;
import byui.cit260.slayerOfDragons.model.ObstacleScene;
import byui.cit260.slayerOfDragons.model.Player;
import byui.cit260.slayerOfDragons.model.RegularScene;
import byui.cit260.slayerOfDragons.model.ResourceScene;
import byui.cit260.slayerOfDragons.model.SceneLocation;
import byui.cit260.slayerOfDragons.model.ShopScene;



/**
 *
 * @author ianmartin
 */
public class SlayerOfDragons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Trevor Coach");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Location locationOne = new Location();
        
        locationOne.setCoordinates("Mountain");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        SceneLocation sceneLocationOne = new SceneLocation();
        
        sceneLocationOne.setVisited("Special");
        sceneLocationOne.setAmountRemaining(20.00);
        
        String sceneLocationInfo = sceneLocationOne.toString();
        System.out.println(sceneLocationInfo);
        
        ResourceScene resourceSceneOne = new ResourceScene();
        
        resourceSceneOne.setType("weapon");
        resourceSceneOne.setDescription("to attack");
        resourceSceneOne.setSymbol("Sword");
        resourceSceneOne.setTravelTime(23.00);
        resourceSceneOne.setAmount(3.00);
        
        String resourceSceneInfo = resourceSceneOne.toString();
        System.out.println(resourceSceneInfo);
        
        RegularScene regularSceneOne = new RegularScene();
        
        regularSceneOne.setType("Cut Scene 1");
        regularSceneOne.setDescription("Characters speaking");
        regularSceneOne.setTravelTime(41.00);
        regularSceneOne.setBlocked("Cannot Access");
        
        String regularSceneInfo = regularSceneOne.toString();
        System.out.println(regularSceneInfo);
        
        ObstacleScene obstacleSceneOne = new ObstacleScene();
        
        obstacleSceneOne.setType("Random Encounter");
        obstacleSceneOne.setDescription("Encounter Random Enemy on Map");
        obstacleSceneOne.setSymbol("TBD");
        obstacleSceneOne.setTravelTime(17.00);
        obstacleSceneOne.setBlocked("Cannot Access");
        
        String obstacleSceneInfo = obstacleSceneOne.toString();
        System.out.println(obstacleSceneInfo);
        
        ShopScene shopSceneOne = new ShopScene();
        
        shopSceneOne.setType("Weapons Shop");
        shopSceneOne.setDescription("Weapons Sold Here");
        shopSceneOne.setSymbol("Sword and Arrows");
        shopSceneOne.setCapacity(12.00);
        
        String shopSceneInfo = shopSceneOne.toString();
        System.out.println(shopSceneInfo);
        
        BossScene bossSceneOne = new BossScene();
        
        bossSceneOne.setType("Boss 1");
        bossSceneOne.setDescription("First Boss Fight");
        bossSceneOne.setSymbol("Boss Symbol");
        bossSceneOne.setTravelTime(80.00);
        
        String bossSceneInfo = bossSceneOne.toString();
        System.out.println(bossSceneInfo);
        
        
        
    }
    
}
