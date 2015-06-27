/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Joseph
 */
public enum Character implements Serializable {
    
    /*
    Crew members are not static when game starts. Outside of this object, we will make an arraylist for our characters. 
    However, we have modified this as directions have stated for learning purposes.
    */
    NPC1("Your first crew member."),
    NPC2("Second crew member."),
    NPC3("Third crew member."),
    NPC4("Fourth crew member.");

    
    private final String description;
    private final int[] coordArray = new int[2];
    private final double health;

    Character(String description) {
        this.description = description;
        health = 100; 
    }

    public double getHealth() {
        return health;
    }

    public String getDescription() {
        return description;
    }

    public int[] getCoordArray() {
        return coordArray;
    }

}

/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Joseph
 
public class Character implements Serializable {
    private String name;
    private String description;
    private int[] coordArray = new int[2];
    private double health;

    public Character() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getCoordArray() {
        return coordArray;
    }

    public void setCoordArray(int[] coordArray) {
        this.coordArray = coordArray;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordArray=" + Arrays.toString(coordArray) + "health=" + health + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Arrays.hashCode(this.coordArray);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.equals(this.coordArray, other.coordArray)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }

    
    
}

*/