/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Hiatt-Adam
 */
public class BeginGame {
     private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public BeginGame(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public void display() {
        
        this.console.println("Prepare for lift-off in T minus 10!");
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("9...");
    try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("8...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("7...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("6...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("5...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("4...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("3...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("2...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("1...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("0...");
        
        try {
            Thread.sleep(1000L);    // one second
}
catch (Exception e) {}
        this.console.println("And we have lift-off!!");
        
        try {
            Thread.sleep(5000L);    // one second
}
catch (Exception e) {}
        try {
        this.console.println("Your spaceship blasts off and in short order, you have left the Earth behind.");
        this.console.println("-----------------------------------------------------------------------------"
                        + "\n-------------------------  Press Enter to Continue  --------------------------"
                        + "\n------------------------------------------------------------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        
    }
}
}