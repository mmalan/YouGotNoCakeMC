/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.GameControl;
import java.io.Serializable;
import java.util.Objects;
import Model.InventoryItem;
/**
 *
 * @author Clayton
 */
public class Game implements Serializable{
     private String totalTime;
     private String playerName;
     private InventoryItem[] inventory;
     private Map map;
     //private Cart cart;

    public Game() {
    }     

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public void setPlayer(Player player) {
        System.out.println("setplayer function called");
    }
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", playerName=" + playerName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.totalTime);
        hash = 97 * hash + Objects.hashCode(this.playerName);
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
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

    public void setMap(Map map) {
        System.out.println("setMap function called");
    }

    public void setInventory(InventoryItem[] inventoryList) {
        System.out.println("setInventory function called");
    }

}
