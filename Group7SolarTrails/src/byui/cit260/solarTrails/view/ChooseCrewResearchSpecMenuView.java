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
public class ChooseCrewResearchSpecMenuView {

private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n | Pick your a research specialization type"
            + "\n-----------------------------------"
            + "\nB - Biology"
            + "\nT - BioTechnology"
            + "\nC - Chemistry"
            + "\nS - Environmental Science"
            + "\nM - Mathematics"
            + "\nP - Physics"
            + "\nE - Engineering"
            + "\nA - Astrophysics"
            + "\nL - Planetary Science"
            + "\nO - Exploration and Observational Systems"
            + "\nI - Computer Information Technology"
            + "\nR - Reset currently selected ship options"
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------";

    void displayMenu() {
            
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        
        } while (selection != 'B'); // a selection that is not "Back"
    }

    public String getInput() {
       boolean valid = false; // indicates if the input has been retrieved
       String input = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { // while a valid input has not been retreved
           
           // prompt for a menu item
           System.out.println("Select a menu item.");
           
           // get the input from the keyboard and trim off the blanks
           input = keyboard.nextLine();
           input = input.trim();
           input = input.toUpperCase();
           
           // if the input is invalid (more than 1 character)
           if (input.length() > 1) {
               System.out.println("Invalid selection - please enter a menu item.");
               continue; // and repeat again
           }
           break; // exit repetition
       }
       return input; // return the input
       
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'B': // create and start a new game
                this.chooseBiology();
                break;
            case 'T': // get and start an existing game
                this.chooseBioTechnology();
                break;
            case 'C': // get and start an existing game
                this.chooseChemistry();
                break;
            case 'S': // create and start a new game
                this.chooseEnvironmentalScience();
                break;
            case 'M': // get and start an existing game
                this.chooseMathematics();
                break;
            case 'P': // get and start an existing game
                this.choosePysics();
                break;
            case 'E': // create and start a new game
                this.chooseEngineering();
                break;
            case 'A': // get and start an existing game
                this.chooseAstrophysics();
                break;
            case 'L': // get and start an existing game
                this.choosePlanetaryScience();
                break;
            case 'O': // create and start a new game
                this.chooseExplorationAndObservation();
                break;
            case 'I': // get and start an existing game
                this.chooseComputerInfoTech();
                break;
            case 'R': // display the help menu
                this.resetResearchOptions();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

    }

    
}

    private void chooseBiology() {
        // select Biology
    }

    private void chooseBioTechnology() {
        // select BioTechnology
    }

    private void chooseChemistry() {
        // select Chemistry
    }

    private void chooseEnvironmentalScience() {
        // select Environmental Science
    }

    private void chooseMathematics() {
        // select Mathematics
    }

    private void choosePysics() {
        // select Physics
    }

    private void chooseEngineering() {
        // select Engineering
    }

    private void chooseAstrophysics() {
        // select Astrophysics
    }

    private void choosePlanetaryScience() {
        // select Planetary Science
    }

    private void chooseExplorationAndObservation() {
        // select Exploration and Observational Science
    }

    private void chooseComputerInfoTech() {
        // select Computer Information Technology
    }

    private void resetResearchOptions() {
        // select Reset Research Options
    }

    private void previousMenu() {
        // return to previous menu
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.displayMenu();
    }
}