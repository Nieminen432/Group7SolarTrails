/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import byui.cit260.solarTrails.control.*;

/**
 *
 * @author Joseph
 */
public class Location implements Serializable{
    private int location = 0;
    
    private boolean[] visited = new boolean[9];
    private double currentLocation = 0;
    private String currentLoc = null;

    public String getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        this.currentLoc = currentLoc;
    }
    private double destinationLocation = 0;
    private String destLocation = null;
    

    public String getDestLocation() {
        return destLocation;
    }

    public void setDestLocation(String destLocation) {
        this.destLocation = destLocation;
    }

    public double getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(double destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public boolean[] getVisited() {
        return visited;
    }

    public void setVisited(boolean[] visited) {
        this.visited = visited;
    }

    public double getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(double currentLocation) {
        this.currentLocation = currentLocation;
    }
    private Scene scene;

    public Location() {
        
    }

    public boolean getVisited(int index) {
        return visited[index];
    }

    public void setVisited(int index, boolean visited) {
        this.visited[index] = visited;
    }

    public void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
