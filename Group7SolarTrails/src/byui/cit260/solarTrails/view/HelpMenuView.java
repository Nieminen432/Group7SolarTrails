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
            + "\nP - Planning your trip."
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
                               + "\n| Throughout your trip you will be given the opportunity to learn|"
                               + "\n| more about a planet, asteroid, moon, and the alien object.     |"
                               + "\n| Researching takes time and food and there is the possiblity of |"
                               + "\n| injury. Each member of your crew has a research specialty. This|"
                               + "\n| provides you with the opportutnity to learn additional         |"
                               + "\n| information about that specific subject. Some research specs   |"
                               + "\n| will be more useful that others in certain situations.         |"
                               + "\n| You do not have to activate a research specialty, it will be   |"
                               + "\n| used whenever you research something if it applies. |"
                               + "\n| The more times you research something, the more you learn,     |"
                               + "\n| however there is a limit to how many times something can be    |"
                               + "\n| researched. |"
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
                               + "\n| As you travel the stars, you will be given an option at each   |"
                               + "\n| planet you stop at as to where you want to travel next. You can|"
                               + "\n| continue forward or return to a planet you were at previously. |"
                               + "\n| You may even encounter some asteroids along the way. You do not|"
                               + "\n| have to visit every planet however, it is recommended due to   |"
                               + "\n| the need for minerals and, in most cases, fuel (see the        |"
                               + "\n| Harvesting Section). It is also a good opportunity to research.|"
                               + "\n| The more research that can be done on the mission, the better  |"
                               + "\n| (See the Research Section).|"
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
                               + "\n| Harvesting is important to your mission because it is how you  |"
                               + "\n| will obtain the fuel and minerals you need. Combustion engines |"
                               + "\n| and impulse engines require additional fuel over time. The fuel|"
                               + "\n| for the nucleaer engine must be harvested. The fuel for the    |"
                               + "\n| combustion engine can be synthesized (see the Synthesizing Help|"
                               + "\n| Section). Minerals are the other item that can be harvested    |"
                               + "\n| and they are required for synthesizing. As you explore a planet|"
                               + "\n| you will discover desposits of minerals or (if you have an     |"
                               + "\n| impulse engine) fuel. You will be told how much space will be  |"
                               + "\n| needed to harvest the deposit and you will be given the option |"
                               + "\n| to harvest it. If you do not have enough room in your inventory|"
                               + "\n| for the entire deposit, you will only harvest what you can     |"
                               + "\n| carry.                                                         |"
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
                               + "\n| Synthesizing is an essential part of your trip. You do not have|"
                               + "\n| the inventory space to take enough supplies to get you all the |"
                               + "\n| way to Uranus and back so another method was devized to help;  |"
                               + "\n| the Synthesizer. The Synthesizer can create food, medicine,    |"
                               + "\n| fuel, and parts. All that it requires to make these items is   |"
                               + "\n| time and minerals. Minerals can be aquired through harvesting  |"
                               + "\n| (See the Harvesting Section). Each item requires a set amount  |"
                               + "\n| of minerals to synthesize. To create an item, go to the        |"
                               + "\n| Synthesize Item menu and select the item you wish to create.   |"
                               + "\n| You can create multiples of each item, so you will need to     |"
                               + "\n| specify how many of the item you wish to make. Once that is    |"
                               + "\n| done, the Synthesizer will begin to make the items. If you do  |"
                               + "\n| not have enough inventory for the items, the Synthesizer will  |"
                               + "\n| not start. Very little time is needed to make each item. It is |"
                               + "\n| also a good idea to Synthesize items while you are harvesting. |"
                               + "\n| This helps clear up space in your inventory and restocks your  |"
                               + "\n| food, fuel, etc.                                               |"
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
