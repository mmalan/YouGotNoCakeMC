/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import Control.InventoryControl;
import yougotnocake.YouGotNoCake;
import Model.Game;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Clayton
 */
public class GiftsInventoryView {

    private String menuString() {

        Game game = YouGotNoCake.getCurrentGame();

        return "\r\n"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Gifts Inventory                                        |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Item                   Quantity   Weight    Cost       |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Stuffed Unicorns -       " + InventoryControl.getItem(game.getGifts(), "stuffed unicorn").getItemQuantity() + "         " + InventoryControl.getItem(game.getGifts(), "stuffed unicorn").getItemWeight() + "       " + InventoryControl.getItem(game.getGifts(), "stuffed unicorn").getItemCost() + "       |" //will display quantity
                + "\r\n| BaseBall Bats -          " + InventoryControl.getItem(game.getGifts(), "baseball bat").getItemQuantity() + "         " + InventoryControl.getItem(game.getGifts(), "baseball bat").getItemWeight() + "       " + InventoryControl.getItem(game.getGifts(), "baseball bat").getItemCost() + "       |" //will display quantity
                + "\r\n| Whoopie Cushions -       " + InventoryControl.getItem(game.getGifts(), "whoopie cushion").getItemQuantity() + "         " + InventoryControl.getItem(game.getGifts(), "whoopie cushion").getItemWeight() + "       " + InventoryControl.getItem(game.getGifts(), "whoopie cushion").getItemCost() + "       |" //will display quantity
                + "\r\n| Pokemon Cards -          " + InventoryControl.getItem(game.getGifts(), "pokemon cards").getItemQuantity() + "         " + InventoryControl.getItem(game.getGifts(), "pokemon cards").getItemWeight() + "       " + InventoryControl.getItem(game.getGifts(), "pokemon cards").getItemCost() + "       |" //will display quantity
                + "\r\n----------------------------------------------------------";

    }

    public void displayGifts() {

        String input;
        do {
            System.out.println(menuString()); // display the main menu

            input = this.getGifts(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            this.goToParty(input); // do action based on selection
        } while (!input.equals("back")); // an selection is not "Exit"
    }

    public String getGifts() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for menu selection
            System.out.println("Would you like to go to the party?");
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

    public void goToParty(String input) {

        if (input.equals("yes")) {
            System.out.println("Sweet, you have gifts to go to the party! Have FUN!!!");
        } else {
            System.out.println("You do not have enough gifts to go to the party yet");
        }
    }

    public void saveGiftsToFile() {
        FileWriter outFile = null;
        String filelocation = "Gifts.txt";
        try {
            outFile = new FileWriter(filelocation);
            outFile.write(menuString());
            outFile.flush();
            System.out.println("Gifts.txt saved successfully!");
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
