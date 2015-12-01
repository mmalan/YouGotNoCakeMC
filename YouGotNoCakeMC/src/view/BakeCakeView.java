/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import Control.IngredientControl;
import Control.InventoryControl;
import Model.Item;
import yougotnocake.YouGotNoCake;
import Model.Game;

/**
 *
 * @author Clayton
 */
public class BakeCakeView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Cake Ingredients                                       |"
                + "\n----------------------------------------------------------"
                + "\nItem    Weight    Cost                                           "
                + "\n----------------------------------------------------------"
                + "\nSugar -  "  + IngredientControl.Ingredients.sugar.weight + "     " + IngredientControl.Ingredients.sugar.cost + "" //will display quantity
                + "\nEggs -   "  + IngredientControl.Ingredients.eggs.weight + "     " + IngredientControl.Ingredients.eggs.cost + ""//will display quantity
                + "\nButta -  "  + IngredientControl.Ingredients.butta.weight + "     " + IngredientControl.Ingredients.butta.cost + ""//will display quantity
                + "\nFlour -  "  + IngredientControl.Ingredients.flour.weight + "     " + IngredientControl.Ingredients.flour.cost + "" //will display quantity
                + "\n----------------------------------------------------------";
    
    private String menuString(){
        
         Game game = YouGotNoCake.getCurrentGame();
        
        
         return "\n"
                + "\n----------------------------------------------------------"
                + "\n| Cake Ingredients                                       |"
                + "\n----------------------------------------------------------"
                + "\nItem    Quantity   Weight    Cost                                           "
                + "\n----------------------------------------------------------"
                + "\nSugar -  "  + InventoryControl.getItem(game.getIngredients(), "egg").getItemQuantity() + " " + InventoryControl.getItem(game.getIngredients(), "egg").getItemName() + " " //will display quantity
                + "\nEggs -   "  + InventoryControl.getItem(game.getIngredients(), "sugar").getItemQuantity() + " " //will display quantity
                + "\nButta -  " + InventoryControl.getItem(game.getIngredients(), "sugar").getItemQuantity() + " " //will display quantity
                + "\nFlour -  " + InventoryControl.getItem(game.getIngredients(), "sugar").getItemQuantity() + " " //will display quantity 
                + "\n----------------------------------------------------------";
        
    }
    public void displayIngredients() {
                
        String input;
        do{
            System.out.println(menuString()); // display the main menu
            
            input=this.getCake(); // get the user's selection
            //String answer = input.(yes); // get first character of string
            
            this.bakeCake(input); // do action based on selection
        }while (!input.equals("back")); // an selection is not "Exit"
    }
    
    public String getCake() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("Would you like to bake a cake?");
            System.out.println("Please enter \"yes\" \"no\" or  \"back\" ");
            
             //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            entry = entry.toLowerCase();
            
            if (entry.length() < 2){
                System.out.println("Invalid entry - enter yes, no or back");
                continue; //and repeat again
            }
            break; 
        }
        
        return entry ; //return the selection
    }
   
   public void bakeCake(String input){
       
        if(input.equals("yes")){
            System.out.println("Sweet, you have made a cake and the sugar is rushing to your head!");
        }else{
            System.out.println("You do not have enough ingredients yet");
           }
       }
   }