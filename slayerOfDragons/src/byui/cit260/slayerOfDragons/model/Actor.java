/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.model;

import java.io.Serializable;

/**
 *
 * @author trevoralbrethsen
 */
public enum Actor implements Serializable {
    
    Bludoc("He is the mentor and tells the player how to play the game.");
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);

    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}