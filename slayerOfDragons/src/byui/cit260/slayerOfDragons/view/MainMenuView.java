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
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n--------------------------------------------"
            + "\n| Main Menu                                |"
            + "\n--------------------------------------------"
            + "\nN - Start game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\nC - ContainerControlView"
            + "\n--------------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        
        } while (selection != 'E'); // a selection is not "Exit"
    }

    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            //prompt for the input
            System.out.println("Enter the input below:");
            
            //get the name from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            // if the input is invalid (less than one character in length))
            if (input.length() < 1) {
                System.out.println("Invalid input - the input must not be blank");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
        }
        
        return input; // return the input
    }

    public void doAction(char choice) {
        
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
            case 'E': // Exit the game
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
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
        startExistingGameMenu.displayStartExistingGameMenu();
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
        
    }

    private void displayHelpMenu() {
        // System.out.println("*** displayHelpMenu function called ***");
                
                // access help menu
        // HelpMenuView 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void accessContainer() {
        ContainerControlView startContainerControlView = new ContainerControlView();
        startContainerControlView.displayContainerControl();
    }
    
}
