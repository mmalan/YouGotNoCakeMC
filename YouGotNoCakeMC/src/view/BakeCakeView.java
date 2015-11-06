/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Clayton
 */
public class BakeCakeView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Cake Ingredients                                       |"
                + "\n----------------------------------------------------------"
                + "\nSugar" //will display quantity
                + "\nEggs" //will display quantity
                + "\nButta" //will display quantity
                + "\nFlour" //will display quantity
                + "\nback" //will take you back to inventory menu
                + "\n----------------------------------------------------------";
    
    
     public void displayIngredients() {
                
        String input;
        do{
            System.out.println(MENU); // display the main menu
            
            input=this.getCake(); // get the user's selection
            //String answer = input.(yes); // get first character of string
            
            this.bakeCake(input); // do action based on selection
        }while (!input.equals("back")); // an selection is not "Exit"
    }
    
    public String getCake() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("Would you like to bake a cake? yes or no?");
            
             //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            entry = entry.toLowerCase();
            
            if (entry.length() < 2){
                System.out.println("Invalid entry - enter yes, no or back");
                continue; //and repeat again
            }
            break; 
        }
        
        return entry ; //return the selection
    }
   
   public void bakeCake(String input){
       
        if(input.equals("yes")){
            System.out.println("Sweet, you have made a cake and the sugar is rushing to your head!");
        }else{
            System.out.println("You do not have enough ingredients yet");
           }
       }
   }