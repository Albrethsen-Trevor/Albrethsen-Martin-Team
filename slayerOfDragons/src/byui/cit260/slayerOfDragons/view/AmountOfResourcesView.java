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
public class AmountOfResourcesView extends View {
    public AmountOfResourcesView () {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Amount of Resources Menu                  |"
            + "\n--------------------------------------------"
            + "\nL - Is there a limit to number of resources?"
            + "\nS - Is the limit the same for every resource?"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'L': //display what limited resources
                this.limitedNumberOfResources();
                break;
            case 'S': //display same resource limit
                this.sameLimitToResources();
                break;
            case 'Q': // quit the goal of the game menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void limitedNumberOfResources() {
        System.out.println("*** limitedNumberOfResources function called***");
    }

    private void sameLimitToResources() {
        System.out.println("*** sameLimitToResources function called***");
    }
    
}
