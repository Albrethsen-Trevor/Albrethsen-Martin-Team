/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

/**
 *
 * @author trevoralbrethsen
 */
public class StoredInventoryControl {
    
    public double calcVolumeOfItemsChest (double height, double width, double length) {
        
        if (height < 0 || height > 36) { // length is negative?
            return -1; 
        }

        if (width < 0 || width > 9) { // width is too high
            return -1; 
        }

        if (length < 0 || length > 18) { // height is negative
            return -1; 
        }

        double volume = (height * width * length) / 1728;

        return volume;
        
    }
    
}
