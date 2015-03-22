/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import byui.cit260.slayerOfDragons.control.InventoryControl;
import byui.cit260.slayerOfDragons.exceptions.InventoryControlException;
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

    public void displayContainerControl() throws InventoryControlException {
        
        double volume = -1;
        do {
            System.out.println(CONTAINERCONTROL); // display the main menu
            
            // get the width from the end user
            System.out.println("Enter the width of the container below:");
            String widthValue = this.getInput();
            
            
            // get the height from the end user
            System.out.println("Enter the height of the container below:");
            String heightValue = this.getInput();
            
            // get the length from the end user
            System.out.println("Enter the length of the container below:");
            String lengthValue = this.getInput();
            
            double width = Double.parseDouble(widthValue);
            double height = Double.parseDouble(heightValue);
            double length = Double.parseDouble(lengthValue);
            // call doAction to perform the task and display the next view
            volume = this.doAction(width, height, length);
            
            
        
        } while (volume < 0); // a selection is not "Exit"
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
    
    public double doAction(double width, double height, double length) throws InventoryControlException {
        
        // call control function to calculate the volume
        double volume = InventoryControl.calcVolumeOfItemContainer(height, width, length);
        // if the volume is valid
        if (volume >= 0) {
            System.out.println("The volume is:" + volume);
        }
            // display success message - the volume is ....
        // else
        else {
            // if width is invalid, print invalid width
            if (volume == -2) {
                System.out.println("Invalid width. Width must be between 0 and 24.");
            }
            // else if height is invalid, print invalid height
            else if (volume == -1) {
                System.out.println("Invalid height. Height must be between 0 and 24.");
            }
            // else if length is invalid, print invalid length
            else {
                System.out.println("Invalid length. Length must be between 0 and 24.");
            }
          
        }
        return volume;
    }
    
}