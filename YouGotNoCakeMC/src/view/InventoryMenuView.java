/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import view.View;

/**
 *
 * @author Clayton
 */
public class InventoryMenuView extends View {
    
    public InventoryMenuView() {
            super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Inventory Menu!                                             |"
                + "\n----------------------------------------------------------"
                + "\nI - View Ingredients"
                + "\nP - View Party Supplies"
                + "\nG - View Gifts"
                + "\nE - Exit"
                + "\n----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
       switch (choice){
            case 'I': // View Ingriedents
               this.displayIngredients();
               break;
            case 'P': // View Party Supplies
               this.partyInventory();
               break;
            case 'G': // View Gifts
               this.displayGifts();
               break;
            case 'E': // Exit Inventory
               return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
       return false;
   }
    


    private void displayIngredients() {
        BakeCakeView bakeCake = new BakeCakeView();
        bakeCake.displayIngredients();
    }


    private void partyInventory() {
        System.out.println("*** partyInventory function called ***");
    }


    private void displayGifts() {
        PartyGiftsView partyGifts = new PartyGiftsView();
        partyGifts.displayGifts();
    }

}