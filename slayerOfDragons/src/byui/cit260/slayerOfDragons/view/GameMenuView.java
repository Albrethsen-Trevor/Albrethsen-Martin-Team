/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.control.GameControl;
import byui.cit260.slayerOfDragons.control.MapControl;
import byui.cit260.slayerOfDragons.model.InventoryItem;

/**
 *
 * @author trevoralbrethsen
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
            + "\n--------------------------------------"
            + "\n| Game Menu                          |"
            + "\n--------------------------------------"
            + "\nV - Display Map and Set Location"
            + "\nI - View list of items in inventory"
            + "\nA - View list of actors"
            + "\nH - View horse's stats"
            + "\nQ - Quit the Game Menu"
            + "\n--------------------------------------");
    }
    
    void displayMenu() {
        System.out.println("\n*** displayMenu stub function called ***");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
    
        switch (choice) {
            case 'V': // Travel to new location
                this.displayMap();
                break;
            case 'I': // View list of items in inventory
                this.viewInventory();
                break;
            case 'A': // View list of actors
                this.viewActors();
                break;
            case 'H': // View the horse's status
                this.viewHorseStatus();
                break;
            case 'Q': // Quit the help menu
                
            default:
                ErrorView.display("GameMenuView",
                                  "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
        private void displayMap() {
        
        // prompt to display map
        System.out.println("\n\nDisplay map");
        
        String filePath = this.getInput();
        
        try {
            // show map
            MapControl.createMap();
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        
    }
    
    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getInventoryType() + "\t     " +
                               inventoryItem.getRequiredAmount() + "\t     " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewHorseStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
