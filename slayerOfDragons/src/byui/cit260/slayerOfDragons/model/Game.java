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
public class Game implements Serializable{
    
    private String Game;

    public Game() {
    }
    
    public String getGame() {
        return Game;
    }

    public void setGame(String Game) {
        this.Game = Game;
    }

    @Override
    public String toString() {
        return "Game{" + "Game=" + Game + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Game);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.Game, other.Game)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
