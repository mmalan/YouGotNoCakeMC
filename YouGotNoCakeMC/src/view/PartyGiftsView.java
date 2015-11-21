/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.IngredientControl;
import java.util.Scanner;
import Control.PartyGifts;
import java.util.ArrayList;

/**
 *
 * @author Clayton
 */
public class PartyGiftsView {
    
   private String MENU; 
    
   private PartyGifts giftList;
   
   PartyGiftsView(){
       
       giftList = new PartyGifts();
       
       int i;
       
       MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n| Party Gifts                                             |"
                + "\n----------------------------------------------------------"
                + "\n";
       ArrayList<String> obj = giftList.getObj();
       
       for( i = 0; i < obj.size(); i++){
           MENU += i + " " + obj.get(i) + "\n";
       }
       MENU+= "----------------------------------------------------------";
       
       //System.out.println("" +giftList.getObj());
   }
    public void displayGifts() {
                
        String input;
        do{
            System.out.println(MENU); // display the main menu
            
            input=this.getGifts(); // get the user's selection
            //String answer = input.(yes); // get first character of string
            
            //this.bakeCake(input); // do action based on selection
        }while (!input.equals("back")); // an selection is not "Exit"
    }
    
    public String getGifts() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("Would you like go back to menu");
            System.out.println("Please enter back");
            
             //get selection from the keyboard and trim off the blanks
            entry = keyboard.nextLine();
            entry = entry.trim();
            entry = entry.toLowerCase();
            
            if (entry.length() < 2){
                System.out.println("Invalid entry - back");
                continue; //and repeat again
            }
            break; 
        }
        
        return entry ; //return the selection
    }
   
//   public void bakeCake(String input){
//       
//        if(input.equals("yes")){
//            System.out.println("Sweet, you have made a cake and the sugar is rushing to your head!");
//        }else{
//            System.out.println("You do not have enough ingredients yet");
//           }
//       }
    
}
