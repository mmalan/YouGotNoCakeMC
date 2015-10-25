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
 * @author MattMalan
 */
public class calcCostOfItemTest {
    
    public calcCostOfItemTest() {
    }

    /**
     * Test of calcCostOfItem method, of class calcCostOfItem.
     */
    @Test
    public void testCalcCostOfItem() {
        System.out.println("calcCostOfItem");
        
        /**********************
         * Test case #1
         *********************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double numOfItems = 2;
        String items = "egg";
        
        //create an instance of calcCostOfItem class
        calcCostOfItem instance = new calcCostOfItem();
        double expResult = 0.50;//expected output return value
        
        //call function to run test
        double result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
        
        /**********************
         * Test case #2
         *********************/
        System.out.println("\tTest case #2");
        
        //input values for test case 1
        numOfItems = -1;
        items = "egg";
        
        expResult = -1;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
       
        
        /**********************
         * Test case #3
         *********************/
        System.out.println("\tTest case #3");
        
        //input values for test case 1
        numOfItems = 4;
        items = "EGG";
        
        expResult = -1;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
        /**********************
         * Test case #4
         *********************/
        System.out.println("\tTest case #4");
        
        //input values for test case 1
        numOfItems = 5;
        items = "egg";
        
        expResult = -1;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        System.out.println(result);
        
        /**********************
         * Test case #5
         *********************/
        System.out.println("\tTest case #5");
        
        //input values for test case 1
        numOfItems = 0.1;
        items = "egg";
        
        expResult = 0.0;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        System.out.println(result);
        
        /**********************
         * Test case #6
         *********************/
        System.out.println("\tTest case #6");
        
        //input values for test case 1
        numOfItems = 0.25;
        items = "egg";
        
        expResult = 0;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        System.out.println(result);
        
        /**********************
         * Test case #7
         *********************/
        System.out.println("\tTest case #7");
        
        //input values for test case 1
        numOfItems = 4;
        items = "egg";
        
        expResult = 1.00;//expected output return value
        
        //call function to run test
        result = instance.calcCostOfItem(numOfItems, items);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        System.out.println(result);
        
    }
    
}
