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
public class Map implements Serializable{
    private final String[] planets = new String[9];

    public Map() {
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Earth";
        planets[3] = "Mars";
        planets[4] = "Jupiter";
        planets[5] = "Saturn";
        planets[6] = "Uranus";
        planets[7] = "Neptune";
        //Because I still consider it a planet!
        planets[8] = "Pluto";
    }

    public String[] getPlanets() {
        return planets;
    }

    @Override
    public String toString() {
        return "Map{" + "planets=" + Arrays.toString(planets) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Arrays.deepHashCode(this.planets);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.planets, other.planets)) {
            return false;
        }
        return true;
    }
    
    
}
