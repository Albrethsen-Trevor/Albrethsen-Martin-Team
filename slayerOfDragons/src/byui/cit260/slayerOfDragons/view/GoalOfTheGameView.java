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
public class GoalOfTheGameView extends View {
    public GoalOfTheGameView () {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Goal of the Game Menu                    |"
            + "\n--------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nH - Are there game hints?"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'G': //display what the game's goal is
                this.theGoalOfGame();
                break;
            case 'H': //display if there are game hints
                this.gameHints();
                break;
            case 'Q': // quit the goal of the game menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void theGoalOfGame() {
        System.out.println("*** The goal of the game is to slay the dragon.***");
    }

    private void gameHints() {
        System.out.println("*** There are no game hints. You'll do great!***");
    }
    
}
