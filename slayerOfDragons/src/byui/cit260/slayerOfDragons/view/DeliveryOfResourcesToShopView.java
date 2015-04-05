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
public class DeliveryOfResourcesToShopView extends View {
    public DeliveryOfResourcesToShopView() {
        super("\n"
            + "\n--------------------------------------------"
            + "\n| Delivery of Resources to Shop Menu       |"
            + "\n--------------------------------------------"
            + "\nT - How many shops are there?"
            + "\nR - How do I send my resources to shop?"
            + "\nD - Do I have to pay to deliver resources?"
            + "\nQ - Quit"
            + "\n--------------------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'T': //display how many shops there are
                this.onlyOneShop();
                break;
            case 'R': //display how resources can be sent
                this.howResourcesAreSent();
                break;
            case 'D': //display if there is a payment required to deliver resources
                this.resourceDeliveryPayment();
                break;
            case 'Q': // quit the goal of the game menu
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void onlyOneShop() {
        System.out.println("*** There is only one shop available.***");
    }

    private void howResourcesAreSent() {
        System.out.println("*** You must go to the shop yourself.***");
    }

    private void resourceDeliveryPayment() {
        System.out.println("*** Resource deliveries are free.***");
    }
}
