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
public class BossScene implements Serializable{
    
    //class instance variable
    
    private String description;
    private String type;
    private String symbol;
    private double travelTime;
    private double bossMaxHealth;

    public BossScene() {
        this.description = "\nThis is the dragon that the average joe must defeat."
                        + "\nKill the dragon and you win the game!";
        this.type = null;
        this.symbol = null;
        this.travelTime = 120.0;
        this.bossMaxHealth = (double)bossMaxHealth.getHealth();
    }
    
    public BossHealthMax(health) {
        // call starting health points of boss
        double volume = GameControl.calcBossTotalHealth(health);
        // if the health is valid
        maxValue = health;
        for index = 1 TO  health.index -1
                if  (health[index]) > maxValue);
                    maxValue = list[index];
                if else
                    maxValue = -1;
                for index = -1;
    } return maxValue;

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

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public String toString() {
        return "BossScene{" + "type=" + type + ", description=" + description + ", symbol=" + symbol + ", travelTime=" + travelTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.symbol);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
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
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        return true;
    }
    
    
    
}
