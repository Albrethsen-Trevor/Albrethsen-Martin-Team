/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.control.ProgramControl;
import byui.cit260.slayerOfDragons.model.Player;
import java.util.Scanner;

/**
 *
 * @author trevoralbrethsen
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
        
        // Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayerName();
        
        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the Main menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n\n*************************************************");
        
        System.out.println("*                                               *"
                        + "\n* Welcome to the world of Slayer of Dragons.    *"
                        + "\n* In this game you will need to defeat your     *"
                        + "\n* first dragon to escape being your everyday    *"
                        + "\n* normal guy in the world.                      *");
        
        System.out.println("*                                               *"
                        + "\n* To slay a dragon, you will need a weapon      *"
                        + "\n* and armor to fight and protect yourself,      *"
                        + "\n* respectively. Throughout your journey you     *"
                        + "\n* will acquire gold and other resources to      *"
                        + "\n* assist you in your journey in becoming a      *"
                        + "\n* Slayer of Dragons.                            *");
        
        System.out.println("*                                               *"
                        + "\n* Good luck! Slay your first dragon!            *"
                        + "\n*                                               *");
        
        System.out.println("*************************************************");
        
    }

    public String getPlayerName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than the two character in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
        }
        
        return playersName; // return the name
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe Hope you have a lot of fun!");
        System.out.println("=============================================");
        
    }
    
}
