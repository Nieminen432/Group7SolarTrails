/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.util.Objects;

/**
 *
 * @author Joseph
 */
public class Character {
        
    /*
    Crew members are not static when game starts. Outside of this object, we will make an arraylist for our characters. 
    However, we have modified this as directions have stated for learning purposes.
    */

    public String name;
    public int spec;
    public String description;
    public double health;
    
    public Character() {
        this.name = "aaa";
        this.spec = 999;
        this.health = health;
    }
    
    public Character(String name, int s, String description, double health) {
        this.name = name;
        this.spec = s;
        this.health = health;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpec() {
        return spec;
    }

    public void setSpec(int spec) {
        this.spec = spec;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + "health=" + health + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
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
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }
}