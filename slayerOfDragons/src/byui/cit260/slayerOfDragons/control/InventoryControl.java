/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import byui.cit260.slayerOfDragons.exceptions.InventoryControlException;
import java.util.Arrays;

/**
 *
 * @author ianmartin
 */
public class InventoryControl {
    
    public static double calcVolumeOfItemContainer(double height, double width, double length) 
                                throws InventoryControlException {

        if (height < 0 || height > 24) { //Is the height negative?
            throw new InventoryControlException("Height cannot be less than 0"
                                              + " or greater than 24.");
        }

        if (width < 0 || width > 24) { //Width is negative?
            throw new InventoryControlException("Width cannot be less than 0"
                                              + " or greater than 24.");
        }

        if (length < 0 || length > 24) { //Length too high?
            throw new InventoryControlException("Length cannot be less than 0"
                                              + " or greater than 24.");
        }

        double volume = (height * width * length) / 1728;

        return volume;

    }

    
    public static void InventoryItem(String args[]) {
        
        String[] items = new String[]{"enter", "variables"," here"}; //Just place holders until actual items are made.
        Arrays.sort(items);
        
        for (int i=0; i < items.length;i++) {
            System.out.println(items);
        }
    }
    
}
