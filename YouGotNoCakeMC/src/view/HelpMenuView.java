/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
        System.out.println("*** gameObjective function called ***");
    }


    private void moveInstructions() {
        System.out.println("*** moveInstructions function called ***");
    }


    private void checkInventoryInstructions() {
        System.out.println("*** checkInventoryInstructions function called ***");
    }

}
    

