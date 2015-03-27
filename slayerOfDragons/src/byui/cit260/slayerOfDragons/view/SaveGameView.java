/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.view;

/**
 *
 * @author trevoralbrethsen
 */
public class SaveGameView extends View{
    public SaveGameView (){
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Save Game Menu                            |"
            + "\n--------------------------------------------"
            + "\nS - Save Your Game"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
    }
@Override
public boolean doAction(Object obj) {
    
    String value = (String) obj;
    
    value = value.toUpperCase();
    char choice = value.charAt(0);
    
    switch (choice) {
        case 'S': // save game
            this.saveGame();
            break;
        case 'Q': // quit the save menu
            
        default:
            System.out.println("\n*** Invalid selection *** Try again");
    }
    return false;
}

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    
}
