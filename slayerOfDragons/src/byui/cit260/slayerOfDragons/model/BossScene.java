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
public class BossScene extends Scene{
    
    //class instance variable
    
    private double bossMaxHealth;

    public BossScene() {

    }

    public double getBossMaxHealth() {
        return bossMaxHealth;
    }

    public void setBossMaxHealth(double bossMaxHealth) {
        this.bossMaxHealth = bossMaxHealth;
    }

    @Override
    public String toString() {
        return "BossScene{" + "bossMaxHealth=" + bossMaxHealth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bossMaxHealth) ^ (Double.doubleToLongBits(this.bossMaxHealth) >>> 32));
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
        final BossScene other = (BossScene) obj;
        if (Double.doubleToLongBits(this.bossMaxHealth) != Double.doubleToLongBits(other.bossMaxHealth)) {
            return false;
        }
        return true;
    }
    
    
    
    

   
    
    
    
}
