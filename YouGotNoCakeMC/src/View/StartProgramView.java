/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.ProgramControl;
import Model.Player;
import java.util.Scanner;

/**
 *
 * @author Clayton H. Matt M.
 */
public class StartProgramView {
    public StartProgramView(){
    }
    
    public void startProgram(){
        
        // Display the banner screen
        this.displayBanner();
        
        // Prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n**************************************************");
        
        System.out.println("*                                                *"
                        +"\n* You wake up to find yourself in a closet, as   *"
                        +"\n* you look around you realize there was a        *"
                        +"\n* birthday party. Naturally you go check to      *"
                        +"\n* see if there is any cake left, but to your     *"
                        +"\n* displeasure, there is none left. You wander    *"
                        +"\n* outside to see if you can find any cake.       *"
                        +"\n* You find none and your in a scary neighborhood *");
                                
        System.out.println("*                                                *"
                        +"\n* Grab a plastic fork and a toy bat and see if   *"
                        +"\n* you have what it takes to either find some     *"
                        +"\n* cake or find enough ingridients to make your   *"
                        +"\n* own, but watch out, this place seems shady!!   *");
        
        System.out.println("*                                                *"  
                        +"\n* Good luck and may you find some cake!          *"
                        +"\n*                                                *");
        
        System.out.println("**************************************************");
    
    
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than two characters in lenght)
            if (playersName.length() < 2){
                System.out.println("Invalid name - the name must have at least 3 characters");
                continue; //and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return playersName; //return the name
    }
    
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==================================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you find some cake!");
        System.out.println("\n\n==================================================");
    }
}