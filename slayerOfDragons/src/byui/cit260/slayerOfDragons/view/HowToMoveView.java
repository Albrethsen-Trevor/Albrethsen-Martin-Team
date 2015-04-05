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
public class HowToMoveView extends View {
    public HowToMoveView () {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| How to Move Menu                         |"
            + "\n--------------------------------------------"
            + "\nM - How do you move?"
            + "\nK - Are there key shortcuts?"
            + "\nU - How do I find out the letter to use?"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'M': //display how to move
                this.moveYourCharacter();
                break;
            case 'K': //display if there are key shortcuts
                this.noKeyShortcuts();
                break;
            case 'U': //display if how one knows which letter to use
                this.letterToUse();
                break;
            case 'Q': // quit the goal of the game menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void moveYourCharacter() {
        System.out.println("*** You move through the map on the map view screen.***");
    }

    private void noKeyShortcuts() {
        System.out.println("*** There aren't shortcut keys because you only have to use one letter.***");
    }

    private void letterToUse() {
        System.out.println("*** The letter will be shown when you're given the choice to select.***");
    }
    
}
