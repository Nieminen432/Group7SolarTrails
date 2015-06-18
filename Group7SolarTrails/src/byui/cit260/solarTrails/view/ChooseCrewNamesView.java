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
public class ChooseCrewNamesView extends View {
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
}