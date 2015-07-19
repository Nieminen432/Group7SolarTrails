/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseCrewResearchSpecMenuView {
    String[][] crewSpecs = new String[3][13];
    private String setList() {
        String string = "";
        for (int i = 0; i < 13; i++) {
            if (true) {
                
            }
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
        return string;
    }
    
    public void begin() {
        
    }
    
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'S': // choose the ship
                this.chooseYourShip();
                break;
            case 'R': // get and start an existing game
                this.chooseResearchSpecialization();
                break;
            case 'C': // choose number of crew members and specializations
                this.chooseCrewAndSpecialty();
                break;
            case 'I': // choose how much food you will start with
                this.chooseStartingInventory();
                break;
            case 'M': // back to the main menu
                this.chooseMainMenu();
                break;                
            case 'P': // Begin the game
                this.choosePlayGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void chooseYourShip() {
        ChooseShipSizeView chooseShipSize = new ChooseShipSizeView();
        chooseShipSize.display();
    }

    private void chooseResearchSpecialization() {
        ChooseResearchSpecializationMenuView chooseResearchSpec = new ChooseResearchSpecializationMenuView();
        chooseResearchSpec.display();        
    }

    private void chooseCrewAndSpecialty() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.display();
    }
    
    private void chooseMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display(); 
    }
    private void chooseStartingInventory() {
        SelectStartInventoryView selectStartInv = new SelectStartInventoryView();
        selectStartInv.display();
    }

    private void choosePlayGame() {
        // starts a new game
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
    }
}
