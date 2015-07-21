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
    private int maxInventory;
    private int amountLoaded;
    private int size;
    private int maxCrew;
    private int noCrew;
    private int fuelTank;
    private int fuelRemaining;
    private String description;
    private Engine engine;

    public Ship() {
        this.description = "";
        this.maxInventory = 30000;
        this.size = 1;
        this.amountLoaded = 0;
        this.maxCrew = 3;
        engine = new Engine(1);
        this.noCrew = 0;
        this.fuelTank = 30000;
        this.fuelRemaining = 30000;
    }
    
    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
    
    public int getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
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

    public int getMaxInventory() {
        return maxInventory;
    }

    public void setMaxInventory(int maxInventory) {
        this.maxInventory = maxInventory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "Ship{" + "Max Inventory Allowed = " + maxInventory
                    +"\nAmountLoaded = " + amountLoaded
                    + "\nMax Crew Allowed = " + maxCrew 
                    + "\nCurrent Number in Crew = " + noCrew
                    + "\nDescription = " + description
                    + "\nEngine= " + engine + '}'
                    + "\nAmount of fuel allowed = " + fuelTank
                    + "\nFuel Remaining = " + fuelRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.maxInventory;
        hash = 17 * hash + this.amountLoaded;
        hash = 17 * hash + this.maxCrew;
        hash = 17 * hash + this.noCrew;
        hash = 17 * hash + this.fuelTank;
        hash = 17 * hash + this.fuelRemaining;
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
        if (this.maxInventory != other.maxInventory) {
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
        if (this.fuelTank != other.fuelTank) {
            return false;
        }
        if (this.fuelRemaining != other.fuelRemaining) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.engine, other.engine);
    }
}
