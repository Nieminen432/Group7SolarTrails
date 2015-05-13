/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Joseph
 */
public class Location implements Serializable{
    private boolean[] visited = new boolean[9];
    private int amountRemaining;
    private int[][] distances = new int[9][9];

    public Location() {
        int[] distanceFromSun = new int[9];
        //Distance is in millions of Miles
        distanceFromSun[0] = 35; //Mercery
        distanceFromSun[1] = 67; //Venus
        distanceFromSun[2] = 94; //Earth
        distanceFromSun[3] = 142; //Mars
        distanceFromSun[4] = 484; //Jupiter
        distanceFromSun[5] = 889; //Saturn
        distanceFromSun[6] = 1790; //Uranus
        distanceFromSun[7] = 2800; //Neptune
        distanceFromSun[8] = 3670; //Pluto
        
        amountRemaining = 8;
        visited[2] = true;
        //set all distances to own location to 0
        for(int i = 0; i < 9; i++) {
            distances[i][i] = 0;
        }
        
        //set all distances from each planet to the next
        //Luckily they're all perfectly in-line!
        for(int i = 0; i < 9; i++) {
            for(int l = 0; l < 9; l++){
                distances[i][l] = distanceFromSun[l] - distanceFromSun[i];
            }
        }
    }

    public boolean getVisited(int index) {
        return visited[index];
    }

    public void setVisited(int index, boolean visited) {
        this.visited[index] = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public int[][] getDistances() {
        return distances;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + Arrays.toString(visited) 
                + ", amountRemaining=" + amountRemaining + ", distances=" 
                + Arrays.toString(distances) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = Arrays.hashCode(this.visited) + 53 * hash;
        hash = 53 * hash + this.amountRemaining;
        hash = 53 * hash + Arrays.deepHashCode(this.distances);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Arrays.equals(this.visited, other.visited)) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return Arrays.deepEquals(this.distances, other.distances);
    }
    
    
}
