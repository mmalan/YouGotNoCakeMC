/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Warehouse
 */
public class Item implements Serializable{
    private String itemName;
    private int itemQuantity;
    private double itemWeight;
    private double itemCost;


    public Item(String name, int quantity) {
        this.itemName = name;
        this.itemQuantity = quantity;
           
    }    
    
    public Item(String name, int quantity, double weight, double cost) {
        this.itemName = name;
        this.itemQuantity = quantity;
        this.itemWeight = weight;
        this.itemCost = cost;        
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public String getItemName(String newName) {
        return (this.itemName = newName);
    }

//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public int setItemQuantity(int newQuantity) {
        return (this.itemQuantity = newQuantity);
    }

    @Override
    public String toString() {
        return String.format("%s\t%d",this.itemName, this.itemQuantity);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.itemName);
        hash = 79 * hash + Objects.hashCode(this.itemQuantity);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemQuantity, other.itemQuantity)) {
            return false;
        }
        return true;
    }      
    
}