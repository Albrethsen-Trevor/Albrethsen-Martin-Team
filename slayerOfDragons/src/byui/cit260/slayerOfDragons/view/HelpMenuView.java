/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import java.util.Scanner;

/**
 *
 * @author trevoralbrethsen
 */
public class HelpMenuView extends View{
    public HelpMenuView (){
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Help Menu                                |"
            + "\n--------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nE - Estimating the amount of resources"
            + "\nH - Harvesting resources"
            + "\nD - Delivering resources to shop "
            + "\nQ - Quit"
            + "\n--------------------------------------------");
        }
    
     

    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G': // display goal of the game
                this.goalOfTheGame();
                break;
            case 'M': // how to move
                this.howToMove();
                break;
            case 'E': // estimate the amount of resources
                this.amountOfResources();
                break;
            case 'H': // display the harvesting resources
                this.harvestingResources();
                break;
            case 'D': // deliver resources to shop
                this.deliverResourcesToShop();
                break;
            case 'Q': // Quit the help menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfTheGame() {
        System.out.println("*** goalOfTheGame function called ***");
    }

    private void howToMove() {
        System.out.println("*** howToMove function called ***");
    }

    private void amountOfResources() {
        System.out.println("*** amountOfResources function called ***");
    }

    private void harvestingResources() {
        // System.out.println("*** harvestingResources function called ***");
        
        HarvestingResourcesView harvestingResources = new HarvestingResourcesView();
        harvestingResources.display();
    }

    private void deliverResourcesToShop() {
        System.out.println("*** deliverResourceToShop function called ***");
    }
    
}
