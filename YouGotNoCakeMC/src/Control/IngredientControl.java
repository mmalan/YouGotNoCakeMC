/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Clayton
 */
public class IngredientControl {
    
    public enum Ingredients{
      eggs(0.22),
      flour(0.27),
      sugar(0.44),
      butta(0.25);
      
      private final double amount;
      
      Ingredients(double amount) {
        this.amount = amount;  
      }
      
      public double getIngredients(){
          return this.amount;
      }
    }
    
}
