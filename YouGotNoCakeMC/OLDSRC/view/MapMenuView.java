/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exceptions.MapControlException;
import java.util.Scanner;
import Model.Location;
import yougotnocake.YouGotNoCake;
import Model.Map;

/**
 *
 * @author Matt
 */
public class MapMenuView {

    public void MapMenu() {
    }

    private String menuString() {

        Map m = YouGotNoCake.getCurrentGame().getMap();
        Location l = m.getLocationAt(m.getCurrentRow(), m.getCurrentColumn());
        String placeName;
        if (l == null) {
            placeName = "Nowhere";
        } else {
            placeName = l.getDescription();
        }
        return "\n"
                + "\n----------------------------------------------------------"
                + "\n|Current Location is : " + placeName + "    !|"
                + "\n----------------------------------------------------------"
                + "\nA - Garage           | J - Manhole    | S - Library"
                + "\nB - Back Yard        | K - Treehouse  | T - Skate Park"
                + "\nC - Front Yard       | L - Outhouse   | U - Dark Alley"
                + "\nD - Barbershop       | M - Playground | V - Dollar Theater"
                + "\nE - Soviet Bakeshop  | N - School     | W - Motel 6"
                + "\nF - Albertsons       | O - Florist    | X - Police Station"
                + "\nG - Dr Root Dentist  | P - Grandmas   | Y - BYU-I Lab"
                + "\nH - Creepy Guy House | Q - Friends    | Z - BACK-->"
                + "\nI - Gas Station      | R - Museum     | "
                + "\n----------------------------------------------------------"
                + "\n ";
    }

    private char myGetChar(String val, String allwd, boolean CaseSensitive)
            throws MapControlException {

        String value = val;
        String allowed = allwd;

        if (value == null || allowed == null) {
            throw new MapControlException("MyGetChar- null inputs");
        }
        if (!CaseSensitive) {
            value = value.toUpperCase();
            allowed = allowed.toUpperCase();
        }

        int n = allowed.length();
        char c = value.charAt(0);
        for (int i = 0; i < n; i++) {
            if (c == allowed.charAt(i)) {
                return c;
            }
        }
        throw new MapControlException("MyGetChar - Didn't find it");

    }

    public void displayMap() {

        String input;
        do {
            System.out.println(menuString()); // display the main menu
            Map m = YouGotNoCake.getCurrentGame().getMap();
            System.out.println("Map");
            System.out.println("* - Current Location");
            System.out.println("v - Visitied Location");
            for (int i = 0; i < m.getNoOfRows(); i++) {
                for (int j = 0; j < m.getNoOfColumns(); j++) {
                    System.out.print("----");
                }
                System.out.println();
                for (int j = 0; j < m.getNoOfColumns(); j++) {
                    Location l = m.getLocationAt(i, j);
                    if (l == null) {
                        System.out.print("|   ");

                    } else {
                        char specialChar = ' ';
                        if ((i == m.getCurrentRow()) && (j == m.getCurrentColumn())) {
                            specialChar = '*';
                        } else if (l.getVisited()) {
                            specialChar = 'v';
                        }
                        System.out.print("|" + l.getLetter() + " " + specialChar);
                    }
                }
                System.out.println("|");
            }

            for (int j = 0; j < m.getNoOfColumns(); j++) {
                System.out.print("----");
            }
            System.out.println();

            input = this.getMap(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            this.doAction(input); // do action based on selection
        } while (!input.equals("Z")); // an selection is not "Exit" 
    }

    public String getMap() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for menu selection
            System.out.println("Where would you like to go?");
            System.out.println("Please enter \"A\" - \"Y\" or  \"Z\" to go back.");

            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            //entry = entry.toLowerCase();

            if (entry.length() < 1) {
                System.out.println("Invalid Entry - Enter A-Y or Z to go back");
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

//    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice;
        try {
            choice = myGetChar(value, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", false);
        } catch (MapControlException me) {
            System.out.println("Invaild Choice Please select A - Z");
            return false;//repeat again
        }

        if (choice == 'Z') {
            return true;
        }

        Map m = YouGotNoCake.getCurrentGame().getMap();

        Location l = m.findLocationByLetter(choice);
        if (l == null) {
            System.out.println("Invaild Choice Please select A - Z");
            return false;
        }
        System.out.println("Location " + l.getDescription());

        m.setCurrentPosition(l.getRow(), l.getColumn());

        return false;
    }

}
