/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Clayton
 */
public class Game implements Serializable{
     private String totalTime;
     private Player player;
     private String playerName;
     private ItemList ingredients;
     private ItemList gifts;
     private ItemList partySupplies;
     private Map map;
     
    public static void saveGame(Game game) throws Exception{
        FileOutputStream stream = new FileOutputStream(new File("SavedGame.dat"));
        ObjectOutputStream objectStream = new ObjectOutputStream(stream);
        objectStream.writeObject(game);
        objectStream.close();
    }

    public static Game loadGame(File saveFile) throws Exception {
        FileInputStream stream = new FileInputStream(saveFile);
        ObjectInputStream objectStream = new ObjectInputStream(stream);
        Game game = (Game) objectStream.readObject();
        objectStream.close();
        return game;
    }
    
    public void setIngredients(ItemList ingredients) {
        this.ingredients = ingredients;
    }

    public void setGift(ItemList gift) {
        this.gifts = gift;
    }

    public void setPartySupplies(ItemList partySupplies) {
        this.partySupplies = partySupplies;
    }


    public ItemList getIngredients() {
        return ingredients;
    }

    public ItemList getGifts() {
        return gifts;
    }

    public ItemList getPartySupplies() {
        return partySupplies;
    }
  
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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
}
