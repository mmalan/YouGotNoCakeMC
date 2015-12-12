/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Clayton
 */
public class IngredientControlException extends Exception {

    public IngredientControlException() {
    }

    public IngredientControlException(String string) {
        super(string);
    }

    public IngredientControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public IngredientControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public IngredientControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
