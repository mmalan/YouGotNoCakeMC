/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

//import byui.cit260.youGotNoCake2.model.Inventory;

import Model.Game;
import Model.Player;
import Model.Inventory;
import Model.Location;
import Model.Map;
import Model.Progress;

//import byui.cit260.youGotNoCake2.model.Player;

/**
 *
 * @authors Matt M. and Clayton 
 */
public class YouGotNoCake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Rogers");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setItem("2");
        inventoryOne.setType("Ingredients");
        inventoryOne.setAttribute("Sugar");
    
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        Progress youWin = new Progress();
        Progress youLoose = new Progress();
        
        youWin.setYouWin("You Got Cake!");
        youLoose.setYouLoose("You Got no cake!");
        
        String playerProgress = youWin.toString();
        System.out.println(playerProgress);
        
        Map rowCount = new Map();
        
        rowCount.setRowCount("New Map Area!");
        
        String areaMap = rowCount.toString();
        System.out.println(areaMap);
        
        Location currentLocation = new Location();
        
        currentLocation.setCurrentLocation("You are here!");
        
        String mapLocation = currentLocation.toString();
        System.out.println(mapLocation);
        
        Game playerName = new Game();
        
        playerName.setPlayerName("Name Goes here");
        
        String newGame = playerName.toString();
        System.out.println(newGame);
    
    }
    
    
}

