/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nixon-Joseph
 */
public class RandomSceneMenuView {
    private String menu = "";
    
    public void createMenu(int situationNumber) {
        menu = "\n\n-----------------------------------";
        switch (situationNumber) {
            case 1:
                menu += "\n | You have encoutered a asteroid";
                break;
            case 2:
                menu += "\n | You have encoutered an engine failure"
                      + "\n | You will be stationary until repaired.";
                break;
            case 3:
                menu += "\n | You have encoutered a micro singularity";
                break;
            case 4:
                menu += "\n | You have encoutered computer failure"
                      + "\n | which resulted in taking you off course"
                      + "\n | by two days";
                break;
            case 5:
                menu += "\n | You have encoutered toilet malfunction"
                      + "\n | Morale is down";
                break;
            case 6:
                menu += "\n | You have encoutered power failure"
                      + "\n | your crew says it will take 2 days to repair.";
                break;
            case 7:
                menu += "\n | You have encoutered a malfunctioning satellite"
                      + "\n | you may choose to repair it, or leave it";
                break;
            case 8:
                menu += "\n | Your pilot notices a complete lack of starlight"
                      + "\n | on the starboard side of the ship, investigate?";
                break;
            case 9:
                menu += "\n | You have Cholera"
                      + "\n | your medic cured you of cholera.";
                break;
            case 10:
                menu += "\n | You have encoutered alien life..."
                      + "\n | It splattered across your ship's front viewport.";
                break;
        } switch (situationNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
                menu += "\n | Please select an option."
                      + "\n-----------------------------------";
                break;
        } switch (situationNumber) {
            case 1:
                menu += "\nH - Harvest minerals"
                      + "\nC - Continue on";
                break;
            case 2:
                menu += "\nR - Repair"
                      + "\nS - Synth"
                      + "\nI - Inventory";
                break;
            case 3:
                menu += "\nP - Send probe"
                      + "\nG - Go through the singularty"
                      + "\nC - Continue on";
                break;
            case 4:
                menu += "\nM - Open map";
            case 5:
            case 6:
                menu += "\nC - Continue on";
                break;
            case 7:
                menu += "\nF - Fix Satellite"
                      + "\nC - Continue on";
                break;
            case 8:
                menu += "\nYes or no (Y/N)";
                break;
            case 9:
            case 10:
                menu += "\nC - Continue on";
                break;
        }
        menu += "\n-----------------------------------";
    }
    
    void startRandomEventMenu() {
        Random rand = new Random();
        int randomSituation = rand.nextInt((10 - 1) + 1) + 1;
        
        createMenu(randomSituation);
        this.displayMenu(randomSituation);
    }
    
    public void displayMenu(int randomSituation) {
        char selection = ' ';
        System.out.println(menu); // display the new game menu

        String input = this.getInput(); // get the user's selection
        selection = input.charAt(0); // get first character of string

        this.doAction(selection, randomSituation); // do action based on selection
    }

    private void doAction(char selection, int randomSituation) {
        switch (randomSituation) {
            case 1:
                switch (selection) {
                    case 'H': 
                        this.chooseHarvest();
                        break;
                    case 'C': 
                        this.chooseContinue();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 2:
                switch (selection) {
                    case 'R': 
                        this.chooseRepair();
                        break;
                    case 'S': 
                        this.chooseSynth();
                        break;
                    case 'I': 
                        this.chooseInventory();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 3:
                switch (selection) {
                    case 'P': 
                        this.chooseProbe();
                        break;
                    case 'G': 
                        this.chooseSingularity();
                        break;
                    case 'C': 
                        this.chooseContinue();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 4:
                switch (selection) {
                    case 'M': 
                        this.chooseMap();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 5:
            case 6:
                switch (selection) {
                    case 'C': 
                        this.chooseContinue();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 7:
                switch (selection) {
                    case 'F': 
                        this.chooseSatFix();
                        break;
                    case 'C': 
                        this.chooseContinue();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 8:
                switch (selection) {
                    case 'Y': 
                        this.chooseYes();
                        break;
                    case 'N': 
                        this.chooseNo();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
            case 9:
            case 10:
                switch (selection) {
                    case 'C': 
                        this.chooseContinue();
                        break;
                    default:
                        System.out.println("\n*** Invalid selection *** Try again");
                        getInput();
                        break;
                }
                break;
        }
    }

    private String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while(!valid) { // while a valid input has not been retreved
           
            // prompt for a menu item
            System.out.println("Select a menu item.");

            // get the input from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();

            // if the input is invalid (more than 1 character)
            if (input.length() > 1) {
                System.out.println("Invalid selection - please enter a menu item.");
                continue; // and repeat again
            }
            break; // exit repetition
        }
        return input; // return the input
    }

    private void chooseHarvest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseContinue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseRepair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseSynth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseProbe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseSingularity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseSatFix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseYes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
