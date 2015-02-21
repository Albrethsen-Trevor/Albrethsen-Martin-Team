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
public class HelpMenuView {
    
    private final String HELPMENU = "\n"
            + "\n--------------------------------------------"
            + "\n| Help Menu                                |"
            + "\n--------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nE - Estimating the amount of resources"
            + "\nH - Harvesting resources"
            + "\nD - Delivering resources to shop "
            + "\nQ - Quit"
            + "\n--------------------------------------------";

    public void displayHelpMenu() {
        
        char selection = ' ';
        do {
            System.out.println(HELPMENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        
        } while (selection != 'Q'); // a selection is not "Quit"
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
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
        System.out.println("*** harvestingResources function called ***");
    }

    private void deliverResourcesToShop() {
        System.out.println("*** deliverResourceToShop function called ***");
    }
    
}
