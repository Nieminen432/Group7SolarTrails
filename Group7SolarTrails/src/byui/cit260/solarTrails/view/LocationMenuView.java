/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nixon-Joseph
 */
public class LocationMenuView extends View{
    public LocationMenuView() {
        super("\n"
        + "\n-----------------------------------"
        + "\n | Location menu"
        + "\n | Please select an option."
        + "\n-----------------------------------"
        + "\nR - Rest and Recouperation"
        + "\nS - Research Item"
        + "\nM - Maintenance and repairs"
        + "\nH - Harvest"
        + "\nD - Drop Research Satellite"
        + "\nN - Set Navigation for next target"
        + "\n-----------------------------------");
    }

        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'R': // Research Object
                this.chooseRest();
                break;
            case 'S': // Leave Object
                this.chooseResearch();
                break;
            case 'M': // Leave Object
                this.chooseMaintenance();
                break;
            case 'H': // Leave Object
                this.chooseHarvest();
                break;
            case 'D': // Leave Object
                this.chooseDropSatellite();
                break;
            case 'N': // Leave Object
                this.chooseNextLocation();
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
    
    private void chooseResearch() {
        // Selected LocationRestandRec menu
    }

    private void chooseRest() {
        // Choose amount of time to rest
        this.console.println("You have chosen to rest X days");
    }

    private void chooseMaintenance() {
        LocationMaintandRepair maintAndRepair = new LocationMaintandRepair(); // Choose Maintenance Menu
        maintAndRepair.display();
    }

    private void chooseHarvest() {
        // LocationHarvestMenuView harvestMenuView = new LocationHarvestMenuView(); // choose harvest menu
        // harvestMenuView.display();
    }

    private void chooseDropSatellite() {
        // Drop Satellite or Probe
    }

    private void chooseNextLocation() {
        // MapChooseDestinationView menu
    }
}
