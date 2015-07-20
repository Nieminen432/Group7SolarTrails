/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.exceptions.GeneralViewExceptions;
import byui.cit260.solarTrails.model.Crew;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Hiatt-Adam
 */

public class ChooseCrewNamesView  {
    private String promptMessage;
    private ArrayList<Crew> crewList = null;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    ChooseCrewNamesView(ArrayList<Crew> crewList) {
        this.crewList = crewList;
    }
    
    public void begin() {
        
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public ChooseCrewNamesView(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    public String getName() throws GeneralViewExceptions {

        boolean valid = false;
        String crewName = null;
        CharSequence DONE = null;
        
        while(!valid) { // while a valid name has not been retrieved
            try{
                // if DONE is typed, end name selection
                /*if (crewName.equals("DONE")) {
                    this.console.println("You are finished naming your crew.");
                    ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
                    chooseCrew.display();
                    break;
                }*/

                // if the name is invalid (less than three characters in length)
                if (crewName.length() < 3 || crewName.length() > 15) {
                    throw new GeneralViewExceptions("Invalid name - the name cannot be blank and must be more than three characters and less than 15 characters.");
                    // continue; // and repeat again
                }

                // name is correct
                if (crewName.length() >3 || crewName.length() < 15){
                    this.console.println("You have entered the name: " + crewName
                    + "\n Enter another name or type DONE if you are done.");
                    continue;
                }

                break;
            }catch (GeneralViewExceptions ex) {
                ErrorView.display(this.getClass().getName(),
                        "Please choose a valid option");
            }finally{
                return crewName; // return the players name
            }
        
        }return crewName; // return the players name
    }
    
    public Crew[] doDisplayCharacter(Crew[] enterCharacterName) throws GeneralViewExceptions {
        Crew[] Character; 
        Crew[] characters = null;
        Character = new Crew[ChooseCrewSizeView.crewSize];


        this.console.println("Enter the player's name below:"); 

            
        for (Crew character : characters) {
            String crewName = this.getName();
            //ChooseCrewResearchSpecMenuView[] s = ChooseCrewResearchSpecMenuView.values();
        }Crew[] crewName = null;
            return crewName;
    }
    
    public static ChooseCrewResearchSpecMenuView[] doDisplayMenu(ChooseCrewResearchSpecMenuView[] selectResearchSpec) throws GeneralViewExceptions {   
    //ChooseCrewResearchSpecMenuView[] crewResearchSpec = ChooseCrewResearchSpecMenuView.values();
        /*for (ChooseCrewResearchSpecMenuView crewResearchSpec1 : crewResearchSpec) {
            System.out.println(crewResearchSpec1.getMenuLetter() + ": " + crewResearchSpec1.getDisplayName());
        } */
        throw new GeneralViewExceptions("You must create a character profile.");
    
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
                this.console.println("\n*** Invalid selection *** Try again");
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
