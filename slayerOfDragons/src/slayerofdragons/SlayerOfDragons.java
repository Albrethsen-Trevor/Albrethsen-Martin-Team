/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayerofdragons;

import byui.cit260.slayerOfDragons.model.Game;
import byui.cit260.slayerOfDragons.model.Player;
import byui.cit260.slayerOfDragons.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author ianmartin
 */
public class SlayerOfDragons {
    
    private static Game currentGame = null;
    private static Player player = null;
    public static Player getPlayer;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SlayerOfDragons.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SlayerOfDragons.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SlayerOfDragons.logFile = logFile;
    }
    
    
    
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
            SlayerOfDragons.inFile = new BufferedReader(new InputStreamReader(System.in));
            SlayerOfDragons.outFile = new PrintWriter(System.out, true);

            //open log file
             String filePath = "logfile.txt";

            SlayerOfDragons.logFile = new PrintWriter(filePath);
            startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            startProgramView.displayBanner();
        }
        
        try {
            
            // open character stream files for  end user input and output
            SlayerOfDragons.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            SlayerOfDragons.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            SlayerOfDragons.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            startProgramView.displayBanner();
            return;
            
        } catch (Throwable e) {
            
            System.out.println("Exception " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
        }
        
        finally {
            try {
                if (SlayerOfDragons.inFile != null)
                    SlayerOfDragons.inFile.close();
                
                if (SlayerOfDragons.outFile != null)
                    SlayerOfDragons.outFile.close();
                
                if (SlayerOfDragons.logFile != null)
                    SlayerOfDragons.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
    
    
}