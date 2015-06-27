/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiatt-Adam
 */
public class mapMoveTest {
    
    public mapMoveTest() {
    }

    /**
     * Test of moveShip method, of class mapMove.
     */
    @Test
    public void testMoveShip() {
        System.out.println("moveShip");
        /*******************************
         * Test Case #1
         *******************************/
        System.out.println("/tTest Case #1");
        
        // input values for test case 1
        
        int currentLocation = 2;
        int destinationLocation = 3;
        double fuelRemaining = 200.0;
        
        double expResult = 60.0; // expected result
        
        // create instance of mapMove class
        MapMove instance = new MapMove();
        
        // call function to run test
        double result = instance.moveShip(currentLocation, destinationLocation, fuelRemaining);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
         /*******************************
         * Test Case #2
         *******************************/
        System.out.println("/tTest Case #2");
        
        // input values for test case 2
        
        currentLocation = -1;
        destinationLocation = 3;
        fuelRemaining = 200.0;
        
        expResult = -1; // expected result
        
        // call function to run test
        result = instance.moveShip(currentLocation, destinationLocation, fuelRemaining);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

        
        /*******************************
         * Test Case #3
         *******************************/
        System.out.println("/tTest Case #3");
        
        // input values for test case 3
        
        currentLocation = 1;
        destinationLocation = 0;
        fuelRemaining = 200.0;
        
        expResult = -1; // expected result
        
        // call function to run test
        result = instance.moveShip(currentLocation, destinationLocation, fuelRemaining);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
                

        /*******************************
         * Test Case #4
         *******************************/
        System.out.println("/tTest Case #4");
        
        // input values for test case 4
        
        currentLocation = 4;
        destinationLocation = 2;
        fuelRemaining = -1;
        
        expResult = -1; // expected result
        
        // call function to run test
        result = instance.moveShip(currentLocation, destinationLocation, fuelRemaining);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        

        /*******************************
         * Test Case #5
         *******************************/
        System.out.println("/tTest Case #5");
        
        // input values for test case 5
        
        currentLocation = 1;
        destinationLocation = 1;
        fuelRemaining = 200.0;
        
        expResult = -1; // expected result
        
        // call function to run test
        result = instance.moveShip(currentLocation, destinationLocation, fuelRemaining);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
        
        
    }
    
}
