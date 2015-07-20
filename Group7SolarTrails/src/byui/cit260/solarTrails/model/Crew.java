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
    private double health;
    private String specName;
    
    public Crew() {
        this.name = "aaa";
        this.spec = 999;
        this.health = 0.0;
        this.specName = "";
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getResearchSpec() {
        return specName;
    }

    public void setResearchSpec(String researchSpec) {
        this.specName = researchSpec;
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

    @Override
    public String toString() {
        return "Crew{" + "name=" + name + ", spec=" + spec + ", health=" + health + ", researchSpec=" + specName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.spec;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.specName);
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
        final Crew other = (Crew) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.spec != other.spec) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return Objects.equals(this.specName, other.specName);
    }
}