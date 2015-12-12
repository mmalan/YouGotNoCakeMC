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
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clayton
 */
public class BakeCakeView {

    private String menuString() {

        Game game = YouGotNoCake.getCurrentGame();

        return "\r\n"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Cake Ingredients                                       |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Item    Quantity   Weight    Cost                      |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Sugar -   " + InventoryControl.getItem(game.getIngredients(), "sugar").getItemQuantity() + "        " + InventoryControl.getItem(game.getIngredients(), "sugar").getItemWeight() + "       " + InventoryControl.getItem(game.getIngredients(), "sugar").getItemCost() + "                       |" //will display quantity
                + "\r\n| Eggs -    " + InventoryControl.getItem(game.getIngredients(), "eggs").getItemQuantity() + "        " + InventoryControl.getItem(game.getIngredients(), "eggs").getItemWeight() + "      " + InventoryControl.getItem(game.getIngredients(), "eggs").getItemCost() + "                       |" //will display quantity
                + "\r\n| Butta -   " + InventoryControl.getItem(game.getIngredients(), "butta").getItemQuantity() + "        " + InventoryControl.getItem(game.getIngredients(), "butta").getItemWeight() + "      " + InventoryControl.getItem(game.getIngredients(), "butta").getItemCost() + "                       |" //will display quantity
                + "\r\n| Flour -   " + InventoryControl.getItem(game.getIngredients(), "flour").getItemQuantity() + "        " + InventoryControl.getItem(game.getIngredients(), "flour").getItemWeight() + "       " + InventoryControl.getItem(game.getIngredients(), "flour").getItemCost() + "                       |" //will display quantity
                + "\r\n----------------------------------------------------------";

    }

    public void displayIngredients() {

        String input;
        do {
            System.out.println(menuString()); // display the main menu

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
            System.out.println("Would you like to bake a cake?");
            System.out.println("Please enter \"yes\" \"no\" or  \"back\" ");

            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            entry = entry.toLowerCase();

            if (entry.length() < 2) {
                System.out.println("Invalid entry - enter yes, no or back");
                continue; //and repeat again
            }
            break;
        }

        return entry; //return the selection
    }

    public void bakeCake(String input) {

        if (input.equals("yes")) {
            System.out.println("Sweet, you have made a cake and the sugar is rushing to your head!");
        } else {
            System.out.println("You do not have enough ingredients yet");
        }
    }

    public void saveIngredientsToFile() {
        FileWriter outFile = null;
        String filelocation = "Ingredients.txt";
        try {
            outFile = new FileWriter(filelocation);
            outFile.write(menuString());
            outFile.flush();
            System.out.println("Ingredients.txt saved successfully!");
        } catch (IOException ex) {
            System.out.println("Error Saving File.");
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException ex) {

                }
            }
        }
    }
}
