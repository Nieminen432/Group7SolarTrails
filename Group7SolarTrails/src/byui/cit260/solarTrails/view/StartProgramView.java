/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.ProgramControl;
import byui.cit260.solarTrails.exceptions.ProgramControlException;
import byui.cit260.solarTrails.model.*;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiatt-Adam
 */
public class StartProgramView {
    private String promptMessage;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public StartProgramView(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public StartProgramView() {
    }
    public void startProgram() {

        try {
            // Display the banner screen
            this.displayBanner();
            
            // prompt the player to enter their name, Retrieve the name of the player
            String playersName = this.getPlayersName();
            
            // Create and save the player object
            Player player = ProgramControl.createPlayer(playersName);
            
            // Display a personalized welcome message
            this.displayWelcomeMessage(player);
            
            // Display the main menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.display();
        } catch (ProgramControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayBanner() {
        System.out.println("\n\n*********************************************************");
        
        System.out.println("*                                                       *"
                       + "\n* This is the Game Solar Trails                         *"
                       + "\n* In this game you will explore the stars on your way   *"
                       + "\n* to discover an object that has been discovered in     *"
                       + "\n* our Solar System. An alien object that is             *"
                       + "\n* broacasting a signal of unknown origin has been       *"
                       + "\n* located orbiting the planet Uranus.                   *");
        
        System.out.println("*                                                       *"
                       + "\n* You and your team of scientists have been selected to *"
                       + "\n* travel to this object and discover as much about it   *"
                       + "\n* as possible. Each scientist has a research specialty  *"
                       + "\n* whch will help in researching the object. You may not *"
                       + "\n* have more than one specialty in the team. You will    *"
                       + "\n* select a ship type which will determine how many crew *"
                       + "\n* members will go and how much cargo and fuel you can   *"
                       + "\n* take with you. You will have to navigate through the  *"
                       + "\n* planets, stopping along the way to pick up minerals,  *"
                       + "\n* samples, and fuel. Your crew may become sick along    *"
                       + "\n* the way or get injured. You will have to pick the     *"
                       + "\n* most appropriate course of action in each case. Your  *"
                       + "\n* ship will need repairs or maintainance along the way. *"
                       + "\n* You have an Item Synthesizer that you may use to      *"
                       + "\n* create food, parts, medicine, and fuel from the       *"
                       + "\n* minerals that you gather. ");
        
        System.out.println("*                                                       *"
                       + "\n* You have a limited amount of time to reach the object.*"
                       + "\n* If you take too long to get there, you will have very *"
                       + "\n* little time to complete your research before you must *"
                       + "\n* return to Earth. The more time you have to research,  *"
                       + "\n* the more data you can return to earth with. The amount*"
                       + "\n* of data collected will determine your final score.    *");
        
        System.out.println("*                                                       *"
                       + "\n* Good luck and have fun on your adventure!             *"
                       + "\n*********************************************************");
        
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        
        
        while(!valid) { try {
            // while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            // get the name from the keyboard and trim off the blanks
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than three characters in length)
            if (playersName.length() < 3 || playersName.length() > 15) {
                System.out.println("Invalid name - the name cannot be blank and must be more than three characters and less than 15 characters.");
                continue; // and repeat again
            }
            break; // exit the repetition
        }catch (Exception e) {
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + e.getMessage());
               return null;
               }
        }
        return playersName; // return the players name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!!");
        System.out.println("\n\n=============================================");
    }  
}
