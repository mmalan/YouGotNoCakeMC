/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Matt M.
 */
public class calcCostOfItem {
        
    public double calcCostOfItem(double numOfItems, String items){
             
        String list[] = {"egg", "sugar", "flour", "butta" };
        double totalCost = 0;
        double costConversion;
        
        if (numOfItems < 0 || numOfItems > 4){
            return -1;
        }    
        
        if (items.equals(list[0])){
            costConversion = 0.25;
        }            
        else if (items.equals(list[1])){
            costConversion = 1.00;
        }            
        else if (items.equals(list[2])){
            costConversion = 5.00;
        }            
        else if (items.equals(list[3])){
            costConversion = 1.00;
        }
        else {
            return -1;
        }        
        
        totalCost = totalCost + (numOfItems * costConversion); //sums the items costs together

        return totalCost;
        }      

}
