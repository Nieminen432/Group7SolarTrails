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
public abstract class Name implements NameInterface{
    private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public Name(String promptMessage) {
        this.promptMessage = promptMessage;
    }
        
    @Override
    public void display() {
        boolean done = false; // indicates if the name has been retrieved
        String playersName = "";
        
        do {
            //prompt for the player's name
            this.console.println(this.promptMessage);    
            playersName = this.getName(); // get the name the user entered.
            done = this.doAction(playersName); // do action based on value
        } while (!done);
        }
    @Override
        public String getName() {
        boolean valid = false;
        String playersName = null;
        CharSequence DONE = null;
        
        while(!valid) { 
            try {
                // while a valid name has not been retrieved
                
                
                // get the name from the keyboard and trim off the blanks
                playersName = this.keyboard.readLine();
                
                
                playersName = playersName.trim();
                
                // if DONE is typed, end name selection
                if (playersName.equals("DONE")) {
                    this.console.println("You are finished naming your crew.");
                    ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
                    chooseCrew.display();
                    break;
                }
                
                // if the name is invalid (less than three characters in length)
                if (playersName.length() < 3 || playersName.length() > 15) {
                    ErrorView.display(this.getClass().getName(),
                       "Invalid name - the name cannot be blank and must be more than three characters and less than 15 characters.");
                    continue; // and repeat again
                }
                
                // name is correct
                if (playersName.length() >3 || playersName.length() < 15){
                    this.console.println("You have entered the name: " + playersName
                            + "\n Enter another name or type DONE if you are done.");
                    continue;
                }
                
                break;
            } catch (Exception e) {
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + e.getMessage());
               return null;
               }
            }
         return playersName; // return the players name   
        }   
    }