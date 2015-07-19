/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.Engine;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseEngineTypeView extends View{
    public ChooseEngineTypeView() {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your ship type"
            + "\n-----------------------------------"
            + "\nC - This is the combustion engine. Its max speed is 5 meridian/hour."
            + "\n    This engine burns rocketfuel which can be harvested or synthesized. "
            + "\n    This engine is tried and tested and doesn't have many problems."
            + "\nI - This is the impulse engine. It's max speed is 10 meridian/hour"
            + "\n    This engine runs on nuclear power."
            + "\n    The nuclear module is powered by materials which can be harvested."
            + "\n    This engine has gone through extensive testing but still experiences breakdowns."
            + "\nS - This is the Solar Sail. It's max speed is 15 meridian/hour."
            + "\n    This Solar Sail runs on solar power and it is a very new technology that is not fully test."
            + "\nR - Reset currently selected ship options"
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }



    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'C': // create and start a new game
                this.chooseCombustionEngine();
                break;
            case 'I': // get and start an existing game
                this.chooseImpulseEngine();
                break;
            case 'S': // get and start an existing game
                this.chooseSolarSail();
                break;
            case 'R': // display the help menu
                this.resetShipOptions();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        } return false;
    }

    private void chooseCombustionEngine() {
        // Select SmallShipType
        try {
        this.console.println("You have selected the Combustion Engine.");
        Engine engine = new Engine();
        engine.setFuelConsumption(1);
        engine.setMaxSpeed(5);
        Group7SolarTrails.setEngine(engine);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
    }
    private void chooseImpulseEngine() {
        // Select MediumShipType
        try {
        this.console.println("You have selected the Impulse Engine.");
        Engine engine = new Engine();
        engine.setFuelConsumption(2);
        engine.setMaxSpeed(10);
        Group7SolarTrails.setEngine(engine);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
    }
    
    private void chooseSolarSail() {
        // Select Solar Sail
        try {
        this.console.println("You have selected the Impulse Engine.");
        this.console.println("Press Enter to Continue.");
        Engine engine = new Engine();
        engine.setFuelConsumption(3);
        engine.setMaxSpeed(15);
        Group7SolarTrails.setEngine(engine);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
    }
    /*
    private void chooseSolarSail() {
        // Select Solar Sail
        this.console.println("You have selected the Hyperdrive.");
        Group7SolarTrails.getShip().setEngine(new Engine(3));
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
*/
    private void resetShipOptions() {
        // reset ship type
        try {
        this.console.println("You have reset your engine options");
        this.console.println("Press Enter to Continue.");
        Group7SolarTrails.engine.setFuelConsumption(0);
        Group7SolarTrails.engine.setMaxSpeed(0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        ChooseEngineTypeView chooseEngine = new ChooseEngineTypeView();
        chooseEngine.display();
    }
    }
    private void previousMenu() {
        ChooseShipView chooseShip = new ChooseShipView();
        chooseShip.display();
    }
}
