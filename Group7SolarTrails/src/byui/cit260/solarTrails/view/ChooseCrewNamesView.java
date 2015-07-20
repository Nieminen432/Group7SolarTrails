/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.Crew;
import group7solartrails.Group7SolarTrails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiatt-Adam
 */

public class ChooseCrewNamesView  {
    private ArrayList<Crew> crewList = null;
    
    protected final BufferedReader keyboard = Group7SolarTrails.getInFile();
    protected final PrintWriter console = Group7SolarTrails.getOutFile();

    ChooseCrewNamesView(ArrayList<Crew> crewList) {
        this.crewList = crewList;
    }
    
    public void begin() {
        int numCrew = Group7SolarTrails.getShip().getNoCrew();
        for (int i = 0; i <= numCrew; i++) {
            if (i == numCrew) {
                System.out.println("\n---------------------------------------------"
                                  +"\n | You've picked your crew's names"
                                  +"\n---------------------------------------------");
                Group7SolarTrails.crewList = crewList;
                NewGameMenuView newGameMenu = new NewGameMenuView();
                newGameMenu.display();
            } else {
                int crewMember = i+1;
                System.out.println("\n---------------------------------------------"
                                  +"\n | Pick a name for crew member " + crewMember
                                  +"\n---------------------------------------------");
                pickName(i);
            }
        }
    }
    
    private void addName(String name, int index) {
        crewList.get(index).setName(name);
    }
    
    public String pickName(int crewMember) {
        String name = "";
        boolean valid = false;
        while (!valid) {
            try {
                name = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ChooseCrewResearchSpecMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (name.length() < 2 || name.length() > 15) {
                System.out.println("\nThe name must be between 2 and 15 characters in length"
                                 + "\nTry again");
            } else {
                valid = true;
                addName(name, crewMember);
            }
        }
        return name;
    }
}
