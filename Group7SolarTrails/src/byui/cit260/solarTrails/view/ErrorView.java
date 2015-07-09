/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import java.io.PrintWriter;

/**
 *
 * @author Hiatt-Adam
 */
public class ErrorView {
    private static final PrintWriter errorFile = Group7SolarTrails.getOutFile();
    private static final PrintWriter logFile = Group7SolarTrails.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
        "_________________________________________"
        + "\n- ERROR - " + errorMessage
        + "n-----------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
