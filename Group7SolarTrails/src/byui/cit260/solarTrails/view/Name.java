/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hiatt-Adam
 */
public abstract class Name implements NameInterface{
    private String promptName; 

    public String getPromptName() {
        return promptName;
    }

    public void setPromptName(String promptName) {
        this.promptName = promptName;
    }

    public Name(String promptName) {
        this.promptName = promptName;
    }
        
    @Override
    public void display() {
        boolean done = false; // indicates if the name has been retrieved
        String playersName = "";
        
        do {
            //prompt for the player's name
            System.out.println(this.promptName);    
            playersName = this.getName(); // get the name the user entered.
            done = this.doAction(playersName); // do action based on value
        } while (!done);
        }
    @Override
        public String getName() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false;
        String playersName = null;
        CharSequence DONE = null;
        
        while(!valid) { // while a valid name has not been retrieved
            
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            // if DONE is typed, end name selection
            if (playersName.equals("DONE")) {
                System.out.println("You are finished naming your crew.");
                ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
                chooseCrew.display();
                break;
            }
            
            // if the name is invalid (less than three characters in length)
            if (playersName.length() < 3 || playersName.length() > 15) {
                System.out.println("Invalid name - the name cannot be blank and must be more than three characters and less than 15 characters.");
                continue; // and repeat again
            }
            
            // name is correct
            if (playersName.length() >3 || playersName.length() < 15){
                System.out.println("You have entered the name: " + playersName
                + "\n Enter another name or type DONE if you are done.");
                continue;
            }
            
            break;
            
        }
        return playersName; // return the players name
    }
}