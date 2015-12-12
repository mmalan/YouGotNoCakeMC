/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yougotnocake;

import Control.ProgramControl;
import Model.Game;
import Model.Player;
import Model.InventoryItem;
import Model.Location;
import Model.Map;
import Model.Progress;
import view.StartProgramView;

/**
 *
 * @authors Matt M. and Clayton
 */
public class YouGotNoCake {

    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        //create StartProgramingView and start the porgram
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        YouGotNoCake.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        YouGotNoCake.player = player;
    }

    public static Map createMap() {
        Map m = new Map(5, 5);
        // (boolean v, String d, char l, int r, int c) {
        m.addLocation(new Location(false, "Garage", 'A', 0, 0));
        m.addLocation(new Location(false, "Back Yard", 'B', 0, 1));
        m.addLocation(new Location(false, "Front Yard", 'C', 0, 2));
        m.addLocation(new Location(false, "BarberShop", 'D', 0, 3));
        m.addLocation(new Location(false, "Soviet Bakeshop", 'E', 0, 4));

        m.addLocation(new Location(false, "Albertsons", 'F', 1, 0));
        m.addLocation(new Location(false, "Dr. Root Dentist", 'G', 1, 1));
        m.addLocation(new Location(false, "Creepy Guy House", 'H', 1, 2));
        m.addLocation(new Location(false, "Gas Station", 'I', 1, 3));
        m.addLocation(new Location(false, "Manhole", 'J', 1, 4));

        m.addLocation(new Location(false, "Treehouse", 'K', 2, 0));
        m.addLocation(new Location(false, "Outhouse", 'L', 2, 1));
        m.addLocation(new Location(false, "Playground", 'M', 2, 2));
        m.addLocation(new Location(false, "School", 'N', 2, 3));
        m.addLocation(new Location(false, "Flourist", 'O', 2, 4));

        m.addLocation(new Location(false, "Grandmas", 'P', 3, 0));
        m.addLocation(new Location(false, "Friends", 'Q', 3, 1));
        m.addLocation(new Location(false, "Musem", 'R', 3, 2));
        m.addLocation(new Location(false, "Library", 'S', 3, 3));
        m.addLocation(new Location(false, "Skate Park", 'T', 3, 4));

        m.addLocation(new Location(false, "Dark Alley", 'U', 4, 0));
        m.addLocation(new Location(false, "Dollar Theater", 'V', 4, 1));
        m.addLocation(new Location(false, "Motel 6", 'W', 4, 2));
        m.addLocation(new Location(false, "Police Station", 'X', 4, 3));
        m.addLocation(new Location(false, "BYU-I Lab", 'Y', 4, 4));

        m.setCurrentPosition(0, 2);

//        private String menuString(){
//        return "\n"
//                + "\n----------------------------------------------------------"
//                + "\n|Current Location is : " + place + "    !|"
//                + "\n----------------------------------------------------------"
//                + "\nA - Garage           | J - Manhole    | S - Library"
//                + "\nB - Back Yard        | K - Treehouse  | T - Skate Park"
//                + "\nC - Front Yard       | L - Outhouse   | U - Dark Alley"
//                + "\nD - Barbershop       | M - Playground | V - Dollar Theater"
//                + "\nE - Soviet Bakeshop  | N - School     | W - Motel 6"
//                + "\nF - Albertsons       | O - Florist    | X - Police Station"
//                + "\nG - Dr Root Dentist  | P - Grandmas   | Y - BYU-I Lab"
//                + "\nH - Creepy Guy House | Q - Friends    | Z - BACK-->" 
//                + "\nI - Gas Station      | R - Museum     | "
//                + "\n----------------------------------------------------------"
//            
//                + "\n ";
//    }
        return m;
    }

}
