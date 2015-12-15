/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Clayton
 */
public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Inventory Menu!                                        |"
                + "\n----------------------------------------------------------"
                + "\n| I - View Ingredients                                   |"
                + "\n| S --- Save Ingredients to File                         |"
                + "\n| G - View Gifts                                         |"
                + "\n| F --- Save Gifts to File                               |"
                + "\n| P - View Party Supplies                                |"
                + "\n| J --- Save Pariy Supplies to File                      |"
                + "\n| E - Exit                                               |"
                + "\n----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        try {
        
            String value = (String) obj;

            value = value.toUpperCase();
            char choice = value.charAt(0);

            switch (choice) {
                case 'I': // View Ingriedents
                    this.displayIngredients();
                    break;
                case 'S': // View Gifts
                    this.saveIngredients();
                    break;
                case 'G': // View Gifts
                    this.displayGifts();
                    break;
                case 'F': // Save Gifts
                    this.saveGifts();
                    break;
                case 'P': // View Party Supplies
                    this.displayPartyInventory();
                    break;
                case 'J': // Save Gifts
                    this.savePartyInventory();
                    break;
                case 'C': // View Party Supplies
                    this.displayCake();
                    break;
                case 'E': // Exit Inventory
                    return true;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
        } 
        catch (Exception ex) {
            //log exception to print to file and print to console.
            Control.ExceptionLogging.logException(ex.toString());
                 //{System.out.println("An exception occured!" + ex);

        }
        return false;
    }

    private void displayIngredients() {
        BakeCakeView bakeCake = new BakeCakeView();
        bakeCake.displayIngredients();
    }

    private void saveIngredients() {
        BakeCakeView bakeCake = new BakeCakeView();
        bakeCake.saveIngredientsToFile();
    }

    private void displayGifts() {
        GiftsInventoryView giftsList = new GiftsInventoryView();
        giftsList.displayGifts();
    }

    private void saveGifts() {
        GiftsInventoryView giftsList = new GiftsInventoryView();
        giftsList.saveGiftsToFile();
    }

    private void displayPartyInventory() {
        PartyInventoryView partyList = new PartyInventoryView();
        partyList.displayPartyStuff();
    }
    
    private void savePartyInventory() {
        PartyInventoryView partyList = new PartyInventoryView();
        partyList.savePartyStuffToFile();
    }

    private void displayCake() {
        YouWinView youWin = new YouWinView();
        youWin.displayYouWin();
    }    
}
