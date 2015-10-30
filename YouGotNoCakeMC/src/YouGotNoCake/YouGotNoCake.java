/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

import Control.ProgramControl;
import Model.Game;
import Model.Player;
import Model.Inventory;
import Model.Location;
import Model.Map;
import Model.Progress;
import view.StartProgramView;


/**
 *
 * @authors Matt M. and Clayton 
 */
public class YouGotNoCake {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        //create StartProgramingView and start the porgram
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        YouGotNoCake.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        YouGotNoCake.player = player;
    }
    
    

}


