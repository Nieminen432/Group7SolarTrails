/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;
import group7solartrails.Group7SolarTrails;

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
            case 'C': // Research Object
                this.chooseSynthesizer();
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
        int foodIndex = 0;
        int currentFood = Group7SolarTrails.inventory.get(foodIndex).getQuantity();
        int crew = Group7SolarTrails.getShip().getMaxCrew();
                    try {
        
                        this.console.println("How many days would you like to rest?");
            String daysToRest = this.getInput();
        
            int neededFood = Integer.parseInt(daysToRest) * crew * 9;
            
            this.console.println("You have chosen to rest " + daysToRest + " days. This will consume " 
                                + neededFood + "food and heal your crew.");
        
            currentFood = currentFood - neededFood;
        // formula to multiply days to rest times 5% crew health.
            
            Group7SolarTrails.inventory.get(foodIndex).setQuantity(currentFood);
        this.console.println("Press enter to resume your journey");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            LocationMenuView locMenuView = new LocationMenuView();
            locMenuView.display();
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
    private void chooseMaintenance() {
        // Repair ship
        double parts;
        int partsIndex = 0;
        int currentParts = Group7SolarTrails.inventory.get(partsIndex).getQuantity();
        double repairsNeeded = (Group7SolarTrails.getShip().getCurrentShipDurability() - Group7SolarTrails.getShip().getMaxShipDurability());
        if (Group7SolarTrails.inventory.get(partsIndex).getQuantity() < repairsNeeded) {
            try {
            this.console.println("You do not have enough parts to fully repair your ship. Go synthesize some!");
            this.console.println("Press Enter to Continue");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        LocationMenuView locMenuView = new LocationMenuView();
        locMenuView.display();
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
        if (Group7SolarTrails.getShip().getCurrentShipDurability() == 100) {
            try {
                this.console.println("Your ship is at maximum durability!");
                this.console.println("Press Enter to Continue");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
        LocationMenuView locMenuView = new LocationMenuView();
        locMenuView.display();
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
            
        this.console.println("Your ships current durability is " + Group7SolarTrails.getShip().getCurrentShipDurability()
                                                            + " of " + Group7SolarTrails.getShip().getMaxShipDurability());
        try {
        this.console.println("*********** Repairing your ship! ***********");
        currentParts -= (repairsNeeded);
        Group7SolarTrails.inventory.get(partsIndex).setQuantity(currentParts);
        // formula to remove needed parts
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chooseSynthesizer() {
        // Synthesizer menu
    }
    private void chooseHarvest() {
        // LocationHarvestMenuView harvestMenuView = new LocationHarvestMenuView(); // choose harvest menu
        // harvestMenuView.display();
    }

    private void chooseDropSatellite() {
        double parts;
        int partsIndex = 0;
        // Drop Satellite or Probe
        
        if (Group7SolarTrails.inventory.get(partsIndex).getQuantity() < 100) {
            try {
            this.console.println("You do not have enough parts. Go synthesize some!");
            this.console.println("Press Enter to Continue");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        LocationMenuView locMenuView = new LocationMenuView();
        locMenuView.display();
        } catch (IOException e) {
        e.printStackTrace();
        }
        }
        this.console.println("You have decided to launch a satellite to orbit this planet.");
        this.console.println("*** Assembling Satellite! ***");
        int currentParts = Group7SolarTrails.inventory.get(partsIndex).getQuantity();
        currentParts -= (100);
        Group7SolarTrails.inventory.get(partsIndex).setQuantity(currentParts);
        // formula to remove 100 parts
        try {
        this.console.println("Creating a Satellite used 100 parts.  You now have " + currentParts + " parts remaining.");
        this.console.println("*** Launching Satellite! ***");
        this.console.println("Press Enter to Continue");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        LocationMenuView locMenuView = new LocationMenuView();
        locMenuView.display();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    private void chooseNextLocation() {
        // MapChooseDestinationView menu
        GameMapLocation gameMapLocation = new GameMapLocation();
        gameMapLocation.display();
    }

}
