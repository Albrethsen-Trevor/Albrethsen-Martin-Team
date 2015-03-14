/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Horse;
import byui.cit260.slayerOfDragons.model.InventoryItem;
import byui.cit260.slayerOfDragons.model.Player;
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
    
    public enum Item {
        sword,
        shield,
        gold,
        iron;
    }
    
    public static InventoryItem[] createInventoryList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory =
            new InventoryItem[Constaints.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem shield = new InventoryItem();
        shield.setDescription("Shield");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(0);
        inventory[Item.shield.ordinal()] = shield;
        
        InventoryItem gold = new InventoryItem();
        gold.setDescription("Gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        inventory[Item.gold.ordinal()] = gold;
        
        InventoryItem iron = new InventoryItem();
        iron.setDescription("Iron");
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
        InventoryItem[] inventoryList = orignalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }
    
}
