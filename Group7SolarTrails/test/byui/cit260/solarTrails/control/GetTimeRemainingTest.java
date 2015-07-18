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
public class GetTimeRemainingTest {
    
    public GetTimeRemainingTest() {
    }

    /**
     * Test of timeToUranus method, of class GetTimeRemaining.
     * @throws java.lang.Exception
     */
    @Test
    public void testTimeToUranus() throws Exception {
        System.out.println("timeToUranus");
        
        /*******************
         * test case 1
         *******************/
        double speed = 0.0;
        double distance = 0.0;
        
        
        double expResult = 0.0;
        
        GetTimeRemaining instance = new GetTimeRemaining();
        
        double result = instance.timeToUranus(speed, distance);
        
        assertEquals(expResult, result, 0.0);
        
    }
    
}
