/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slayerOfDragons.model;

/**
 *
 * @author trevoralbrethsen
 */
public class ShopScene extends Scene{
    
    //class instance variable;
    private double capacity;

    public ShopScene() {
        
        
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ShopScene{" + "capacity=" + capacity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.capacity) ^ (Double.doubleToLongBits(this.capacity) >>> 32));
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
        if (Double.doubleToLongBits(this.capacity) != Double.doubleToLongBits(other.capacity)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
}
