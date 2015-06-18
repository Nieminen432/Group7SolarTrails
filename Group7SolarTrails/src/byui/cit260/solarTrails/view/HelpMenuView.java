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
public class HelpMenuView extends View{
    public HelpMenuView() {
    super("\n"
            + "\n---------------------------------------"
            + "\n | Help Menu - Choose a topic"
            + "\n---------------------------------------"
            + "\nO - Overview of the game."
            + "\nC - Controls in the game."
            + "\nP - Planning your trip. "
            + "\nR - Research Specializations."
            + "\nT - Travel."
            + "\nH - Harvesting fuel/minerals"
            + "\nS - Synthesizing Items."
            + "\nD - Go Back to the previous menu"
            + "\n-----------------------------------");
    }
@Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'O': // create and start a new game
                this.chooseOverview();
                break;
            case 'C': // get and start an existing game
                this.chooseControls();
                break;
            case 'P': // display the help menu
                this.choosePlanning();
                break;
            case 'R': // Exit the program
                this.previousResearch();
                break;
            case 'T': // create and start a new game
                this.chooseTravel();
                break;
            case 'H': // get and start an existing game
                this.chooseHarvesting();
                break;
            case 'S': // display the help menu
                this.chooseSynthesizing();
                break;
            case 'D': // Previous Menu
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

    } return false;
    }

    private void chooseOverview() {
        // Show Overview Help
    }

    private void chooseControls() {
        // Show Controls Help
    }

    private void choosePlanning() {
        // Show Planning Help
    }

    private void previousResearch() {
        // Show Research Help
    }

    private void chooseTravel() {
        // Show Travel Help
    }

    private void chooseHarvesting() {
        // Show Harvesting Help
    }

    private void chooseSynthesizing() {
        // Show Synthesizing Help
    }

    private void previousMenu() {
        NewGameMenuView newGameMenu = new NewGameMenuView();
        newGameMenu.display();
        // Previous Menu. This will need to be adjusted to go to whatever menu the player was at previously.
    }

    
}
