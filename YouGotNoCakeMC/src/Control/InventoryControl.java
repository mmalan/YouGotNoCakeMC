/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import Model.Item;
/**
 *
 * @author MattMalan and Clayton Harwood
 */
public class InventoryControl {
    
    public static ArrayList<Item> createIngredientsList() {
        
        ArrayList<Item> ingr = new ArrayList<>();
        ingr.add(new Item("egg",0,1.1,2.2));
        ingr.add(new Item("butta",0,3.3,4.4));
        ingr.add(new Item("flour",0));
        ingr.add(new Item("sugar",0));
        
        return ingr;
        }
        
    public static ArrayList<Item> createGiftList() {
        
        ArrayList<Item> gift = new ArrayList<>();
        gift.add(new Item("stuffed unicorn",0));
        gift.add(new Item("baseball bat",0));
        gift.add(new Item("whoopie cushion",0));
        gift.add(new Item("pokiemon cards",0));
        
        return gift;
        }
        
    public static ArrayList<Item> createPartyList() {
        
        ArrayList<Item> party = new ArrayList<>();
        party.add(new Item("piniata",0));
        party.add(new Item("party hats",0));
        party.add(new Item("plastic forks",0));
        party.add(new Item("ice cream",0));
        
        return party;
    }
    
    public static void DisplayList(ArrayList<Item> list) {
        for (Item item: list)
            System.out.println(item.getItemName());
    }
    
    public static Item getItem(ArrayList<Item> list, String name) {
        for (Item item: list)
            if (item.getItemName().equals(name))
                return item;
        return null;
    }
}
