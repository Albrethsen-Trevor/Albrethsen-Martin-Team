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
public class MainMenu implements Serializable{
    
    private String newGame;
    private String loadGame;
    private String saveGame;
    private double helpMenu;

    public MainMenu() {
    }

    public String getNewGame() {
        return newGame;
    }

    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public String getLoadGame() {
        return loadGame;
    }

    public void setLoadGame(String loadGame) {
        this.loadGame = loadGame;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }

    public double getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(double helpMenu) {
        this.helpMenu = helpMenu;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "newGame=" + newGame + ", loadGame=" + loadGame + ", saveGame=" + saveGame + ", helpMenu=" + helpMenu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.newGame);
        hash = 19 * hash + Objects.hashCode(this.loadGame);
        hash = 19 * hash + Objects.hashCode(this.saveGame);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.helpMenu) ^ (Double.doubleToLongBits(this.helpMenu) >>> 32));
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.loadGame, other.loadGame)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        if (Double.doubleToLongBits(this.helpMenu) != Double.doubleToLongBits(other.helpMenu)) {
            return false;
        }
        return true;
    }

    
    
    
}
