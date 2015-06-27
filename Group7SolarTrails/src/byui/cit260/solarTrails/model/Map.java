/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import byui.cit260.solarTrails.control.Scene;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Joseph
 */
public class Map implements Serializable{

    public Location[] getPlanets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Planets {
        Mercury,
        Venus,
        Earth,
        Mars,
        Jupiter,
        Saturn,
        Uranus,
        Neptune,
        Pluto;
    }
    private boolean[] visited = new boolean[9];
    private int[][] distances = new int[9][9];

    public Map() {
        int[] distanceFromSun = new int[9];
        //Distance is in millions of Miles
        //need to convert to AU
        distanceFromSun[0] = 35; //Mercery
        distanceFromSun[1] = 67; //Venus
        distanceFromSun[2] = 94; //Earth
        distanceFromSun[3] = 142; //Mars
        distanceFromSun[4] = 484; //Jupiter
        distanceFromSun[5] = 889; //Saturn
        distanceFromSun[6] = 1790; //Uranus
        distanceFromSun[7] = 2800; //Neptune
        distanceFromSun[8] = 3670; //Pluto
        
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
}
