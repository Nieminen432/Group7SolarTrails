/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Joseph
 */
public class Crew implements Serializable {
    private String name;
    private int spec;
    private String description;
    private double health;
    private String researchSpec;
    
    public Crew() {
        this.name = "aaa";
        this.spec = 999;
        this.health = health;
    }
    
    public Crew(String name, int s, String description, double health) {
        this.name = name;
        this.spec = s;
        this.health = health;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResearchSpec() {
        return researchSpec;
    }

    public void setResearchSpec(String researchSpec) {
        this.researchSpec = researchSpec;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpec(int spec) {
        this.spec = spec;
    }

    public int getSpec() {
        return spec;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String toString() {
        return "Crew{" + "name=" + name + ", spec=" + spec + ", description=" + description + ", health=" + health + ", researchSpec=" + researchSpec + '}';
    }

    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.spec;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.researchSpec);
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crew other = (Crew) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.spec != other.spec) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (!Objects.equals(this.researchSpec, other.researchSpec)) {
            return false;
        }
        return true;
    }
}