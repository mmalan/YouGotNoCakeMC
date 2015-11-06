/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Clayton
 */
public class InventoryMenuView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Inventory Menu!                                             |"
                + "\n----------------------------------------------------------"
                + "\nI - View Ingredients"
                + "\nP - View Party Supplies"
                + "\nG - View Gifts"
                + "\nE - Exit"
                + "\n----------------------------------------------------------";

    public void displayInventoryMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        }while (selection != 'E'); // an selection is not "Exit"
        
    }
    
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("What would you like to do next?:");
            
            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // out of the (exit) the repetition
        }
        
        return entry ; //return the selection
    }
    
   
    public void doAction(char choice){
       
       switch (choice){
            case 'I': // View Ingriedents
               this.displayIngredients();
               break;
            case 'P': // View Party Supplies
               this.partyInventory();
               break;
            case 'G': // View Gifts
               this.giftInventory();
               break;
            case 'E': // Exit Inventory
               return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
   }
    


    private void displayIngredients() {
        BakeCakeView bakeCake= new BakeCakeView();
        bakeCake.displayIngredients();
    }


    private void partyInventory() {
        System.out.println("*** partyInventory function called ***");
    }


    private void giftInventory() {
        System.out.println("*** giftInventory function called ***");
    }

}