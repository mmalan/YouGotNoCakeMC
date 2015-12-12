/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.CakeIngredientControl;
import Exceptions.IngredientControlException;
import java.util.Scanner;

/**
 *
 * @author Clayton
 */
public class CakeIngredientView {

    public CakeIngredientControl ingredientList;

    public CakeIngredientView() {

        ingredientList = new CakeIngredientControl();

        for (int i = 0; i < 4; i++) {
            ingredientList.addIngredient(CakeIngredientControl.Ingredient.eggs);
        }

        for (int i = 0; i < 3; i++) {
            ingredientList.addIngredient(CakeIngredientControl.Ingredient.sugar);
        }

        for (int i = 0; i < 6; i++) {
            ingredientList.addIngredient(CakeIngredientControl.Ingredient.flour);
        }

        for (int i = 0; i < 2; i++) {
            ingredientList.addIngredient(CakeIngredientControl.Ingredient.butta);
        }

    }

    private final String MENU = "\n"
            + "\n----------------------------------------------------------"
            + "\n| Do You Have Enough Ingredients?                          |"
            + "\n----------------------------------------------------------"
            + "\nItem    Quantity    Weight    Cost                        "
            + "\n----------------------------------------------------------";

    public void displayIngredients() {

        String input;
        do {
            System.out.println(MENU); // display the main menu

            int numEggs = 0;
            int numFlour = 0;
            int numSugar = 0;
            int numButta = 0;

            try {
                numEggs = ingredientList.getNumOf("eggs");
                numFlour = ingredientList.getNumOf("flour");
                numSugar = ingredientList.getNumOf("sugar");
                numButta = ingredientList.getNumOf("butta");
                // numEggs = ingredientList.getNumOf(null);//this is for testing exception
            } catch (IngredientControlException ice) {
                System.out.println(ice.getMessage());

            }

            System.out.printf("\nSugar - %8d    %5d    %4.2f", numSugar, numSugar * CakeIngredientControl.Ingredient.sugar.weight, numSugar * CakeIngredientControl.Ingredient.sugar.cost); //will display quantity
            System.out.printf("\nFlour - %8d    %5d    %4.2f", numFlour, numFlour * CakeIngredientControl.Ingredient.flour.weight, numFlour * CakeIngredientControl.Ingredient.flour.cost);//will display quantity
            System.out.printf("\nEggs  - %8d    %5d    %4.2f", numEggs, numEggs * CakeIngredientControl.Ingredient.eggs.weight, numEggs * CakeIngredientControl.Ingredient.eggs.cost);//will display quantity
            System.out.printf("\nButta - %8d    %5d    %4.2f", numButta, numButta * CakeIngredientControl.Ingredient.butta.weight, numButta * CakeIngredientControl.Ingredient.butta.cost); //will display quantity
            System.out.println("\n");

            input = this.getCake(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            this.bakeCake(input); // do action based on selection
        } while (!input.equals("back")); // an selection is not "Exit"
    }

    public String getCake() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for menu selection
            System.out.println("How many cakes would you like to bake?");
            System.out.println("Please enter a number 0-5. 0 will take you back a menu. ");

            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();

            try {
                int num = Integer.parseInt(entry);
                if (num > 5 || num < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry - enter a number 0-5.");
                continue; //and repeat again
            }
        }

        return entry; //return the selection
    }

    public void bakeCake(String input) {
        int numOfCakes = 0;
        try {
            numOfCakes = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("You must enter a number 0-5.");
        }
//        if(input.equals("yes")){
//            System.out.println("Sweet, you have made a cake and the sugar is rushing to your head!");
//        }else{
//            System.out.println("You do not have enough ingredients yet");
//           }
    }

}
