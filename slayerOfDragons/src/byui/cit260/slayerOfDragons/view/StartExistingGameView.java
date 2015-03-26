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
public class StartExistingGameView extends View{
    public StartExistingGameView (){
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Start Existing Game Menu                 |"
            + "\n--------------------------------------------"
            + "\nL - Load existing save file"
            + "\nD - Delete existing save file"
            + "\nC - Copy existing save file"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
    
    }
    
    @Override 
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                System.out.println("Quit was run");
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
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
