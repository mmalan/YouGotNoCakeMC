/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class HelpMenuView {

    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Help Menu!                                             |"
                + "\n----------------------------------------------------------"
                + "\nG - Game Objective"
                + "\nH - How to Move"
                + "\nC - Check Inventory"
                + "\nE - Exit Help"
                + "\n----------------------------------------------------------";

    public void displayMenu() {
        
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
            System.out.println("What would you like to do next?:");
            
            //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            
            break; // out of the (exit) the repetition
        }
        
        return entry ; //return the selection
    }
    
   
    public void doAction(char choice){
       
       switch (choice){
            case 'G': // Game Objective
               this.gameObjective();
               break;
            case 'H': // How to Move
               this.moveInstructions();
               break;
            case 'C': // Check Inventory
               this.checkInventoryInstructions();
               break;
            case 'E': // Exit Help
               return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
   }
    


    private void gameObjective() {
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
                        +"\n* Your objective is to look everywhere and       *"
                        +"\n* collect as much ingredients as you can before  *"
                        +"\n* the time runs out.                             *"
                        +"\n*                                                *"
                        +"\n* Good luck and may you find some cake!          *");
        
        System.out.println("**************************************************");
    }


    private void moveInstructions() {
        System.out.println("\n\n**************************************************");
        
        System.out.println("*                                                *"
                        +"\n* Move by selecting the next map location        *"
                        +"\n* you would like to try next.                    *");
        System.out.println("*                                                *"  
                        +"\n* Good luck and may you find some cake!          *"
                        +"\n*                                                *");
        
        System.out.println("**************************************************");
    }


    private void checkInventoryInstructions() {
        System.out.println("\n\n**************************************************");
        
        System.out.println("*                                                *"
                        +"\n* You can check your inventory at any time by    *"
                        +"\n* going to the main menu and selecting \"I\".     *");

        System.out.println("*                                                *"  
                        +"\n* Good luck and may you find some cake!          *"
                        +"\n*                                                *");
        
        System.out.println("**************************************************");
    }

}
    

