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
                + "\r\n                                       =M                                          "                                        
                + "\r\n                                      OIM                                          "
                + "\r\n                                     ~MI?M                                         "
                + "\r\n                                    D7IIZ,M                                        "
                + "\r\n                                   .OI$$Z,7=                                       "
                + "\r\n                                   MI$$$Z,?O                                       "
                + "\r\n                                   DI$$7$,7=                                       "
                + "\r\n                                    M7INI7M                                        "
                + "\r\n                                      OM7                                          "
                + "\r\n                                    =?+M??                                         "
                + "\r\n                                    M~~~~?,                                        "
                + "\r\n                                    M~, ~?,                                        "
                + "\r\n                                    M~, ~?,                                        "
                + "\r\n                                    M~, ~?,                                        "
                + "\r\n                                    M~, ~?,                                        "
                + "\r\n                                    M~:.~?.                                        "
                + "\r\n                      ,INMMMMMNO$+++N~:,~?++++$ONMMMMMD?.                          "
                + "\r\n               +MMMZ=::~~~~~::,,,,,~8~~,~?~~:::~~~~~~~~~::~$MMN~                   "
                + "\r\n          ~MM7:~~~:,,,,,,,,,,,,,,,,~O~~,~?~~,,,,,,,,,,,,,,,,:~~::7MM,              "
                + "\r\n       ?M:~:,,,,,,,,,,,,,,,,,,,,,,,~Z~~,~?~~,,,,,,,,,,,,,,,,,,,,,,,,::M=           "
                + "\r\n      M::,,,,,,,,,,,,,,,,,,,,,,,,,,~$~~,~?~~,,,,,,,,,,,,,,,,,,,,,,,,,,,:M          "
                + "\r\n     D::,,,,,,,,,,,,,,,,,,,,,,,,,,,~$DDDDN~~,,,,,,,,,,,,,,,,,,,,,,,,,,,~:D         "
                + "\r\n     I$~,,,,,,,,,,,,,,,,,,,,,,,,,,,~~~~~~~~~,,,,,,,,,,,,,,,,,,,,,,,,..~~$I         "
                + "\r\n     ,=7M:~,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,......,,,,,,,,........~~:M7+,         "
                + "\r\n      $~~~MM=:~,...,,,,,,,,,,,,,,,,,,,,,......................:~~:=MM~~~Z          "
                + "\r\n      M~~~,~:=MMN+:::..................................,~~~::+NMM=:~~,~:M          "
                + "\r\n      M:~~,,,,,,,~::IMMMMD7+::::~~~~~~~~~~~~~~:::::+7DMMMMI::~~~~,,,,,~:M          "
                + "\r\n      M~~~,,,,,,,,,,,,,,,,,,,,:::::::::::::::~~~~::.,:,,,,,,,,,,,,,,,,~~M          "
                + "\r\n      OI~~,,,,,,,,,,,,,,,:I~,,,,,....................,,,,,,$M~,,,,,,,,~ID          "
                + "\r\n      ?8~~,,,,,,,,,,,,,,,$NM~,,,,...................,,,,,,:M7M~~,,,,,,~DI          "
                + "\r\n      .M~~,,,,,,,,,,,,,:I$77M~~,,,..................,,,,,:M777M:~:,,,:~M,          "
                + "\r\n       M~~:,,,,,,,,,,,:IZ7777M:~,,..................,,,,~+Z?77IMN~~,,~~M           "
                + "\r\n       M~~~,,,,,,,,,,:M$77M777M:~,,.................,,,~ZM77MD7+7M~~,~:M           "
                + "\r\n       Z:~~,,,,,,,,~DO7?7M:M777M+~,,................,,~7$7~ZNN7+~77MM~:D           "
                + "\r\n       ~~~~,,,::+MO77~~7M~~~Z7~77MZ~,..............,~:M7~~7M:~M77~~~I77=           "
                + "\r\n        MMMMMD$77?~~~77M:~~~N77~I77MI~~...........~:MD7~~7M:~~~M$7~~~7O            "
                + "\r\n        M777~~~~~~~~77M:~:,~~MZ7~~?77DMZ:~:,::~~:IM$7=~~7O~~~:~~ID7777M            "
                + "\r\n        M777~~~~~+77$M:~~,,,~~IO7~~~=7777$DMMMMZ777~~~~7M=~~,,:~~:M777M            "
                + "\r\n        M777777777MN~~~,,,,,,~~:M777~~~~~~~~~~~~~~~~~7$N~~~,,,,,~~~~~MM            "
                + "\r\n        M77777OMM~~~~~,,,,,,,,:~~=M$777~~~~~~~~~~~I7$M:~~:,,,,,,,,~~~:M            "
                + "\r\n        $:::::~~~~~~,,,,,,,,,,,,~~~:NMO77777777777MN:~~~,,,,,,,,,,,:~:D            "
                + "\r\n       ~M=~~~~~~~,,,,,,,,,,,,,,,,:~~~~~:I8MMMMM$~:~~~~,,,,,,,,,,,,,~~~D            "
                + "\r\n    MM$$$Z~~~,,,,,,,,,,,,,,,,,,,,,,,,~~~~~~~~~~~~~.,,,,,,,,,,,,,,,,~~7$$$MM        "
                + "\r\n ~MZ$$$$$M~~~,,,,,,,,,,,,,,,,,,,,,,,,,,,...........,,,,,,,,,,,,,,,,~~N$$$$$ZM,     "
                + "\r\nDZ$I????$M:~~,,,,,,,,,,,,,,,,,,,,,,,,,,,...........,,,,,,,,,,,,,,,,~:M$$???$$ZN    "
                + "\r\nD???????$$ZMM:,,,,,,,,,,,,,,,,,,,,,,,,,,...........,,,,,,,,,,,,,,:MMZ$$??????$DN   "
                + "\r\nO??????????I$$$ZNMDI:,,,,,,,,,,,,,,,,,,,,..........,,,,,::~IDMNZ$$$$?????????IOM   "
                + "\r\nM$??????????????$$$$$Z8MMMM8I=:,,,,,,,,,,,.....,:=I8MMMM8Z$$$$$I????????????$$M    "
                + "\r\n ON$??????????????????7$$$$$$$$$$$ZZOOOOOOOZZ$$$$$$$$$$7??????????????????$$NO     "
                + "\r\n   =MZ7?????????????????????????????????????~,....????????????????????I$$ZM=       "
                + "\r\n       IMM$7???????????????????????????????.........?????????????I$$$MMI           "
                + "\r\n           ,DMMD$I?????????????????????????..........??+=,,?$$$DMMD,               "
                + "\r\n                 ,IDMMMMNZ$7I??+=======~,......,~=I$OODMMMMDI,                     "
                + "\r\n                             .~=IZZDMMMMMMMDZZI=~.                                 "
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
