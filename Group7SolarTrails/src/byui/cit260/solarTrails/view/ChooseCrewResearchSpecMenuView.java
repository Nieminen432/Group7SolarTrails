/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.Crew;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseCrewResearchSpecMenuView {
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();
    String[][] crewSpecs = new String[3][11];
    ArrayList<Crew> crewList = new ArrayList<>();
    
    private void setList() {
        for (int i = 0; i < 11; i++) {
            crewSpecs[0][i] = "show";
            switch (i) {
                case 0:
                    crewSpecs[1][i] = "B";
                    crewSpecs[2][i] = "Biology";
                    break;
                case 1:
                    crewSpecs[1][i] = "T";
                    crewSpecs[2][i] = "BioTechnology";
                    break;
                case 2:
                    crewSpecs[1][i] = "C";
                    crewSpecs[2][i] = "Chemistry";
                    break;
                case 3:
                    crewSpecs[1][i] = "S";
                    crewSpecs[2][i] = "Environmental Science";
                    break;
                case 4:
                    crewSpecs[1][i] = "M";
                    crewSpecs[2][i] = "Mathematics";
                    break;
                case 5:
                    crewSpecs[1][i] = "P";
                    crewSpecs[2][i] = "Physics";
                    break;
                case 6:
                    crewSpecs[1][i] = "E";
                    crewSpecs[2][i] = "Engineering";
                    break;
                case 7:
                    crewSpecs[1][i] = "A";
                    crewSpecs[2][i] = "Astrophysics";
                    break;
                case 8:
                    crewSpecs[1][i] = "L";
                    crewSpecs[2][i] = "Planetary Science";
                    break;
                case 9:
                    crewSpecs[1][i] = "O";
                    crewSpecs[2][i] = "Exploration and Observational Systems";
                    break;
                case 10:
                    crewSpecs[1][i] = "I";
                    crewSpecs[2][i] = "Computer Information Technology";
                    break;
            }
        }
    }
    
    private void specSet(int spec, int crewMember) {
        crewSpecs[0][spec] = "DontShow";
        Crew member = new Crew();
        member.setSpec(spec);
        crewList.add(member);
    }
    
    public void begin() {        
        setList();
        String choice = "";
        int numCrew = Group7SolarTrails.getShip().getNoCrew();
        for (int i = 0; i <= numCrew; i++) {
            if (i == numCrew) {
                System.out.println("\n---------------------------------------------"
                                  +"\n | You've picked your specializations"
                                  +"\n---------------------------------------------");
                ChooseCrewNamesView crewNames = new ChooseCrewNamesView(crewList);
                crewNames.begin();
            } else {
                int crewMember = i+1;
                System.out.println("\n---------------------------------------------"
                                  +"\n | Pick specialization for crew member " + crewMember
                                  +"\n---------------------------------------------");
                for (int j = 0; j < 11; j++) {
                    if (crewSpecs[0][j].equals("show")) {
                        System.out.println(crewSpecs[1][j] + " - " + crewSpecs[2][j]);
                    }
                }

                try {
                    choice = keyboard.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(ChooseCrewResearchSpecMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                choose(choice, i+1);
            }
        }
    }
    
    public void tryAgain(int i) {
        String choice = "";
        int numCrew = Group7SolarTrails.getShip().getNoCrew();
        System.out.println("\n---------------------------------------------"
                          +"\n | Pick specialization for crew member " + i
                          +"\n---------------------------------------------");
        for (int j = 0; j < 11; j++) {
            if (crewSpecs[0][j].equals("show")) {
                System.out.println(crewSpecs[1][j] + " - " + crewSpecs[2][j]);
            }
        }

        try {
            choice = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ChooseCrewResearchSpecMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        choose(choice, i);
    }
    
    public boolean choose(String in, int i) {
        String value = (String) in;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        boolean isPicked = false;
        for (int j = 0; j < 10; j++) {
            if (!crewSpecs[0][j].equals("show") && crewSpecs[1][j].equals(value)) {
                isPicked = true;
            }
        }
        if (isPicked) {
            System.out.println("\n*** Invalid selection ***"
                             + "\n*** Already Chosen *** Try again");
            tryAgain(i);
        } else {
            switch (choice) {
                case 'B': // choose the ship
                    this.chooseBiology(i);
                    break;
                case 'T': // get and start an existing game
                    this.chooseBioTechnology(i);
                    break;
                case 'C': // choose number of crew members and specializations
                    this.chooseChemistry(i);
                    break;
                case 'S': // choose how much food you will start with
                    this.chooseEnvironmentalScience(i);
                    break;
                case 'M': // back to the main menu
                    this.chooseMathematics(i);
                    break;                
                case 'P': // Begin the game
                    this.choosePysics(i);
                    break;
                case 'E': // choose the ship
                    this.chooseEngineering(i);
                    break;
                case 'A': // get and start an existing game
                    this.chooseAstrophysics(i);
                    break;
                case 'L': // choose number of crew members and specializations
                    this.choosePlanetaryScience(i);
                    break;
                case 'O': // choose how much food you will start with
                    this.chooseExplorationAndObservation(i);
                    break;
                case 'I': // back to the main menu
                    this.chooseComputerInfoTech(i);
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    tryAgain(i);
                    break;
            }
        } 
        return false;
    }

    private void chooseBiology(int i) {
        specSet(0, i);
    }

    private void chooseBioTechnology(int i) {
        specSet(1, i);
    }

    private void chooseChemistry(int i) {
        specSet(2, i);
    }

    private void chooseEnvironmentalScience(int i) {
        specSet(3, i);
    }

    private void chooseMathematics(int i) {
        specSet(4, i);
    }

    private void choosePysics(int i) {
        specSet(5, i);
    }

    private void chooseEngineering(int i) {
        specSet(6, i);
    }

    private void chooseAstrophysics(int i) {
        specSet(7, i);
    }

    private void choosePlanetaryScience(int i) {
        specSet(8, i);
    }

    private void chooseExplorationAndObservation(int i) {
        specSet(9, i);
    }

    private void chooseComputerInfoTech(int i) {
        specSet(10, i);
    }
}
