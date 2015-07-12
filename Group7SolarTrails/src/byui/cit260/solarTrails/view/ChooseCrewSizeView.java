/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

/**
 *
 * @author Hiatt-Adam
 */
public class ChooseCrewSizeView extends View{
    public static int crewSize;
    public ChooseCrewSizeView () {
        super("\n"
            + "\n-----------------------------------"
            + "\n | Pick your crew members."
            + "\n-----------------------------------"
            + "\n1 - Only you will take this trip. This provides the highest amount of points but is also more dangerous."
            + "\n2 - You and one other will take this trip."
            + "\n3 - You and two others will take this trip. This is the maximum size for a small ship size."
            + "\n4 - You and three others will take this trip."
            + "\n5 - You and four others will take this trip."
            + "\n6 - You and five others will take this trip. This is the maximum size for a medium ship size."
            + "\n7 - You and six others will take this trip."
            + "\n8 - You and seven others will take this trip."
            + "\n9 - You and eight others will take this trip. This is the maximum size for a large ship size."
            + "\nR - Reset currently selected ship options"
            + "\nD - Go Back to the previous menu"
            + "\n------------------------------------");
    }

@Override
        public boolean doAction(Object obj) {
 
           String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
            switch (choice) {
                case '1': // create and start a new game
                    this.crewSizeOne();
                    break;
                case '2': // get and start an existing game
                    this.crewSizeTwo();
                    break;
                case '3': // get and start an existing game
                    this.crewSizeThree();
                    break;
                case '4': // get and start an existing game
                    this.crewSizeFour();
                    break;
                case '5': // get and start an existing game
                    this.crewSizeFive();
                    break;
                case '6': // get and start an existing game
                    this.crewSizeSix();
                    break;
                case '7': // get and start an existing game
                    this.crewSizeSeven();
                    break;
                case '8': // get and start an existing game
                    this.crewSizeEight();
                    break;
                case '9': // get and start an existing game
                    this.crewSizeNine();
                    break;
                case 'R': // display the help menu
                    this.resetCrewOptions();
                    break;
                case 'D': // Exit the program
                    this.previousMenu();
                    break;
                default:
                    this.console.println("\n*** Invalid selection *** Try again");
                    break;
        }
        return false;

        }

    private void crewSizeOne() {
        crewSize = 1;
        // Going it alone
        this.console.println("You have decided to go alone.");
    }

    private void crewSizeTwo() {
        crewSize = 2;
        // You and one other
        this.console.println("You and one other will take this trip.");
    }

    private void crewSizeThree() {
        crewSize = 3;
        // Going it alone
        this.console.println("You and two others will take this trip.");
    }

    private void crewSizeFour() {
        crewSize = 4;
        // Going it alone
        this.console.println("You and three others will take this trip.");
    }

    private void crewSizeFive() {
        crewSize = 5;
        // Going it alone
        this.console.println("You and four others will take this trip.");
    }

    private void crewSizeSix() {
        crewSize = 6;
        // Going it alone
        this.console.println("You and five others will take this trip.");
    }

    private void crewSizeSeven() {
        crewSize = 7;
        // Going it alone
        this.console.println("You and six others will take this trip.");
    }

    private void crewSizeEight() {
        crewSize = 8;
        // Going it alone
        this.console.println("You and seven others will take this trip.");
    }

    private void crewSizeNine() {
        crewSize = 9;
        // Going it alone
        this.console.println("You and eight others will take this trip.");
    }

    private void resetCrewOptions() {
        // reset crew options
    }

    private void previousMenu() {
        ChooseCrewMemberMenuView chooseCrew = new ChooseCrewMemberMenuView();
        chooseCrew.display();
    }
}
