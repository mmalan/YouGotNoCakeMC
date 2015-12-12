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
public class PartyInventoryView {

    private String menuString() {

        Game game = YouGotNoCake.getCurrentGame();

        return "\r\n"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Party Inventory                                        |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Item                   Quantity   Weight    Cost       |"
                + "\r\n----------------------------------------------------------"
                + "\r\n| Pinata -                 " + InventoryControl.getItem(game.getPartySupplies(), "pinata").getItemQuantity() + "         " + InventoryControl.getItem(game.getPartySupplies(), "pinata").getItemWeight() + "       " + InventoryControl.getItem(game.getPartySupplies(), "pinata").getItemCost() + "       |" //will display quantity
                + "\r\n| Party Hats -             " + InventoryControl.getItem(game.getPartySupplies(), "party hats").getItemQuantity() + "         " + InventoryControl.getItem(game.getPartySupplies(), "party hats").getItemWeight() + "       " + InventoryControl.getItem(game.getPartySupplies(), "party hats").getItemCost() + "       |" //will display quantity
                + "\r\n| Plastic Forks -          " + InventoryControl.getItem(game.getPartySupplies(), "plastic forks").getItemQuantity() + "         " + InventoryControl.getItem(game.getPartySupplies(), "plastic forks").getItemWeight() + "       " + InventoryControl.getItem(game.getPartySupplies(), "plastic forks").getItemCost() + "       |" //will display quantity
                + "\r\n| Ice Cream -              " + InventoryControl.getItem(game.getPartySupplies(), "ice cream").getItemQuantity() + "         " + InventoryControl.getItem(game.getPartySupplies(), "ice cream").getItemWeight() + "       " + InventoryControl.getItem(game.getPartySupplies(), "ice cream").getItemCost() + "       |" //will display quantity
                + "\r\n----------------------------------------------------------";

    }

    public void displayPartyStuff() {

        String input;
        do {
            System.out.println(menuString()); // display the main menu

            input = this.getParty(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            this.goToParty(input); // do action based on selection
        } while (!input.equals("back")); // an selection is not "Exit"
    }

    public String getParty() {
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

    public void savePartyStuffToFile() {
        FileWriter outFile = null;
        String filelocation = "PartyStuff.txt";
        try {
            outFile = new FileWriter(filelocation);
            outFile.write(menuString());
            outFile.flush();
            System.out.println("PartyStuff.txt saved successfully!");
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
