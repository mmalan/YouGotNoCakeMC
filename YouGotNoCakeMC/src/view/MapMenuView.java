/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exceptions.MapControlException;
import Model.Map;
import java.util.InputMismatchException;
import yougotnocake.YouGotNoCake;

/**
 *
 * @author Matt
 */
public class MapMenuView extends View{

    public MapMenuView() {
            super("");
            
//            ("\n"
//                + "\n----------------------------------------------------------"
//                + "\n|Current Location is :(StubFunction for currentPossition)!|"
//                + "\n----------------------------------------------------------"
//                + "\nA - Garage           | J - Manhole    | S - Library"
//                + "\nB - Back Yard        | K - Treehouse  | T - Skate Park"
//                + "\nC - Front Yard       | L - Outhouse   | U - Dark Alley"
//                + "\nD - Barbershop       | M - Playground | V - Dollar Theater"
//                + "\nE - Soviet Bakeshop  | N - School     | W - Motel 6"
//                + "\nF - Albertsons       | O - Florist    | X - Police Station"
//                + "\nG - Dr Root Dentist  | P - Grandmas   | Y - BYU-I Lab"
//                + "\nH - Creepy Guy House | Q - Friends    | Z - BACK-->" 
//                + "\nI - Gas Station      | R - Museum     | "
//                + "\n----------------------------------------------------------"
//            
//                + "\n " + Map.createMap() + ""
//            );
            
            
    }
    
    /**
     *
     */
    @Override
    public void display(){
        String value = "";
        String displayMessage = "";
        boolean done = false;
        
        do{
            System.out.println(getDisplayMessage()); // display prompt message
            value = this.getInput(); //get value end user entered
            done = this.doAction(value); // do action based on value entered
        }
        while (!done);
    }
    
    private String padString(String thisstring, int size) {
        return thisstring;
    } 
    
    private String getDisplayMessage() {
        char letter = 'A';
        String displayMessage = "";
        Map map = yougotnocake.YouGotNoCake.getCurrentGame().getMap();
        int rows = map.getNoOfRows();
        int columns = map.getNoOfColumns();
        displayMessage = "\n" 
                + "\\n----------------------------------------------------------\"\n" 
                + "\\n|Current Location is :" + map.getCurrentLocation() + "\n"
                + "\\n----------------------------------------------------------\"\n";
        for (int r=0; r < rows; r++){
            for (int c=0; c < columns; c++){
                String sletter = Character.toString(letter);
                String currLocation = map.getLocation(r, c).getName();
                if ( map.getLocation(r, c).getVisited())
                    currLocation = "#" + currLocation;
                if ( map.getLocation(r, c).getName() == map.getCurrentLocation())
                    currLocation = "(" + currLocation + ")";
                displayMessage += (sletter + " - " + padString( currLocation,17) + "|"); 
                if (letter != 'Z')
                    letter++;
                else 
                    letter = '1';
                
            }
            displayMessage += ("\n");
        }
        displayMessage += ("----------------------------------------------------------");    
                
        
        return displayMessage;
    }

    private char myGetChar(String val, String allwd, boolean CaseSensitive)
             throws MapControlException {
        
        String value = val;
        String allowed = allwd;
        
        if(value == null || allowed == null){
            throw new MapControlException("MyGetChar- null inputs");
        }
        if (!CaseSensitive){
             value = value.toUpperCase();
             allowed = allowed.toUpperCase();
        }
        
        int n = allowed.length();
        char c = value.charAt(0);
        for(int i = 0; i < n; i++ ){
            if( c == allowed.charAt(i)){
                return c;
            }
        }
        throw new MapControlException("MyGetChar - Didn't find it");
        
    }    
    
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
//        value = value.toUpperCase();
//        char choice = value.charAt(0);
        
        char choice;
        try{ 
           choice = myGetChar(value, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", false);
        }catch(MapControlException me){
                System.out.println("Invaild Choice Please select A - Z");
                return false;//repeat again
        }
       switch (choice){
            case 'A': // Garage
               this.showGarage();
               break;
            case 'B': // Back Yard
               this.showBackYard();
               break;
            case 'C': // Front Yard
               this.showFrontYard();
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
               return true;    
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
       return false;
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
