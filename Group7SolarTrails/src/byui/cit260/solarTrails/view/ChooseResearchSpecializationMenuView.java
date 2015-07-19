/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.ScientistSpecialization;
import group7solartrails.Group7SolarTrails;
import static group7solartrails.Group7SolarTrails.getScienceSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseResearchSpecializationMenuView extends View{
    public ChooseResearchSpecializationMenuView () {
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
            + "\nR - Reset currently selected ship options"
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
                this.choosePhysics();
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

    private void chooseBiology() {
        // select Biology
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Biology");
        scienceSpec.setType(1);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseBioTechnology() {
        // select BioTechnology
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("BioTechnology");
        scienceSpec.setType(2);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseChemistry() {
        // select Chemistry
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Chemistry");
        scienceSpec.setType(3);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseEnvironmentalScience() {
        // select Environmental Science
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Environmental Science");
        scienceSpec.setType(4);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseMathematics() {
        // select Mathematics
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Mathematics");
        scienceSpec.setType(5);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void choosePhysics() {
        // select Physics
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Physics");
        scienceSpec.setType(6);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseEngineering() {
        // select Engineering
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Engineering");
        scienceSpec.setType(7);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseAstrophysics() {
        // select Astrophysics
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Astrophysics");
        scienceSpec.setType(8);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void choosePlanetaryScience() {
        // select Planetary Science
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Planetary Science");
        scienceSpec.setType(9);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseExplorationAndObservation() {
        // select Exploration and Observational Science
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Exploration and Observation");
        scienceSpec.setType(10);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void chooseComputerInfoTech() {
        // select Computer Information Technology
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Computer Information Technology");
        scienceSpec.setType(11);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization is " + getScienceSpec().getName());
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        }
    }

    private void resetResearchOptions() {
        // select Reset Research Options
        try {
        ScientistSpecialization scienceSpec = new ScientistSpecialization();
        scienceSpec.setName("Scientific Specialization not set");
        scienceSpec.setType(0);
        Group7SolarTrails.setScienceSpec(scienceSpec);
        
        this.console.println("Your Scientific Specialization has been reset.");
        this.console.println("-------- Press Enter to Continue --------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        ChooseResearchSpecializationMenuView chooseResearchSpec = new ChooseResearchSpecializationMenuView();
        chooseResearchSpec.display();
        }
    }

    private void previousMenu() {
        // return to previous menu
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
    }
}