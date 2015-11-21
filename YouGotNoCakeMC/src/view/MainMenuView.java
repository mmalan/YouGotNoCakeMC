/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl; 
import java.util.Scanner;
import yougotnocake.YouGotNoCake;
import view.GameMenuView;
import view.HelpMenuView;
import view.View;

/**
 *
 * @author Clayton H. & Matt M.
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
            super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Main Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nN - New Game"
                + "\nG - Start Saved Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nE - Exit Game"
                + "\n----------------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
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
               return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
       return false;
   }

    private void startNewGame() {
//        create a new game
        GameControl.createNewGame(YouGotNoCake.getPlayer());
        
//        display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
//        System.out.println("*** startNewGame function called ***");
    }

    private void startExisitingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
//        display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
//        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
                
}
