/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Hiatt-Adam
 */
public class MapChooseDestinationView {
    // choose a map destination
     private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    MapChooseDestinationView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public MapChooseDestinationView(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public void display() {
        this.console.println("Choose your next destination");
    }
    
}
