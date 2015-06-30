/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;
import byui.cit260.solarTrails.view.ChooseCrewSizeView.*;
import byui.cit260.solarTrails.model.Character;

/**
 *
 * @author Hiatt-Adam
 */

public class ChooseCrewNamesView  {
  
    public String getName() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false;
        String crewName = null;
        CharSequence DONE = null;
        
        while(!valid) { // while a valid name has not been retrieved
            
            

            // if DONE is typed, end name selection
            if (crewName.equals("DONE")) {
                System.out.println("You are finished naming your crew.");
                ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
                chooseCrew.display();
                break;
            }
            
            // if the name is invalid (less than three characters in length)
            if (crewName.length() < 3 || crewName.length() > 15) {
                System.out.println("Invalid name - the name cannot be blank and must be more than three characters and less than 15 characters.");
                continue; // and repeat again
            }
            
            // name is correct
            if (crewName.length() >3 || crewName.length() < 15){
                System.out.println("You have entered the name: " + crewName
                + "\n Enter another name or type DONE if you are done.");
                continue;
            }
            
            break;
            
        }
        return crewName; // return the players name
    }
    
    public Character[] doDisplayCharacter(Character[] enterCharacterName) {
        Character[] Character; 
        Character[] characters = null;
        Character = new Character[ChooseCrewSizeView.crewSize];
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        System.out.println("Enter the player's name below:"); 
            
        for (Character character : characters) {
            String crewName = this.getName();
            ChooseCrewResearchSpecMenuView[] s = ChooseCrewResearchSpecMenuView.values();
        }Character[] crewName = null;
            return crewName;
}
    
    public static ChooseCrewResearchSpecMenuView[] doDisplayMenu(ChooseCrewResearchSpecMenuView[] selectResearchSpec) {   
    ChooseCrewResearchSpecMenuView[] crewResearchSpec = ChooseCrewResearchSpecMenuView.values();
        for (ChooseCrewResearchSpecMenuView crewResearchSpec1 : crewResearchSpec) {
            System.out.println(crewResearchSpec1.getMenuLetter() + ": " + crewResearchSpec1.getDisplayName());
        } 
        return null;
    
  }
    
    /* public ChooseCrewNamesView() {
        super("\n"
            + "\n Please enter the name of your crew member:"
            + "\n Enter DONE when done."
            + "\n");
    }    
        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        // save character name to saved variables
        
    
    return (boolean) obj;
    } */

   

  
}

/*public class ChooseCrewNamesView extends View {
    public ChooseCrewNamesView () {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\nA - Abby"
            + "\nB - Bob"
            + "\nC - Charles"
            + "\nE - Esther"
            + "\nF - Frank"
            + "\nG - Greg"
            + "\nH - Hank"
            + "\nI - Irene"
            + "\nJ - Joe"
            + "\nK - Katherine"
            + "\nL - Linda"
            + "\nR - Reset the names you have picked."
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
                this.chooseAbby();
                break;
            case 'B': // get and start an existing game
                this.chooseBob();
                break;
            case 'C': // get and start an existing game
                this.chooseCharles();
                break;
            case 'E': // create and start a new game
                this.chooseEsther();
                break;
            case 'F': // get and start an existing game
                this.chooseFrank();
                break;
            case 'G': // get and start an existing game
                this.chooseGreg();
                break;
            case 'H': // create and start a new game
                this.chooseHank();
                break;
            case 'I': // get and start an existing game
                this.chooseIrene();
                break;
            case 'J': // get and start an existing game
                this.chooseJoe();
                break;
            case 'K': // create and start a new game
                this.chooseKatherine();
                break;
            case 'L': // get and start an existing game
                this.chooseLinda();
                break;
            case 'R': // display the help menu
                this.resetCrewNames();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    } return false;
}

    private void chooseAbby() {
        // choose Abby as a crew member name
    }

    private void chooseBob() {
        // choose Bob as a crew member name
    }

    private void chooseCharles() {
        // choose Charles as a crew member name
    }

    private void chooseEsther() {
        // choose Esther as a crew member name
    }

    private void chooseFrank() {
        // choose Frank as a crew member name
    }

    private void chooseGreg() {
        // choose Greg as a crew member name
    }

    private void chooseHank() {
        // choose Hank as a crew member name
    }

    private void chooseIrene() {
        // choose Irene as a crew member name
    }

    private void chooseJoe() {
        // choose Joe as a crew member name
    }

    private void chooseKatherine() {
        // choose Katherine as a crew member name
    }

    private void chooseLinda() {
        // choose Linda as a crew member name
    }

    private void resetCrewNames() {
        // reset crew names picked
    }

    private void previousMenu() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.display();
    }
}*/