/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Nixon-Joseph
 */
public class LocationMaintandRepair extends View{
       public LocationMaintandRepair() {
       super("\n"
        + "\n-----------------------------------"
        + "\n | Maintenance menu"
        + "\n | Please select an option."
        + "\n-----------------------------------"
        + "\nS - Ship"
        + "\nE - Engine"
        + "\nY - Synthesizer"
        + "\nD - Done"
        + "\n-----------------------------------");
       }

        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'S': // Research Object
                this.chooseShip();
                break;
            case 'E': // Leave Object
                this.chooseEngine();
                break;
            case 'Y': // Research Object
                this.chooseSynthesizer();
                break;
            case 'D': // Leave Object
                this.chooseBack();
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

    private void chooseShip() {
        // View Ship status and options for repair
    }

    private void chooseEngine() {
        // View Engine Status and options for repair
    }

    private void chooseSynthesizer() {
        // View Synthesizer status and options for repair
    }

    private void chooseBack() {
        // return to previous menu
    }
    
}
