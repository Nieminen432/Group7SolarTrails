/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public abstract class View implements ViewInterface{
    private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            this.console.println(this.promptMessage); // display the prompt message
            value = this.getInput(); // get the user's input
            done = this.doAction(value); // do action based on value entered
        } while (!done);
    }
  
  @Override
    public String getInput() {
       boolean valid = false; // indicates if the input has been retrieved
       String value = null;
       
       
       while(!valid) { // while a valid input has not been retreved
        try{   
           // prompt for a menu item
           this.console.println("Select a menu item.");
           
           
           // get the input from the keyboard and trim off the blanks
           value = this.keyboard.readLine();
           value = value.trim();
           value = value.toUpperCase();
           
           // if the input is invalid (more than 1 character)
           if (value.length() > 1 || value.length() < 1) {
               ErrorView.display(this.getClass().getName(),
                       "Invalid selection - please enter a menu item.");
               continue; // and repeat again
           }
           break; // exit repetition
       }
       catch (Exception e) {
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + e.getMessage());
               return null;
               }
       
} return value; // return the input  
}
}