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
public class Map implements Serializable{
    
    private String rowCount;
    private double coulumnCount;

    public Map() {
    }
    
    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public double getCoulumnCount() {
        return coulumnCount;
    }

    public void setCoulumnCount(double coulumnCount) {
        this.coulumnCount = coulumnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", coulumnCount=" + coulumnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.rowCount);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.coulumnCount) ^ (Double.doubleToLongBits(this.coulumnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coulumnCount) != Double.doubleToLongBits(other.coulumnCount)) {
            return false;
        }
        return true;
    }
    
    
    
}
