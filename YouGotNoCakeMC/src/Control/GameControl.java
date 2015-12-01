/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Map;
import Model.Player;
import yougotnocake.YouGotNoCake;
import Model.InventoryItem;

/**
 *
 * @author Matt
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        YouGotNoCake.setCurrentGame(game); //save in YouGotNoCake
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save in the game
//        InventoryItem[] inventoryList = InventoryControl.createIngredientsList();
//        game.setInventory(inventoryList);
        game.setGift(InventoryControl.createGiftList());
        game.setIngredients(InventoryControl.createIngredientsList());
        game.setPartySupplies(InventoryControl.createPartyList());
        
        
        /**Cart cart = new Cart();
        game.setCart(cart);*/
        
        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); //save map in game
        
        //MapControl.movePlayerToStartingLocation(map);
        
    }
    
    public static void startNewGame(){
        System.out.println("\n*** startNewGame stub function called ***");
    }
 

    private static class MapControl {

        private static Map createMap() {
            System.out.println("createMap function called");
            return null;
        }
}
    

//    public static InventoryItem[] createInventoryList(){
//        System.out.println("*** createInventoryList() in Game Control");
//        return null;
//    }

      
}
