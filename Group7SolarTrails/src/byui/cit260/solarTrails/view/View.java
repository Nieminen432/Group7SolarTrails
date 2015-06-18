/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public abstract class View implements ViewInterface{
    private String promptMessage;

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
            System.out.println(this.promptMessage); // display the prompt message
            value = this.getInput(); // get the user's input
            done = this.doAction(value); // do action based on value entered
        } while (!done);
    }
  
  @Override
    public String getInput() {
       boolean valid = false; // indicates if the input has been retrieved
       String value = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { // while a valid input has not been retreved
           
           // prompt for a menu item
           System.out.println("Select a menu item.");
           
           
           // get the input from the keyboard and trim off the blanks
           value = keyboard.nextLine();
           value = value.trim();
           value = value.toUpperCase();
           
           // if the input is invalid (more than 1 character)
           if (value.length() > 1 || value.length() < 1) {
               System.out.println("Invalid selection - please enter a menu item.");
               continue; // and repeat again
           }
           break; // exit repetition
       }
       return value; // return the input  
} 
}