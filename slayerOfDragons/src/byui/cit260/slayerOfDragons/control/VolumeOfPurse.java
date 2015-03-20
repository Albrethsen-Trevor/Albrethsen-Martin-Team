/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.control;

import byui.cit260.slayerOfDragons.exceptions.VolumeOfPurseException;

/**
 *
 * @author ianmartin
 */
public class VolumeOfPurse {
    
    public double calcVolumeOfPurse(double height, double diameter) 
                        throws VolumeOfPurseException {
        
        if (height < 0) { //Is the height negative?
            throw new VolumeOfPurseException("Height can't be less than 0.");
        }

        if (diameter < 0 || diameter > 24) { //Width is negative?
            throw new VolumeOfPurseException("Diameter can't be less than 0 or higher than 24.");
        }

        double radius = diameter / 2;
        double volume = (4/3 * height * Math.PI * Math.pow(radius, 3)) / 1728;

        return volume;
        
    }
}
