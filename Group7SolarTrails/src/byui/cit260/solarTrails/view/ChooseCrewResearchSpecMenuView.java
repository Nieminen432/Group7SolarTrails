/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author Hiatt-Adam
 */
public enum ChooseCrewResearchSpecMenuView {
       
    //public enum Specialization {
            BIOLOGY('b', "Biology"),
            BIOTECHNOLOGY('t', "BioTechnology"),
            CHEMISTRY('c', "Chemistry"),
            ENVIRONMENTALSCIENCE('S', "EnvironmentalScience"),
            MATHEMATICS('m', "Mathematics"),
            PHYSICS('p', "Pysics"),
            ENGINEERING('e', "Engineering"),
            ASTROPHYSICS('a', "Astrophysics"),
            PLANETARYSCIENCE('p', "PlanetaryScience"),
            EXPLORATIONANDOBSERVATION('o', "ExplorationAndObservation"),
            COMPUTERINFOTECH('i', "ComputerInfoTech");
            
            private final char menuLetter;
            private final String displayName;
            private ChooseCrewResearchSpecMenuView(char menuLetter, String displayName) {
                this.menuLetter = menuLetter;
                this.displayName = displayName;
            }
            public char getMenuLetter() { return menuLetter; }
            public String getDisplayName() {return displayName; }
    }

    
    /*public ChooseCrewResearchSpecMenuView() {
        super("\n"
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
            + "\nR - Reset currently selected research options"
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }
    @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;

    } return false;
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
        chooseCrew.display();
    }*/
