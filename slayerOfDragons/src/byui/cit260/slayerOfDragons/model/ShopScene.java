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
 * @author trevoralbrethsen
 */
public class ShopScene implements Serializable{
    
    //class instance variable;
    private String type;
    private String description;
    private String symbol;
    private double capacity;

    public ShopScene() {
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ShopScene{" + "type=" + type + ", description=" + description + ", symbol=" + symbol + ", capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.capacity) ^ (Double.doubleToLongBits(this.capacity) >>> 32));
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
        final ShopScene other = (ShopScene) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.capacity) != Double.doubleToLongBits(other.capacity)) {
            return false;
        }
        return true;
    }
    
    
    
}
