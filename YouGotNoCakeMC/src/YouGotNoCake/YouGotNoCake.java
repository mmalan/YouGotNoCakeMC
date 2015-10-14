/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

//import byui.cit260.youGotNoCake2.model.Inventory;

import Model.Player;
import Model.Inventory;

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
    
    }
    
    
}

