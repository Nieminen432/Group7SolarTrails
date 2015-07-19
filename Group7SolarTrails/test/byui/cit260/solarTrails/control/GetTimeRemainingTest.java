/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Double.NaN;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hiatt-Adam
 */
public class GetTimeRemainingTest {
    private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public GetTimeRemainingTest(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public GetTimeRemainingTest() {
    }

    /**
     * Test of timeToUranus method, of class GetTimeRemaining.
     * @throws java.lang.Exception
     */
    @Test
    public void testTimeToUranus() throws Exception {
        this.console.println("timeToUranus");
        
        /*******************
         * test case 1
         *******************/
        this.console.println("Test Case 1");
        // inputs
        double speed = 0.0;
        double distance = 0.0;
        
        // expected output
        double expResult = NaN;
        
        // Create instance
        GetTimeRemaining instance = new GetTimeRemaining();
        
        // run test
        double result = instance.timeToUranus(speed, distance);
        
        // compare results
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * test case 2
         *******************/
        this.console.println("Test Case 2");
        // inputs
        speed = 21.0;
        distance = 0.0;
        
        // expected output
        expResult = 0.0;
        
        // run test
        result = instance.timeToUranus(speed, distance);
        
        // compare results
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * test case 3
         *******************/
        this.console.println("Test Case 3");
        // inputs
        speed = 0.0;
        distance = 136178.1;
        
        // expected output
        expResult = 0.0;
        
        // run test
        result = instance.timeToUranus(speed, distance);
        
        // compare results
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * test case 4
         *******************/
        this.console.println("Test Case 4");
        // inputs
        speed = 5.0;
        distance = 136137.0;
        
        // expected output
        expResult = 1134.475;
        
        // run test
        result = instance.timeToUranus(speed, distance);
        
        // compare results
        assertEquals(expResult, result, 0.01);
    }
    
}
