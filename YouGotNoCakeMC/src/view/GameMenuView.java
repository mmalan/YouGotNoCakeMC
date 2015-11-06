/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import view.InventoryMenuView;
/**
 *
 * @author Matt
 */
public class GameMenuView {

    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Let's Get Cooking!                                     |"
                + "\n----------------------------------------------------------"
                + "\nC - Check Inventory"
                + "\nL - Look at Map"
                + "\nB - Bake Cake"
                + "\nM - Main Menu"
                + "\n----------------------------------------------------------";

    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        }while (selection != 'M'); // an selection is not "Main Menu"
        
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
               return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
   }
    


    private void checkPlayerInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayInventoryMenu();
    }


    private void lookPlayerMap() {
        System.out.println("*** lookPlayerMap function called ***");
    }


    private void bakePlayerCake() {
        System.out.println("*** bakePlayerCake function called ***");
    }

}