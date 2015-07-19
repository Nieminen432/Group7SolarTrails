/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class HelpMenuView extends View{
    public HelpMenuView() {
    super("\n"
            + "\n---------------------------------------"
            + "\n | Help Menu - Choose a topic"
            + "\n---------------------------------------"
            + "\nO - Overview of the game."
            + "\nC - Controls in the game."
            + "\nP - Planning your trip. "
            + "\nR - Research Specializations."
            + "\nT - Travel."
            + "\nH - Harvesting fuel/minerals"
            + "\nS - Synthesizing Items."
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }
@Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'O': // create and start a new game
                this.chooseOverview();
                break;
            case 'C': // get and start an existing game
                this.chooseControls();
                break;
            case 'P': // display the help menu
                this.choosePlanning();
                break;
            case 'R': // Exit the program
                this.previousResearch();
                break;
            case 'T': // create and start a new game
                this.chooseTravel();
                break;
            case 'H': // get and start an existing game
                this.chooseHarvesting();
                break;
            case 'S': // display the help menu
                this.chooseSynthesizing();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            default:
                try {
                this.console.println("\n*** Invalid selection *** "
                                   + "\nPrease enter to try again");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        }
                break;

    } return false;
    }

    private void chooseOverview() {
        // Show Overview Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n------------------------- Help Overview --------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| The Objective of this game is to travel through space to Uranus|"
                           + "\n| to check out an alien object that has been detected orbiting   |"
                           + "\n| the planet. You will encounter random problems in space and    |"
                           + "\n| have to choose how to handle each.                             |"
                           + "\n| You will also be given the opportunity to stop at each planet  |"
                           + "\n| along the way and do additional research and gather minerals.  |"
                           + "\n| Minerals can be used to synthesize items that you may need for |"
                           + "\n| the journey.  Each scientist on the trip will choose a research|"
                           + "\n| specialization that will help when researching planets or the  |"
                           + "\n| alien object.                                                  |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}	
    }

    private void chooseControls() {
        // Show Controls Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n------------------------- Game Controls --------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| Game Controls will vary according to the situation you are in. |"
                           + "\n| At any time while in flight (ie: while waiting to get to the   |"
                           + "\n| next planet), simply press the letter G or g to get to the     |"
                           + "\n| Game Menu. The menu will give tell you what options to choose. |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}	
    }

    private void choosePlanning() {
        // Show Planning Help
        try {
        this.console.println("\n----------------------------------------------------------------------------"
                           + "\n--------------------------- Planning Your Trip -----------------------------"
                           + "\n----------------------------------------------------------------------------"
                           + "\n| To begin the game you must first plan your trip. This consists of several|"
                           + "\n| options. First, you must select the ship you are going to travel in.     |"
                           + "\n|                                                                          |"
                           + "\n| There are three ship sizes; small, medium, and large.                    |"
                           + "\n| The small ship allows a maximum of 3 crew members and 10,000 inventory.  |"
                           + "\n| The medium ship allows a maximum of 6 crew members and 20,000 inventory. |"
                           + "\n| The large ship allows a maximum of 9 crew members and 30,000 inventory.  |"
                           + "\n| You are considered one of the crew members.                              |"
                           + "\n|                                                                          |"
                           + "\n| Next, you must choose your engine type. There are three engine types;    |"
                           + "\n| Combustion Engine, Impulse Engine, and Solar Sails. Each engine has a    |"
                           + "\n| different top speed and fuel type.                                       |"
                           + "\n| The combustion engine runs on rocket fuel which can be synthesized as you|"
                           + "\n| travel by using minerals (see the synthesizer section of help). The      |"
                           + "\n| Combustion Engine has a top speed of ## AU.                              |"
                           + "\n| The Impulse Engine uses nuclear energy as a power source. The nuclear    |"
                           + "\n| fuel needed must be harvested from planets or asteroids. Top Speed ## AU.|"
                           + "\n| Solar Sails are a newer technology and do not require a fuel source other|"
                           + "\n| than sunlight. Solar Sails have the highest top speed however, the       |"
                           + "\n| further from the sun you get, the slower that top speed is. Also, the    |"
                           + "\n| return trip to Earth will take much longer. Solar Sails can be easily    |"
                           + "\n| damaged by any debris floating around in space and they may require extra|"
                           + "\n| maintainance.  Solar Sails have a top speed of ## AU.                    |"
                           + "\n|                                                                          |"
                           + "\n| Finally, you must select your crew members and their specialization.     |"
                           + "\n| Each crew member will shorten the time it takes to research something and|"
                           + "\n| increase the research that can be completed in each attempt. (See the    |"
                           + "\n| research section of help.) "
                           + "\n| There are drawbacks to additional crew members. More crew means an       |"
                           + "\n| increase in food consumption, increase chance of injury, and each crew   |"
                           + "\n| member reduces the bonus to your final score. Your are not required to   |"
                           + "\n| fill your ship with crew members. You can even be the only one that goes.|"
                           + "\n----------------------------------------------------------------------------"
                           + "\n------------------------- Press Enter to Continue --------------------------"
                           + "\n----------------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}
    }

    private void previousResearch() {
        // Show Research Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n------------------------- Research Help --------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}
    }

    private void chooseTravel() {
        // Show Travel Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n-------------------------- Travel Help ---------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}
    }

    private void chooseHarvesting() {
        // Show Harvesting Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n------------------------ Harvesting Help -------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}
    }

    private void chooseSynthesizing() {
        // Show Synthesizing Help
        try {
        this.console.println("\n------------------------------------------------------------------"
                           + "\n----------------------- Synthesizing Help ------------------------"
                           + "\n------------------------------------------------------------------"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n| |"
                           + "\n------------------------------------------------------------------"
                           + "\n-------------------- Press Enter to Continue ---------------------"
                           + "\n------------------------------------------------------------------");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
}
    }

    private void previousMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        // Previous Menu. This will need to be adjusted to go to whatever menu the player was at previously.
    }

    
}
