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
    
    private String Name;
    private String Width;
    private String Height;
    private String Length;
    private double maxCapacity;

    public Horse() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String Width) {
        this.Width = Width;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String Length) {
        this.Length = Length;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Horse{" + "Name=" + Name + ", Width=" + Width + ", Height=" + Height + ", Length=" + Length + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.Name);
        hash = 59 * hash + Objects.hashCode(this.Width);
        hash = 59 * hash + Objects.hashCode(this.Height);
        hash = 59 * hash + Objects.hashCode(this.Length);
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
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Width, other.Width)) {
            return false;
        }
        if (!Objects.equals(this.Height, other.Height)) {
            return false;
        }
        if (!Objects.equals(this.Length, other.Length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        return true;
    }
    
    
}
