/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.HarvestResourceException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiatt-Adam
 */
public class HarvestResourceTest {
    
    public HarvestResourceTest() {
    }

    /**
     * Test of resourceGathered method, of class HarvestResource.
     */
    @Test
    public void testResourceGathered() throws HarvestResourceException {
        System.out.println("resourceGathered");
        /************************
         * Test case #1
         ************************/
        System.out.println("\tTest Case #1");
        
        // input values for test case 1
        int amountRemaining = 1;
        int amountGathered = 10;
        int shipType = 1;
        int currentInventory = 100;
        
        int expResult = 9890; // expected output returned value
        
        // create instance of HarvestResource class
        HarvestResource instance = new HarvestResource();
        
        // call function to run test
        int result = instance.resourceGathered(amountRemaining, amountGathered, shipType, currentInventory);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        /************************
         * Test case #2
         ************************/
        System.out.println("\tTest Case #2");
        
        // input values for test case 2
        amountRemaining = -1;
        amountGathered = 1;
        shipType = 1;
        currentInventory = 100;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.resourceGathered(amountRemaining, amountGathered, shipType, currentInventory);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /************************
         * Test case #3
         ************************/
        System.out.println("\tTest Case #3");
        
        // input values for test case 3
        amountRemaining = 10;
        amountGathered = -1;
        shipType = 2;
        currentInventory = 100;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.resourceGathered(amountRemaining, amountGathered, shipType, currentInventory);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /************************
         * Test case #4
         ************************/
        System.out.println("\tTest Case #4");
        
        // input values for test case 4
        amountRemaining = 20;
        amountGathered = 10;
        shipType = -1;
        currentInventory = 100;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.resourceGathered(amountRemaining, amountGathered, shipType, currentInventory);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
        /************************
         * Test case #5
         ************************/
        System.out.println("\tTest Case #5");
        
        // input values for test case 5
        amountRemaining = 20;
        amountGathered = 10;
        shipType = 3;
        currentInventory = 0;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.resourceGathered(amountRemaining, amountGathered, shipType, currentInventory);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
        
    }
    
}
