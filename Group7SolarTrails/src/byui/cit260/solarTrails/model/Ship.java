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
public class Ship implements Serializable {
    private int maxWeight;
    private int amountLoaded;
    private int maxCrew;
    private int noCrew;
    private String description;
    private Engine engine;

    public Ship() {
        this.description = "\nThis is your ship!!!";
        this.maxWeight = 20000;
        this.amountLoaded = 0;
        this.maxCrew = 12;
        engine = new Engine(1);
        this.noCrew = 0;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(int amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public int getMaxCrew() {
        return maxCrew;
    }

    public void setMaxCrew(int maxCrew) {
        this.maxCrew = maxCrew;
    }

    public int getNoCrew() {
        return noCrew;
    }

    public void setNoCrew(int noCrew) {
        this.noCrew = noCrew;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Ship{" + "maxWeight=" + maxWeight + ", amountLoaded=" + amountLoaded + ", maxCrew=" + maxCrew + ", noCrew=" + noCrew + ", description=" + description + ", width=" + ", engine=" + engine + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.maxWeight;
        hash = 17 * hash + this.amountLoaded;
        hash = 17 * hash + this.maxCrew;
        hash = 17 * hash + this.noCrew;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.engine);
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
        final Ship other = (Ship) obj;
        if (this.maxWeight != other.maxWeight) {
            return false;
        }
        if (this.amountLoaded != other.amountLoaded) {
            return false;
        }
        if (this.maxCrew != other.maxCrew) {
            return false;
        }
        if (this.noCrew != other.noCrew) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.engine, other.engine);
    }
}
