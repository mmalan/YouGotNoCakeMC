/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author MattMalan
 */
public class ExceptionLogging {
    
    public static void logException(String error) {
        System.out.println("An exception occured!" + error);
        //open file and print(append) error to it.
    }
    
}
