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
public class CrewRationsView extends View{
    public CrewRationsView() {
    
    super("\n"
            + "\n---------------------------------------"
            + "\n | Choose ration amount for your crew."
            + "\n---------------------------------------"
            + "\nS - Small Rations - Your crew is eating minimal amounts of food."
            + "\n    You are going through food slowly but this affects the health"
            + "\n    of your crew."
            + "\nM - Medium Ration - Your crew isn't starving and"
            + "\n    you are going through rations at a steady pace."
            + "\nL - Large Rations - Your crew is feasting but"
            + "\n    you are going through rations at a fast pace."
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }

        @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'S': // create and start a new game
                this.chooseSmallRations();
                break;
            case 'M': // get and start an existing game
                this.chooseMediumRations();
                break;
            case 'L': // display the help menu
                this.chooseLargeRations();
                break;
            case 'D': // Exit the program
                this.previousMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;

    } return false;
    }

    private void chooseSmallRations() {
        // Choose Small Ration Type
    }

    private void chooseMediumRations() {
        // Choose Medium Ration Type
    }

    private void chooseLargeRations() {
        // Choose Large Ration Type
    }

    private void previousMenu() {
        // go to previous menu
    }
}
