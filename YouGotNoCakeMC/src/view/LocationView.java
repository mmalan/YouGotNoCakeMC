/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class LocationView {

    public String displayContents(String location) {

        String input;
        do {
            System.out.println("\n\n==================================================");
            System.out.println("\n You are in the " + location + "!");
            System.out.println("\n==================================================");
            System.out.println("\n  Sugar ##  Butta ##  Flour ##  Eggs ##");
            System.out.println("\n\n==================================================");

            input = this.getContents(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            this.takeStuff(input); // do action based on selection
        } while (!input.equals("back"));
        { // an selection is not "Exit"
        }
        return null;
    }

    public String getContents() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for menu selection
            System.out.println("Would you like to take the items?");
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

    public void takeStuff(String input) {

        if (input.equals("yes")) {
            InventoryControl.getItem(yougotnocake.YouGotNoCake.getCurrentGame().getIngredients(), "eggs").addToQuantity(2);
            System.out.println("Your items are in your basket!");
        } else {
            System.out.println("You have too much in your basket!");
        }
    }
}
