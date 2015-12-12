/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author Clayton
 */
public class Location implements Serializable {
    //class instance vaiables
    private boolean visited;
    private String description;
    private int row;
    private int column;
    private char letter;
    private ItemList ingredients;
    private ItemList gifts;
    private ItemList partySupplies;

    public ItemList getIngredients() {
        return ingredients;
    }

    public ItemList getGifts() {
        return gifts;
    }

    public ItemList getPartySupplies() {
        return partySupplies;
    }
   
    public Location() {
        visited = false;
        description = "undefined";
        row = 0;
        column = 0;
        letter = '.';
        ingredients = new ItemList("ingredients");
        gifts = new ItemList("gifts");
        partySupplies = new ItemList("party supplies");
        
    }
    
    public Location(boolean v, String d, char l, int r, int c) {
        visited = v;
        description = d;
        row = r;
        column = c;
        letter = l;
        ingredients = new ItemList("ingredients");
        gifts = new ItemList("gifts");
        partySupplies = new ItemList("party supplies");
        
    }    

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
}