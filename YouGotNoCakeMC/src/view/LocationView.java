/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import Model.Location;
/**
 *
 * @author Matt
 */
public class  LocationView {
    
    public static void displayContents(Location l) { 
        
        System.out.println("\n\n==================================================");
        System.out.println("\n You are in the " + l.getDescription() + "!");
        System.out.println("\n==================================================");
        System.out.println("\n You Found:                                       ");
        if(l.getIngredients().getNumOf("eggs") > 0){
            System.out.printf("\n eggs: %2d", l.getIngredients().getNumOf("eggs") );
        }
        if(l.getIngredients().getNumOf("sugar") > 0){
            System.out.printf("\n sugar: %2d", l.getIngredients().getNumOf("sugar") );
        }
        if(l.getIngredients().getNumOf("flour") > 0){
            System.out.printf("\n flour: %2d", l.getIngredients().getNumOf("flour") );
        }
        if(l.getIngredients().getNumOf("butta") > 0){
            System.out.printf("\n butta: %2d", l.getIngredients().getNumOf("butta") );
        }
       if(l.getPartySupplies().getNumOf("pinata") > 0){
            System.out.printf("\n pinata: %2d", l.getPartySupplies().getNumOf("pinata") );
        }
       if(l.getPartySupplies().getNumOf("party hats") > 0){
            System.out.printf("\n party hats: %2d", l.getPartySupplies().getNumOf("party hats") );
        }
       if(l.getPartySupplies().getNumOf("ice cream") > 0){
            System.out.printf("\n ice cream: %2d", l.getPartySupplies().getNumOf("ice cream") );
        }
       if(l.getPartySupplies().getNumOf("plastic forks") > 0){
            System.out.printf("\n plastic forks: %2d", l.getPartySupplies().getNumOf("plastic forks") );
        }
       if(l.getGifts().getNumOf("stuffed unicorn") > 0){
            System.out.printf("\n stuffed unicorn: %2d", l.getGifts().getNumOf("stuffed unicorn") );
        }
       if(l.getGifts().getNumOf("baseball bat") > 0){
            System.out.printf("\n baseball bat: %2d", l.getGifts().getNumOf("baseball bat") );
        }
       if(l.getGifts().getNumOf("pokemon cards") > 0){
            System.out.printf("\n pokemon cards: %2d", l.getGifts().getNumOf("pokemon cards") );
        }
       if(l.getGifts().getNumOf("whoopie cushion") > 0){
            System.out.printf("\n whoopie cushion: %2d", l.getGifts().getNumOf("whoopie cushion") );
        }
       
        System.out.println("\n                                                    ");
        System.out.println("\n It has been added to your inventory!               ");
        
        System.out.println("\n\n==================================================");
          
    }
    
    public String getContents() {
        boolean valid = false; //indicates if the name has been retrieved
        String entry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for menu selection
            System.out.println("Would you like to take the items?");
            System.out.println("Please enter \"yes\" \"no\" or  \"back\" ");
            
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
   
}