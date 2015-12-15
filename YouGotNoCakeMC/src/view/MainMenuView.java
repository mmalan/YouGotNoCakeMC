/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl; 
import yougotnocake.YouGotNoCake;

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
                + "\n| N - New Game                                           |"
                + "\n| G - Start Saved Game                                   |"
                + "\n| H - Get help on how to play the game                   |"
                + "\n| S - Save Game                                          |"
                + "\n| E - Exit Game                                          |"
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
       
        GameControl.createNewGame(YouGotNoCake.getPlayer(), YouGotNoCake.createMap());
               
        
//        display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExisitingGame() {
        try {
            GameControl.loadSavedGame();
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (Exception ex) {
        System.out.println("Saved Game could not be loaded.");
        }
              
    }

    private void displayHelpMenu() {
//        display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        try {
            GameControl.saveGame();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Game could not be saved.");
        }
    }
                
}
