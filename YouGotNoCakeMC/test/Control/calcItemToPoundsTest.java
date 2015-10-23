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
public class calcItemToPoundsTest {
    
    public calcItemToPoundsTest() {
    }
     
     /**
     * Test of calcItemToPounds method, of class calcItemToPounds.
     */
    @Test
    public void testCalcItemToPounds() {
        System.out.println("calcItemToPounds");
        
        /**********************
         * Test case #1
         *********************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        int numOfItems = 2;
        String items = "egg";
        
        //create instance of InventoryControl class
        calcItemToPounds instance = new calcItemToPounds();
        
        double expResult = 0.44; //expected output returned value
        
        //call function to run test
        double result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
        /**********************
         * Test case #2
         *********************/
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        numOfItems = -1;
        items = "egg";
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
         /**********************
         * Test case #3
         *********************/
        System.out.println("\tTest case #3");
        
        //input values for test case 3
        numOfItems = 4;
        items = "EGG";
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
         /**********************
         * Test case #4
         *********************/
        System.out.println("\tTest case #4");
        
        //input values for test case 4
        numOfItems = 5;
        items = "egg";
        
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
         /**********************
         * Test case #5
         *********************/
        System.out.println("\tTest case #5");
        
        //input values for test case 5
        numOfItems = 0;
        items = "egg";
        
        expResult = 0; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
         /**********************
         * Test case #6
         *********************/
        System.out.println("\tTest case #6");
        
        //input values for test case 6
        numOfItems = 0; // only accept integer values won't accept .25
        items = "egg";
        
        expResult = 0; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
         /**********************
         * Test case #7
         *********************/
        System.out.println("\tTest case #7");
        
        //input values for test case 7
        numOfItems = 4;
        items = "egg";
        
        expResult = 0.88; //expected output returned value
        
        //call function to run test
        result = instance.calcItemToPounds(numOfItems, items);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
    }
    
}