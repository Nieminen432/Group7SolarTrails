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
    
    public class PlanetDist {
        public static final double Mercury = 2815.79;
        public static final double Venus = 5390.23;
        public static final double Earth = 7481.96;
        public static final double Mars = 11424.07;
        public static final double Jupiter = 38938.37;
        public static final double Saturn = 71521.09;
        public static final double Uranus = 14407.59;
        public static final double Neptune = 255263.28;
        public static final double Pluto = 295255.70;
    }
    
    
    private boolean[] visited = new boolean[9];
    private int[][] distances = new int[9][9];

    public Map() {
        int[] distanceFromSun = new int[9];
        //Distance is in Meridian
        //need to convert to Meridian.  12,429.90 miles per meridian
        distanceFromSun[0] = (int) 2815.79; //Mercery
        distanceFromSun[1] = (int) 5390.23; //Venus
        distanceFromSun[2] = (int) 7481.96; //Earth
        distanceFromSun[3] = (int) 11424.07; //Mars
        distanceFromSun[4] = (int) 38938.37; //Jupiter
        distanceFromSun[5] = (int) 71521.09; //Saturn
        distanceFromSun[6] = (int) 144007.59; //Uranus
        distanceFromSun[7] = (int) 225263.28; //Neptune
        distanceFromSun[8] = (int) 295255.79; //Pluto
        
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
