/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayerofdragons;

import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Player;
import byui.cit260.slayerOfDragons.view.StartProgramView;







/**
 *
 * @author ianmartin
 */
public class SlayerOfDragons {
    
    private static Game currentGame = null;
    private static Player player = null;
    public static Player getPlayer;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SlayerOfDragons.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SlayerOfDragons.player = player;
    }
    
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayBanner();
        }
    }
    
    
    
}