/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.GetTimeRemainingException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiatt-Adam
 */
public class GetTimeRemainingTest {
    
    public GetTimeRemainingTest() {
    }

    /**
     * Test of timeOfObjectRemaining method, of class GetTimeRemaining.
     */
    @Test
    public void testTimeOfObjectRemaining() throws GetTimeRemainingException {
        System.out.println("timeOfObjectRemaining");
        /*************************
         * Test Case #1
         *************************/
        System.out.println("\tTest case #1");
       
        // input values for test case 1 
        double speed = 100.0;
        double distance = 86.06;
        
        double expResult = 4380.099; // expected output returned value
        
        // create instance of TimeRemaining class
        GetTimeRemaining instance = new GetTimeRemaining();
        
        // call function to run test
        double result = instance.timeOfObjectRemaining(speed, distance);
        
        // compare expected return value with actual value returned 
        assertEquals(expResult, result, 0.01);
        
        System.out.println ("\tTest case #2");
       
        // input values for test case 2 
        speed = 12;
        distance = -7;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.timeOfObjectRemaining(speed, distance);
        
        // compare expected return value with actual value returned 
        assertEquals(expResult, result, 0.0001);
        
        System.out.println ("\tTest case #3");
               
        // input values for test case 3 
        speed = -74;
        distance = 107.57;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.timeOfObjectRemaining(speed, distance);
        
        // compare expected return value with actual value returned 
        assertEquals(expResult, result, 0.0001);
        
        System.out.println ("\tTest case #4");
               
        // input values for test case 4 
        speed = 900000;
        distance = 0.043;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.timeOfObjectRemaining(speed, distance);
        
        // compare expected return value with actual value returned 
        assertEquals(expResult, result, 0.0001);

    }
    
}
