/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Item;
import Model.ItemList;
import yougotnocake.YouGotNoCake;
/**
 *
 * @author MattMalan and Clayton Harwood
 */
public class InventoryControl {
    
    public static ItemList createIngredientsList() {
        
        ItemList ingr = new ItemList("ingredients");
        addIngredientToList(ingr, "eggs", 0);
        addIngredientToList(ingr, "butta", 0);
        addIngredientToList(ingr, "flour", 0);
        addIngredientToList(ingr, "sugar", 0);
        
        return ingr;
        }
        
    
    public static ItemList createGiftList() {
        
        ItemList gift = new ItemList("gifts");
        addGiftsToList(gift, "stuffed unicorn", 0);
        addGiftsToList(gift, "baseball bat", 0);
        addGiftsToList(gift, "whoopie cushion", 0);
        addGiftsToList(gift, "pokemon cards", 0);
        
        return gift;
        }
        
    public static ItemList createPartyList() {
        
        ItemList party = new ItemList("supplies");
        addSuppliesToList(party, "pinata", 0);
        addSuppliesToList(party, "party hats", 0);
        addSuppliesToList(party, "plastic forks", 0);
        addSuppliesToList(party, "ice cream", 0);
        
        return party;
    }
    
    public static void DisplayList(ItemList list) {
        for (Item item: list.getArray())
            System.out.println(item.getItemName());
    }
    
    public static Item getItem(ItemList list, String name) {
        for (Item item: list.getArray())
            if (item.getItemName().equals(name))
                return item;
        return null;
    }
    
    public static void addIngredientToList(ItemList list, String name, int quantity){
        
        switch(name){
            case("eggs"): list.add(new Item("eggs",quantity,0.22,0.50));
                break;
            case("butta"): list.add(new Item("butta",quantity,0.75,1.00));
                break;
            case("flour"): list.add(new Item("flour",quantity,1.50,2.00));
                break;
            case("sugar"): list.add(new Item("sugar",quantity,5.0,5.00));
                break;
            default:
                //needs to be done use an exception
        }
        
    }
    
    public static void addSuppliesToList(ItemList list, String name, int quantity){
        
        switch(name){
            case("plastic forks"): list.add(new Item("plastic forks",quantity,0.22,0.50));
                break;
            case("pinata"): list.add(new Item("pinata",quantity,0.75,1.00));
                break;
            case("party hats"): list.add(new Item("party hats",quantity,1.50,2.00));
                break;
            case("ice cream"): list.add(new Item("ice cream",quantity,5.0,5.00));
                break;
            default:
                //needs to be done use an exception
        }
        
    }
    
    public static void addGiftsToList(ItemList list, String name, int quantity){
        
        switch(name){
            case("whoopie cushion"): list.add(new Item("whoopie cushion",quantity,0.22,0.50));
                break;
            case("pokemon cards"): list.add(new Item("pokemon cards",quantity,0.75,1.00));
                break;
            case("baseball bat"): list.add(new Item("baseball bat",quantity,1.50,2.00));
                break;
            case("stuffed unicorn"): list.add(new Item("stuffed unicorn",quantity,5.0,5.00));
                break;
            default:
                //needs to be done use an exception
        }
        
    }
        
     public static boolean enoughIngredients(){
         
        Game game = YouGotNoCake.getCurrentGame();
        return( 
        (InventoryControl.getItem(game.getIngredients(), "sugar").getItemQuantity() >= 1) &&      
        (InventoryControl.getItem(game.getIngredients(), "eggs").getItemQuantity()  >= 4) &&
        (InventoryControl.getItem(game.getIngredients(), "butta").getItemQuantity() >= 2) &&
        (InventoryControl.getItem(game.getIngredients(), "flour").getItemQuantity() >= 3)
                );
     }  
        
    }
