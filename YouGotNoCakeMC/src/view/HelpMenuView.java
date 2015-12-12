/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Matt
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
            super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Help Menu!                                             |"
                + "\n----------------------------------------------------------"
                + "\nG - Game Objective"
                + "\nH - How to Move"
                + "\nC - Check Inventory"
                + "\nE - Exit Help"
                + "\n----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
       
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
               return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       }
       return false;
   }
    
    private void gameObjective() {
        System.out.println("Find enough ingredients to bake a cake");
    }


    private void moveInstructions() {
        System.out.println("Using A-Y pick a location");
    }


    private void checkInventoryInstructions() {
        System.out.println("You can check your inventory at any time by going to the check inventory menu and selecting ingredients, gifts or party supply menu options");
    }

}
    

