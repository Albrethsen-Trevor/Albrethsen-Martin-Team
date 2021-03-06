/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import byui.cit260.slayerOfDragons.model.Constants;
import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Horse;
import byui.cit260.slayerOfDragons.model.InventoryItem;
import byui.cit260.slayerOfDragons.model.Map;
import byui.cit260.slayerOfDragons.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import slayerofdragons.SlayerOfDragons;

/**
 *
 * @author trevoralbrethsen
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        SlayerOfDragons.setCurrentGame(game); // save in SlayerOfDragons
        
        game.setPlayer(player); // save the player in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Horse horse = new Horse(); // create new horse
        game.setHorse(horse); // save horse in game
        
        Map map = MapControl.createMap(); // create and initliaze new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static void saveGame(Game currentGame, String filepath)
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); // write the game object out to file

        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    
    public static void getSavedGame(String filepath)
                        throws GameControlException {
        Game currentGame = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            currentGame = (Game) output.readObject(); // read the game object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        SlayerOfDragons.setCurrentGame(currentGame); // save in SlayerOfDragons
    }
    
    
    public enum Item {
        sword,
        shield,
        gold,
        iron;
    }
    
    public static InventoryItem[] createInventoryList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory =
            new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem sword = new InventoryItem();
        sword.setInventoryType("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem shield = new InventoryItem();
        shield.setInventoryType("Shield");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(0);
        inventory[Item.shield.ordinal()] = shield;
        
        InventoryItem gold = new InventoryItem();
        gold.setInventoryType("Gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        inventory[Item.gold.ordinal()] = gold;
        
        InventoryItem iron = new InventoryItem();
        iron.setInventoryType("Iron");
        iron.setQuantityInStock(0);
        iron.setRequiredAmount(0);
        inventory[Item.iron.ordinal()] = iron;
        
        return inventory;
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        
        // get inventory list for the current game
        InventoryItem[] originalInventoryList =
                SlayerOfDragons.getCurrentGame().getInventory();
        
        // clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getInventoryType().
                        compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }
    
    public static int getBossMaxHealth(int health) {
        // call starting health points of boss
//        double volume = GameControl.calcBossTotalHealth(health);
        // if the health is valid
//        int maxValue = health;
        // for index = 1 TO  health.index -1
//                if  (health[index]) > maxValue);
//                    maxValue = list[index];
//                if else
//                    maxValue = -1;
//                for index = -1;
        return 0;
    }
    
    
}
