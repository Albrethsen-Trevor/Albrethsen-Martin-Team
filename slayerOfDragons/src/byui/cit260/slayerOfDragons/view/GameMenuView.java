/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

/**
 *
 * @author trevoralbrethsen
 */
public class GameMenuView {
    
    void displayMenu() {
        System.out.println("\n*** displayMenu stub function called ***");
    }
    
    public void doAction(char selection) {
        switch (selection) {
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
        private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameContorl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t     " +
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
