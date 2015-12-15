/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author Matt
 */
public class GameMenuView extends View {

    public GameMenuView() {
            super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Let's Get Cooking!                                     |"
                + "\n----------------------------------------------------------"
                + "\n| C - Check Inventory                                    |"
                + "\n| L - Look at Map                                        |"
                + "\n| B - Bake Cake                                          |"
                + "\n| M - Main Menu                                          |"
                + "\n----------------------------------------------------------");
    }

      
   @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
       switch (choice){
            case 'C': // check inventory
               this.checkPlayerInventory();
               break;
            case 'L': // look at map
               this.lookPlayerMap();
               break;
            case 'B': // bake a cake
               this.bakePlayerCake();
               break;
            case 'M': // return to main menu
               return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
       return false;  
    }
    


    private void checkPlayerInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }


    private void lookPlayerMap() {
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.displayMap();
    }


    private void bakePlayerCake() {
        BakeCakeView cakeMenu = new BakeCakeView();
        cakeMenu.displayIngredients();
    }

}