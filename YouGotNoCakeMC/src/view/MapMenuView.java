/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import view.LocationView;

/**
 *
 * @author Matt
 */
public class MapMenuView {

    private final String MENU = "\n"
                + "\n----------------------------------------------------------"
                + "\n|Current Location is :(StubFunction for currentPossition)!|"
                + "\n----------------------------------------------------------"
                + "\nA - Garage           | J - Manhole    | S - Library"
                + "\nB - Back Yard        | K - Treehouse  | T - Skate Park"
                + "\nC - Front Yard       | L - Outhouse   | U - Dark Alley"
                + "\nD - Barbershop       | M - Playground | V - Dollar Theater"
                + "\nE - Soviet Bakeshop  | N - School     | W - Motel 6"
                + "\nF - Albertsons       | O - Florist    | X - Police Station"
                + "\nG - Dr Root Dentist  | P - Grandmas   | Y - BYU-I Lab"
                + "\nH - Creepy Guy House | Q - Friends    | Z - BACK-->" 
                + "\nI - Gas Station      | R - Museum     | "
                + "\n----------------------------------------------------------";

    public void viewPlayerMap() {
        
        char selection = ' ';
        do{
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
        }while (selection != 'Z'); // an selection is not "Main Menu"
        
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
            case 'A': // Garage
               this.showGarage();
               break;
            case 'B': // Front Yard
               this.showFrontYard();
               break;
            case 'C': // Back Yard
               this.showBackYard();
               break;
            case 'D': // Barbershop
               this.showBarbershop();
               break;
            case 'E': // Bakeshop
               this.showSovietBakeshop();
               break;
            case 'F': // Albertsons
               this.showAlbertsons();
               break;
            case 'G': // Dentist
               this.showDrRootsDentist();
               break;
            case 'H': // Creepy Guys
               this.showCreepyGuys();
               break;
            case 'I': // Gas Station
               this.showGasStation();
               break;
            case 'J': // Manhole
               this.showManhole();
               break;
            case 'K': // TreeHouse
               this.showTreeHouse();
               break;
            case 'L': // Outhouse
               this.showOuthouse();
               break;
            case 'M': // Playground
               this.showPlayground();
               break;
            case 'N': // School
               this.showSchool();
               break;
            case 'O': // Florist
               this.showFlorist();
               break;
            case 'P': // Grandmas
               this.showGrandmas();
               break;
            case 'Q': // Friends
               this.showFriends();
               break;    
            case 'R': // Museum
               this.showMuseum();
               break;
            case 'S': // Library
               this.showLibrary();
               break;
            case 'T': // Skate Park
               this.showSkatePark();
               break;
            case 'U': // Dark Alley
               this.showDarkAlley();
               break;    
            case 'V': // Dollar Theater
               this.showDollarTheater();
               break;
            case 'W': // Motel 6
               this.showMotel6();
               break;
            case 'X': // Police Station
               this.showPoliceStation();
               break;
            case 'Y': // BYU_I CompLab
               this.showBYUIpcLab();
               break;    
            case 'Z': // return to main menu
               return;    
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
   }

    private void showGarage() {
        //System.out.println("*** showGarage function called ***");
        String place = "Garage";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
        whatsHere.getPlace(place);
    }

    private void showFrontYard() {
        System.out.println("*** showFrontYard function called ***");
    }

    private void showBackYard() {
        System.out.println("*** showBackYard function called ***");
    }

    private void showBarbershop() {
        System.out.println("*** showBarbershop function called ***");
    }

    private void showSovietBakeshop() {
        System.out.println("*** showSovietBakeshop function called ***");
    }

    private void showAlbertsons() {
        System.out.println("*** showAlbertsons function called ***");
    }

    private void showDrRootsDentist() {
        System.out.println("*** showDrRootsDentist function called ***");
    }

    private void showCreepyGuys() {
        System.out.println("*** showCreepyGuys function called ***");
    }

    private void showGasStation() {
        System.out.println("*** showGasStation function called ***");
    }

    private void showManhole() {
        System.out.println("*** showManhole function called ***");
    }

    private void showTreeHouse() {
        System.out.println("*** showTreeHouse function called ***");
    }

    private void showOuthouse() {
        System.out.println("*** showOuthouse function called ***");
    }

    private void showPlayground() {
        System.out.println("*** showPlayground function called ***");
    }

    private void showSchool() {
        System.out.println("*** showSchool function called ***");
    }

    private void showFlorist() {
        System.out.println("*** showFlorist function called ***");
    }

    private void showGrandmas() {
        System.out.println("*** showGrandmas function called ***");
    }

    private void showFriends() {
        System.out.println("*** showFriends function called ***");
    }

    private void showMuseum() {
        System.out.println("*** showMuseum function called ***");
    }

    private void showLibrary() {
        System.out.println("*** showLibrary function called ***");
    }

    private void showSkatePark() {
        System.out.println("*** showSkatePark function called ***");
    }

    private void showDarkAlley() {
        System.out.println("*** showDarkAlley function called ***");
    }

    private void showDollarTheater() {
        System.out.println("*** showDollarTheater function called ***");
    }

    private void showMotel6() {
        System.out.println("*** showMotel6 function called ***");
    }

    private void showPoliceStation() {
        System.out.println("*** showPoliceStation function called ***");
    }

    private void showBYUIpcLab() {
        System.out.println("*** showBYUIpcLab function called ***");
    }
    




}
