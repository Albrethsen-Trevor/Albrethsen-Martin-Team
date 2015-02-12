/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

/**
 *
 * @author ianmartin
 */
public class InventoryControl {
    
    public double calcVolumeOfItemContainer(double height, double width, double length) {
        
        if (height < 0 || height > 24) { //Is the height negative?
            return -1;
        }

        if (width < 0 || width > 24) { //Width is negative?
            return -1;
        }

        if (length < 0 || length > 24) { //Length too high?
            return -1;
        }

        double volume = (height * width * length) / 1728;

        return volume;
        
    }
}
