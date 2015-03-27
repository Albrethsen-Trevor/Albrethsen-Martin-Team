/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.control.GameControl;
import byui.cit260.slayerOfDragons.exceptions.InventoryControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for the file where the game"
                           + "is to be saved");
        
        String filePath = this.getInput();
        
        try {
            // start game saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game"
                           + "is to be saved");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(SlayerOfDragons.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }

    private void displayHelpMenu() {
        // System.out.println("*** displayHelpMenu function called ***");
                
                // access help menu
        // HelpMenuView 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void accessContainer() throws InventoryControlException {
        ContainerControlView startContainerControlView = new ContainerControlView();
        startContainerControlView.displayContainerControl();
    }
    
}
