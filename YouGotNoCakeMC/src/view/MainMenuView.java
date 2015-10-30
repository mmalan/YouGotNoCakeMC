/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl; 
import java.util.Scanner;
import yougotnocake.YouGotNoCake;
import View.GameMenuView;
import View.HelpMenuView;

/**
 *
 * @author Clayton
 */
public class MainMenuView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Main Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nN - New Game"
                + "\nG - Start Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nE - Exit Game"
                + "\n----------------------------------------------------------";

    public void displayMenu() {
        //System.out.println("*** MainMenuView.displayMenu() function called ***");
        
        char selection = ' ';
        do{
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        }while (selection != 'E'); // an selection is not "Exit"
    }
    
   public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("Enter your menu option:");
            
            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // out of the (exit) the repetition
        }
        
        return entry ; //return the selection
    }
   
   public void doAction(char choice){
       
       switch (choice){
            case 'N': // create and start a new game
               this.startNewGame();
               break;
            case 'G': // get and start an existing game
               this.startExisitingGame();
               break;
            case 'H': // help menu
               this.displayHelpMenu();
               break;
            case 'S': // save game
               this.saveGame();
               break;
            case 'E': // Exit the program
               return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
   }

    private void startNewGame() {
//        create a new game
        GameControl.createNewGame(YouGotNoCake.getPlayer());
        
//        display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
//        System.out.println("*** startNewGame function called ***");
    }

    private void startExisitingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
//        display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
//        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
                
}
