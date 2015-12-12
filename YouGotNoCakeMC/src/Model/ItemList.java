/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.InventoryControl;
import java.util.ArrayList;

/**
 *
 * @author Clayton
 */
public class ItemList {
    
    private String name; 
    
    private ArrayList<Item> items;

    public ItemList(String name, ArrayList<Item> items) {
        this.name = name;
        this.items = items;
    }
    
    public ItemList(){
        
        name = "unintialized";
        this.items = new ArrayList<>();
        
    }
    
    public ItemList(String name){
        
        this.name = name;
        this.items = new ArrayList<>();
        
    }
    
    public double getTotalWeight() {
        double totalWeight = 0;
        for(Item i : items){
            totalWeight += i.getItemWeight();
        }  
        return totalWeight;
    }
    
    public double getTotalCost() {
        double totalCost = 0;
        for(Item i : items){
            totalCost += i.getItemCost();
        }  
        return totalCost;
    }
    
    public int getNumOf(String name) {

        int num = 0;
        if (name == null){
           return 0;
        }
        for(Item i : items){
            if (i.getItemName()== null){
                return 0;
            }
            if(name == i.getItemName()){
                num += i.getItemQuantity();
            }
        }  
        return num;
    }
    
    public void add(Item i){
        Item existing = InventoryControl.getItem(this, i.getItemName());
        if(existing == null){
            items.add(i);
        }else{
            existing.addToQuantity(i.getItemQuantity());
        }
        
    }
    
    public void addAll(ItemList il){
        for(Item i : il.getArray()){
          add(i);  
        }
   }
    
    public void clear(){
        items.clear();
    }
    
    public ArrayList<Item> getArray(){
        return items;
    }
    
}
