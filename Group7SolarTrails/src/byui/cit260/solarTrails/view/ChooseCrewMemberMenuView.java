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
public class ChooseCrewMemberMenuView extends View{
    public ChooseCrewMemberMenuView(){
    
   super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\nA - Pick the amount of crew members you will take. "
            + "\n    Up to 3 for small ship, 6 for medium ship, 9 for large ship."
            + "\n    More team members means a higher percentage of research done each attempt"
            + "\n    but fewer members means a higher score for the research done."
            + "\n\nN - Choose the names of your crew members."
            + "\nS - Choose the Research Specialization for each crew member."
            + "\nR - Reset your crew and start over."
            + "\nD - When you are Done, go back and continue to prepare for your trip."
            + "\n------------------------------------");
}

    @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'A': // create and start a new game
                this.chooseCrewSize();
                break;
            case 'N': // get and start an existing game
                this.chooseCrewNames();
                break;
            case 'S': // get and start an existing game
                this.chooseCrewResearchSpec();
                break;
            case 'R': // display the help menu
                this.resetCrewOptions();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    } return false;
}

    private void chooseCrewSize() {
        ChooseCrewSizeView chooseCrewSize = new ChooseCrewSizeView();
        chooseCrewSize.display();
    }

    private void chooseCrewNames() {
        ChooseCrewNamesView chooseCrewNames = new ChooseCrewNamesView();
        chooseCrewNames.display();
    }

    private void chooseCrewResearchSpec() {
        ChooseCrewResearchSpecMenuView chooseCrewResearchSpec = new ChooseCrewResearchSpecMenuView();
        chooseCrewResearchSpec.display();  
    }

    private void resetCrewOptions() {
        // reset crew options 
    }

    private void previousMenu() {
        NewGameMenuView newGame = new NewGameMenuView();
        newGame.display();
    }
}