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
public class HarvestingResourcesView extends View {
    public HarvestingResourcesView () {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Harvesting Resources Menu                |"
            + "\n--------------------------------------------"
            + "\nR - What resources can be harvested?"
            + "\nL - Is there a limit to how much can harvest"
            + "\nW - Where can I harvest resources?"
            + "\nB - Do I need to harvest to beat the game?"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'R': //display what resources can be harvested
                this.whatResources();
                break;
            case 'L': //display if there is a limit that can be harvested
                this.limitOfHarvest();
                break;
            case 'W': //display where resources can be harvested
                this.whereResources();
                break;
            case 'B': //display if harvesting is needed to beat game
                this.harvestToBeatGame();
                break;
            case 'Q': // quit the harvesting resource menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
        
    }

    private void whatResources() {
        System.out.println("*** whatResources function called ***");
    }

    private void limitOfHarvest() {
        System.out.println("*** limitOfHarvest function called ***");
    }

    private void whereResources() {
        System.out.println("*** whereResources function called ***");
    }

    private void harvestToBeatGame() {
        System.out.println("*** harvestToBeatGame function called ***");
    }
    
}
