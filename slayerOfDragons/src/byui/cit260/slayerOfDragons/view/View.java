/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

import java.util.Scanner;

/**
 *
 * @author ianmartin
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do {
            System.out.println(this.promptMessage); // display the main menu
            value = this.getInput(); // get the user's selection
            this.doAction(value); // do action based on selection
        
        } while (!value.equals("Q")); // a selection is not "Exit"
    }

    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false; // indicates if the input has been retrieved
        String input = null;
       
        
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

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
}

