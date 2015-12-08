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
import java.io.File;

/**
 *
 * @author Matt
 */
public class GameControl {

    public static void loadSavedGame() throws Exception {
        Game game = Game.loadGame(new File("SavedGame.dat"));
        YouGotNoCake.setCurrentGame(game);
        System.out.println("Saved game loaded!");
    }

    public static void saveGame() throws Exception {
        Game.saveGame(YouGotNoCake.getCurrentGame());
        System.out.println("Game saved!");
    }

    public static void createNewGame(Player player, Map map) {

        Game game = new Game(); //create new game
        YouGotNoCake.setCurrentGame(game); //save in YouGotNoCake

        game.setPlayer(player); //save player in game
        game.setMap(map);

        //create the inventory list and save in the game
//        InventoryItem[] inventoryList = InventoryControl.createIngredientsList();
//        game.setInventory(inventoryList);
        game.setGift(InventoryControl.createGiftList());
        game.setIngredients(InventoryControl.createIngredientsList());
        game.setPartySupplies(InventoryControl.createPartyList());

        /**
         * Cart cart = new Cart();
        game.setCart(cart);
         */
        //MapControl.movePlayerToStartingLocation(map);
    }

    public static void startNewGame() {
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
