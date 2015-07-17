/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

/**
 *
 * @author Nixon-Joseph
 */
public class AlienObjectMenuView extends View{

        public AlienObjectMenuView() {
            super("\n"
        + "\n-----------------------------------"
        + "\n | Alien Object menu"
        + "\n | Please select an option."
        + "\n-----------------------------------"
        + "\nR - Research Item"
        + "\nL - Leave for Earth"
        + "\n-----------------------------------");
        }
    
        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'R': // Research Object
                /* check amount researched. If less than 100%, allow attempt. Amount researchable cannot exceed 100%
                check research specializations
                come up with some random formula that somehow incorporates specializations and decreases crew supplies and health.
                display amount researched and ask if they want to research again.
                
                */
                this.chooseResearch();
                break;
            case 'L': // Leave Object
                this.chooseLeaveObject();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                getInput();
                break;
        } return false;
    }
    
    private void chooseResearch() {
        this.console.println("Chose Research, congrats!");
    }
    
    private void chooseLeaveObject() {
        this.console.println("Chose leaving, congrats! hope you have enough food and fuel");
    }
}
