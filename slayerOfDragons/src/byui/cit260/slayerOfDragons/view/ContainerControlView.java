/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.model.Container;
import java.util.Scanner;

/**
 *
 * @author trevoralbrethsen
 */
public class ContainerControlView {
    
    private final String CONTAINERCONTROL = "\n"
            + "\n--------------------------------------------"
            + "\n| Container Control View                   |"
            + "\n--------------------------------------------"
            + "\n Enter the height of the container"
            + "\n--------------------------------------------";

    public void displayContainerControl() {
        
        char selection = ' ';
        do {
            System.out.println(CONTAINERCONTROL); // display the main menu
            
            int input = this.enterDimensions(); // get the user's selection
            // selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        
        } while (selection != 'E'); // a selection is not "Exit"
    }
    
    public int enterDimensions() {
        int height = Container.getHeight();
        boolean valid = false; // indicates if the input has been retrieved
        int input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            //prompt for the input
            System.out.println("Enter the input below:");
            
            //get the name from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            // if the input is invalid (less than one character in length))
            if (height > 0 && height < 24 && length > 0 && length < 24 && width > 0 && width < 24) {
    
                calcVolumeOfItemContainer(height, width, length);
                }
                {
                System.out.println("Invalid input - the input must not be blank");
                continue; // and repeat again
                
            }
            //boolean valid = false;
                while (!valid) {
                int time;
                try {
                if (time >= 0) valid = true;
                } catch (NumberFormatException e) {
                //error
                System.out.println("Error, not a number. Please try again.");
    }
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
            case 'E': // Exit the game
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
    public double calcVolumeOfItemContainer(double height, double width, double length) {
        
        if (height < 0 || height > 24) { //Is the height negative?
            return -1;
        }

        if (width < 0 || width > 24) { //Width is negative?
            return -1;
        }

        if (length < 0 || length > 24) { //Length too high?
            return -1;
        }

        double volume = (height * width * length) / 1728;

        return volume;
        
    }
    
}

if (height > 0 && height < 24 && length > 0 && length < 24 && width > 0 && width < 24) {
    
calcVolumeOfItemContainer(height, width, length);
}