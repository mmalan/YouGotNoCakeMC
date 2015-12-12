/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 */ //@author MattMalan
    
import Model.Game;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import view.View;
import yougotnocake.YouGotNoCake;

public class YouWinView {

    private static String menuString() {

        return("\n"
                + "\r\n-----------------------------------------------------------------------------------"
                + "\r\n|                                  YOU WIN!!!                                     |"
                + "\r\n-----------------------------------------------------------------------------------"
                + "\r\n                                      MM                                           "
                + "\r\n                                     MIIM                                          "
                + "\r\n                                    MII+IM                                         "
                + "\r\n                                    DII++IM                                        "
                + "\r\n                                   MII+M+IM                    M                   "
                + "\r\n            M                      MI++M+7M                    MM                  "
                + "\r\n           MIZM                      MMM                       MIM                 "
                + "\r\n           NIIIM                    MMMMMNMMM                 MIIIM                "
                + "\r\n          MI++IIM                   M+7777777M     M         MOI++IM               "
                + "\r\n          MI+D+IIM           M      M+++77777M     M         8I?++?I               "
                + "\r\n          MI+M++IM          MIM      MI+7777$     MIM       MII+I++I               "
                + "\r\n           MMMMMM           IIIM     M8+77777    MI+IOM      MMNMMM                "
                + "\r\n           MMMMMNM         MI+IIM     M++7777M   MI++IIM      MMMMMMMM             "
                + "\r\n         M7ZMMO777M        NIO+IIMMMMMM?+7777MMMM8I+Z+IIM    M?DNNN7777            "
                + "\r\n         I++77777$M       M8I+M+IIMZZZZI+7777MZZZMI+M++IM    MI+?777777            "
                + "\r\n         M7+I7777M MMMM8ZZZMI+?+IM+:::II+7777MZZZZMMMMM=ZZZMMMM?+77777M            "
                + "\r\n          M++7777MDZZZZZZZZZZZZMZNZZZZZM+7777MZ:ZZZ88MMOM::::ZZM+I7777M            "
                + "\r\n          M7+7777MZZI::ZZZMMNIMMM8NZZZZZZZZZZZ::M7OMM7777+:::::8++7777MM           "
                + "\r\n          MD+7777M:::+ZZZM?+777777OZZZZZZZZZZ::+D++777778ZZZZZZZO+7777NZZMM        "
                + "\r\n        MMZM+77778OZZZZZZZM++77777MZZZZZZZZZ:::Z87++7777MZZZZ?::M+7777$ZZZZMM      "
                + "\r\n       MZZZM+I7777MZZZZZZZZ7+I7777MZZZZZZZZZZZZZZM7+7777MZZ:::::N+I7777OZZZ:DM     "
                + "\r\n       MZZZD+I7777M:::::::ZM++7777MZZZZZZZZZZZZZZD$+7777MZZ$:?ZZM+77777MZ:::ZM     "
                + "\r\n      MZZZZZMMMMM+~:::?ZZZZMI+7777MZZZZZZZZZZZZZZZM+?777MZZZZZZZZNMMMMZZZ:::ZMM    "
                + "\r\n      MZZ::$ZZZZZZZZZZZZZZZO7+7777MZZZZZZZZ?::=ZZZM++7777OZ?:::::::7ZZZZ+::ZZMM    "
                + "\r\n      MZZZ:::ZZZZZZZZZZZZZI:$+?777ZZZZZZZZZZ:::$ZZO++7777MZZZZZZZ$7ZZZZZ::ZZZM     "
                + "\r\n      M:?ZZZ7:+ZZZZZZZZZ$::ZN+?7777ZZZZZZZZZ:::ZZZZZ+7777MZZZZZZZZZZZZZ::ZZ~~M     "
                + "\r\n       MMMMZZZZZ::::ZZZZZZZZM777OMNZZZZZZZZZZZZZZZ$IMMN:::::::::::$ZZZZZZZ::DM     "
                + "\r\n        MDDMZZZZZZZZZZZZZZZI::::::=ZZZZZZZZZZZZZZZ:::::::::::=ZZZZZZZZZZMMMMM      "
                + "\r\n        MDDMZZZZZZZZZZZZZZZZZ::::::::::::::::ZZZZZZ~::::~$ZZZZZZZZZZZZZMDDDDM      "
                + "\r\n        MDDMZZZZMDNMMZZZZZZZZZZZZZZZZZ7?=?7ZZZZZZZZZZZZZZZZZZZZZZZZZ:::MDDDDM      "
                + "\r\n        MDDN8:::MDDDDMZZZZZNMMMMOZZZZZZZZZZZZZZZZZZZZZZZZZZZMMMMMZZZ::?MDDDDM      "
                + "\r\n        MDDDMN:OMDDDDMMZZMDDDDDDDDMMZZZZZZZZZZZZMMDMZZZZ::NMDDDDDNMMMMMDDDMMZM     "
                + "\r\n       MMMMMDDDDDDDDDDMZ:MDDDDDDDDDMOZZZZZZZZZZMDDDDMZI::MDDDDDDDDDDDDDMMZZZ=M     "
                + "\r\n      MZZZZZZMMDDDDDDDM:IMDDDDDDDDDDMZZZZZZ::MMDDDDDDMM:MDDDDDDDDDDDMMOZZZZ:7M     "
                + "\r\n      MZZZZZZZZMMNDDDDDDDDDDDDDDDDDDDMZZZ:::MNDDDDDDDDDDDDDDDDDDMMMZZZZZZZ=:M      "
                + "\r\n      MZZZZZZZZZZZZDMMMMDDDDDDDDDDDDDDMM~:$MDDDDDDDDDDDDDDDDMMMDZZZZZZZZZZ~:M      "
                + "\r\n      MZZZ$Z8OZZZZZZZZZZZ8MMMMDDDDDDDDDDDDDDDDDDDDDDMMMMMDZZZZZZZZZZZ:OMMMMMMMM    "
                + "\r\n    MM7M:$MDDDDMMZZZZZZZZZZZZZZZZNMMMMMMMMMMMMMM8ZZZZZZZZZZZZZZZZZZZ:MMDDDDDMIIMM  "
                + "\r\n   MMIIIMDDDDDDDDMMZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ:=MDNMMMDDDDDDDMIIIMM "
                + "\r\n   MIIIIDDDDDDDDDDDMZZ?:=OZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ::MDDDDDDDDDDDDDMIIIIMM"
                + "\r\n   MIIIIIMMDDDDDDDDMD::MMDDNMMMMMMZZZZZZ++ZMDDDDMMZZZZZZZZZZZMNDDDDDDDDDDDDMIIIIIMM"
                + "\r\n   MIIIIIIIMNDDDDDDDDDDDDDDDDDDDDDMN7$Z::=MDDDDDDDMMZ:::::NMDDDDDDDDDDDDDM7IIIIIIM "
                + "\r\n   MMIIIIIIIIMMDDDDDDDDDDDDDDDDDDDDNMNI$MMDDDDDDDDDDMMMMMDDDDDDDDDDDDDNMIIIIIIIIMM "
                + "\r\n     M$IIIIIIIIIMMMDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDMMIIIIIIIIIIM   "
                + "\r\n      MMDIIIIIIIIIIIZMMMNDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDMMMDIIIIIIIIIIIDMM    "
                + "\r\n         MMMIIIIIIIIIIIIIII$MMMMMMNDDDDDDDDDDDDDDDNMMMMMMOIIIIIIIIIIIIIIIMMM       "
                + "\r\n            MMMMIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIMMMM          "
                + "\r\n                 MMMMMZIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII7MMMMM               "
                + "\r\n                        MMMMMMMMDZ7IIIIIIIIIIIIIIIIZDMMMMMMMM                      "
                + "\r\n                                 MMMZ8DNNMMMNND8Z77MMMM                            "
                + "\r\n-----------------------------------------------------------------------------------");
    }

    

    public static void displayYouWin() {

        String input;
        do {
            System.out.println(menuString()); // display the main menu

            input = getCake(); // get the user's selection
            //String answer = input.(yes); // get first character of string

            saveCake(input); // do action based on selection
        } while (!input.equals("back")); // an selection is not "Exit"
    }

    public static String getCake() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for menu selection
            System.out.println("Would you like to go to save your cake?");
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

    public static void saveCake(String input) {

        if (input.equals("yes")) {
            saveCakeToFile();
        } else {
            System.out.println("Enjoy your cake!");
        }
    }

    public static void saveCakeToFile() {
        FileWriter outFile = null;
        String filelocation = "Cake.txt";
        try {
            outFile = new FileWriter(filelocation);
            outFile.write(menuString());
            outFile.flush();
            System.out.println("Cake.txt saved successfully!");
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
