/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Location;
import Model.Map;
import java.util.Random;
import yougotnocake.YouGotNoCake;

/**
 *
 * @author Clayton H. & Matt M.
 */
public class MapControl {
    
public static void addGiftsToMap(Map m){

    Random r = new Random();
    InventoryControl.addGiftsToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getGifts(),
            "stuffed unicorn", 1);
    InventoryControl.addGiftsToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getGifts(),
            "baseball bat", 1);
    InventoryControl.addGiftsToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getGifts(),
            "pokemon cards", 1);
    InventoryControl.addGiftsToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getGifts(),
            "whoopie cushion", 1);
    
}

public static void addSuppliesToMap(Map m){

    Random r = new Random();
    InventoryControl.addSuppliesToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getPartySupplies(),
            "pinata", 1);
    InventoryControl.addSuppliesToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getPartySupplies(),
            "party hats", 1);
    InventoryControl.addSuppliesToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getPartySupplies(),
            "ice cream", 1);
    InventoryControl.addSuppliesToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getPartySupplies(),
            "plastic forks", 1);
    
}

public static void addIngredientsToMap(Map m, String name, int num){
    
    Random r = new Random();
    while(num > 0){
        int eggsAtLocation = r.nextInt(2) +1;
        if(eggsAtLocation > num){
            eggsAtLocation = num;
        }
        InventoryControl.addIngredientToList(
            m.getLocationAt(r.nextInt(m.getNoOfRows()), r.nextInt(m.getNoOfColumns())).getIngredients(),
            name, eggsAtLocation);
        num -= eggsAtLocation;
    }
    
}

public static void takeStuff(Location l){
    if(l == null){
        return;
    }
    
     YouGotNoCake.getCurrentGame();
    
    YouGotNoCake.getCurrentGame().getIngredients().addAll(l.getIngredients());
    l.getIngredients().clear();
    
    YouGotNoCake.getCurrentGame().getPartySupplies().addAll(l.getPartySupplies());
    l.getPartySupplies().clear();
    
    YouGotNoCake.getCurrentGame().getGifts().addAll(l.getGifts());
    l.getGifts().clear();
    
}

}
