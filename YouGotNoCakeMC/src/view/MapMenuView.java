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
    }

    private void showFrontYard() {
        String place = "Front Yard";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showBackYard() {
        String place = "Back Yard";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showBarbershop() {
        String place = "Barbershop";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showSovietBakeshop() {
        String place = "Soviet Bakeshop";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showAlbertsons() {
        String place = "Albertsons";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showDrRootsDentist() {
        String place = "Dentists Office";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showCreepyGuys() {
        String place = "Creepy Guys House";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showGasStation() {
        String place = "Gas Station";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showManhole() {
        String place = "Man Hole";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showTreeHouse() {
        String place = "Tree House";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showOuthouse() {
        String place = "Out House";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showPlayground() {
        String place = "Playground";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showSchool() {
        String place = "School";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showFlorist() {
        String place = "Florist Shop";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showGrandmas() {
        String place = "Grandmas";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showFriends() {
        String place = "Friend House";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showMuseum() {
        String place = "Museum";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showLibrary() {
        String place = "Library";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showSkatePark() {
        String place = "Skate Park";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showDarkAlley() {
        String place = "Dark Alley";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showDollarTheater() {
        String place = "Dollar Theater";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showMotel6() {
        String place = "Motel 6";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showPoliceStation() {
        String place = "Police Station";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }

    private void showBYUIpcLab() {
        String place = "BYU-I PC Lab";
        LocationView whatsHere= new LocationView();
        whatsHere.displayContents(place);
    }
    




}