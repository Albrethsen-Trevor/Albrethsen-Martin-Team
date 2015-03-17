/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ianmartin
 */
public class Horse implements Serializable{
    
    private String description;
    private String name;
    private double width;
    private double height;
    private double length;
    private double maxCapacity;

    public Horse() {
        this.description = "\nThis is the horse of Slayer of Dragons! If you"
                        + "\nride the horse to victory, you will win the game";
        this.name = null;
        this.width = 0;
        this.height = 0;
        this.length = 0;
        this.maxCapacity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", width=" + width + ", height=" + height + ", length=" + length + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.width);
        hash = 59 * hash + Objects.hashCode(this.height);
        hash = 59 * hash + Objects.hashCode(this.length);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horse other = (Horse) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.width, other.width)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        if (!Objects.equals(this.length, other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        return true;
    }
    
    
}
