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
                this.deliveryOfResourcesToShop();
                break;
            case 'Q': // Quit the help menu
                
            default:
                ErrorView.display("HelpMenuView",
                                   "*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goalOfTheGame() {
        // prompt for and get the name of the file to show goal of the game in
        GoalOfTheGameView goalOfTheGame = new GoalOfTheGameView();
        goalOfTheGame.display();
    }

    private void howToMove() {
        HowToMoveView howToMove = new HowToMoveView();
        howToMove.display();
    }

    private void amountOfResources() {
        AmountOfResourcesView amountOfResources = new AmountOfResourcesView();
        amountOfResources.display();
    }

    private void harvestingResources() {
        // System.out.println("*** harvestingResources function called ***");
        
        HarvestingResourcesView harvestingResources = new HarvestingResourcesView();
        harvestingResources.display();
    }

    private void deliveryOfResourcesToShop() {
        DeliveryOfResourcesToShopView deliveryOfResourcesToShop = new DeliveryOfResourcesToShopView();
        deliveryOfResourcesToShop.display();
    }
    
}
