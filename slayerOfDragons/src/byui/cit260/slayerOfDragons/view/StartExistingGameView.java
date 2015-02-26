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
public class StartExistingGameView {
    
    private final String STARTEXISTINGGAMEMENU = "\n"
            + "\n--------------------------------------------"
            + "\n| Start Existing Game Menu                 |"
            + "\n--------------------------------------------"
            + "\nL - Load existing save file"
            + "\nD - Delete existing save file"
            + "\nC - Copy existing save file"
            + "\nQ - Quit"
            + "\n--------------------------------------------";
    
    public void displayStartExistingGameMenu() {
        
        char selection = ' ';
        do {
            System.out.println(STARTEXISTINGGAMEMENU); // display the main menu
            
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
            case 'L': // Loads a save file
                this.loadSave();
                break;
            case 'D': // Delete a save file
                this.deleteExistingSave();
                break;
            case 'C': // Copy a save file
                this.copySaveFile();
                break;
            case 'Q': // Quit the help menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void loadSave() {
        System.out.println("*** loadSave function called ***");
    }

    private void deleteExistingSave() {
        System.out.println("*** deleteExistingSave function called ***");
    }

    private void copySaveFile() {
        System.out.println("*** copySaveFile function called ***");
    }
    
    
}
