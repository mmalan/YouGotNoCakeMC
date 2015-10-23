/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Clayton H. & Matt M.
 */
public class calcItemToPounds {
        
    public double calcItemToPounds(double numOfItems, String items){
        
        //String[] items = {"egg", "sugar", "flour", "butta" };
        items = items;
        double itemToLbs = 0;
        double totalItemsLbs = 0;
        
        String list[] = {"egg", "sugar", "flour", "butta" };
        
        if (numOfItems < 0 || numOfItems > 4){
            return -1;
        }    
       
        if (!items.equals(list[0])){
            return -1;
        }        
        
        if (items.equals(list[0])){
            itemToLbs = 0.22;
        }            

        if (items.equals(list[1])){
            itemToLbs = 0.275;
        }            

        if (items.equals(list[2])){
            itemToLbs = 0.44;
        }            

        if (items.equals(list[3])){
            itemToLbs = 0.25;
        }

        totalItemsLbs = totalItemsLbs + (numOfItems * itemToLbs); //sums the items weight together

        return totalItemsLbs;
        }      

}
