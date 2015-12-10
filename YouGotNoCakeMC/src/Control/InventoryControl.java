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
        ingr.add(new Item("eggs", 1, 0.22, 0.50));
        ingr.add(new Item("butta", 2, 0.75, 1.00));
        ingr.add(new Item("flour", 3, 1.50, 2.00));
        ingr.add(new Item("sugar", 4, 5.0, 5.00));

        return ingr;
    }

    public static ArrayList<Item> createGiftList() {

        ArrayList<Item> gift = new ArrayList<>();
        gift.add(new Item("stuffed unicorn", 5, 0.0, 0.0));
        gift.add(new Item("baseball bat", 6, 0.0, 0.0));
        gift.add(new Item("whoopie cushion", 7, 0.0, 0.0));
        gift.add(new Item("pokiemon cards", 8, 0.0, 0.0));

        return gift;
    }

    public static ArrayList<Item> createPartyList() {

        ArrayList<Item> party = new ArrayList<>();
        party.add(new Item("piniata", 9, 0.0, 0.0));
        party.add(new Item("party hats", 10, 0.0, 0.0));
        party.add(new Item("plastic forks", 11, 0.0, 0.0));
        party.add(new Item("ice cream", 12, 0.0, 0.0));

        return party;
    }

    public static void DisplayList(ArrayList<Item> list) {
        for (Item item : list) {
            System.out.println(item.getItemName());
        }
    }

    public static Item getItem(ArrayList<Item> list, String name) {
        for (Item item : list) {
            if (item.getItemName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
