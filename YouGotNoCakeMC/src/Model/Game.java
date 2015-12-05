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
import java.util.ArrayList;
/**
 *
 * @author Clayton
 */
public class Game implements Serializable{
     private String totalTime;
     private Player player;
     private String playerName;
     private ArrayList<Item> ingredients;
     private ArrayList<Item> gift;
     private ArrayList<Item> partySupplies;
     private Map map;



    public void setIngredients(ArrayList<Item> ingredients) {
        this.ingredients = ingredients;
    }

    public void setGift(ArrayList<Item> gift) {
        this.gift = gift;
    }

    public void setPartySupplies(ArrayList<Item> partySupplies) {
        this.partySupplies = partySupplies;
    }


    public ArrayList<Item> getIngredients() {
        return ingredients;
    }

    public ArrayList<Item> getGift() {
        return gift;
    }

    public ArrayList<Item> getPartySupplies() {
        return partySupplies;
    }
   
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
        return this.player.getName();
    }

//    public void setPlayerName(String playerName) {
//        this.playerName = playerName;
//    }
    
    public void setPlayer(Player player) {
        this.player = player;
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
        this.map = map;
    }
    
    public Map getMap() {
        return map;
    }

    public void setInventory(InventoryItem[] inventoryList) {
        System.out.println("setInventory function called");
    }

}
