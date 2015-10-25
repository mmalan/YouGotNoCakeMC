/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Clayton
 */
public class calcWeightOfCartTest {
    
    public calcWeightOfCartTest() {
    }

    /**
     * Test of calcWeightOfCart method, of class calcWeightOfCart.
     */
    @Test
    public void testCalcWeightOfCart() {
        System.out.println("calcWeightOfCart");
        
         /**********************
         * Test case #1
         *********************/
        System.out.println("\tTest case #1");
         
        //input values for test case 1
        double totalItemsLbs = 0.44;
        String item = "egg";
        
        //create instance of CalcWeightControl class
        calcWeightOfCart instance = new calcWeightOfCart();
               
        double expResult = 0.44;//expected output returned value
        
        //call function to run test
        double result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
         /**********************
         * Test case #2
         *********************/
        System.out.println("\tTest case #2");
         
        //input values for test case 2
        totalItemsLbs = 0.44;
        item = "EGG";
                          
        expResult = -1;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        /**********************
         * Test case #3
         *********************/
        System.out.println("\tTest case #3");
         
        //input values for test case 3
        totalItemsLbs = -1;
        item = "egg";
                          
        expResult = -1;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        /**********************
         * Test case #4
         *********************/
        System.out.println("\tTest case #4");
         
        //input values for test case 4
        totalItemsLbs = 26;
        item = "egg";
                          
        expResult = -1;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        /**********************
         * Test case #5
         *********************/
        System.out.println("\tTest case #5");
         
        //input values for test case 5
        totalItemsLbs = 0.01;
        item = "egg";
                          
        expResult = 0.01;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        /**********************
         * Test case #6
         *********************/
        System.out.println("\tTest case #6");
         
        //input values for test case 6
        totalItemsLbs = 0;
        item = "egg";
                          
        expResult = 0;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        /**********************
         * Test case #7
         *********************/
        System.out.println("\tTest case #7");
         
        //input values for test case 7
        totalItemsLbs = 25;
        item = "egg";
                          
        expResult = 25;//expected output returned value
        
        //call function to run test
        result = instance.calcWeightOfCart(totalItemsLbs, item);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        
    }
    
}
