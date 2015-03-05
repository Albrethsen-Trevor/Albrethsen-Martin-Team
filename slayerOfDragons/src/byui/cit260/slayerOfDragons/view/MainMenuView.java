/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.control.GameControl;
import java.util.Scanner;
import slayerofdragons.SlayerOfDragons;

/**
 *
 * @author trevoralbrethsen
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Main Menu                                |"
            + "\n--------------------------------------------"
            + "\nN - Start game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\nC - ContainerControlView"
            + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
        
        
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'C': // Access ContainerControlView
                this.accessContainer();
                break;
            case 'Q': // Exit the game
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
       }

    private void startNewGame() {
                // create a new game
        GameControl.createNewGame(SlayerOfDragons.getPlayer);
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        //System.out.println("*** startExistingGame function called ***");
        StartExistingGameView startExistingGameMenu = new StartExistingGameView();
        startExistingGameMenu.display();
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
        
    }

    private void displayHelpMenu() {
        // System.out.println("*** displayHelpMenu function called ***");
                
                // access help menu
        // HelpMenuView 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void accessContainer() {
        ContainerControlView startContainerControlView = new ContainerControlView();
        startContainerControlView.displayContainerControl();
    }
    
}
