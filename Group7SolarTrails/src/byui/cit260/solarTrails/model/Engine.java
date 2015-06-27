/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */
public class Engine implements Serializable {
    private int maxSpeed;
    private int fuelConsumption;
    private int weight;

    public Engine(int engineNum) {
        //create 3 types dependent on passed in number
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" + "maxSpeed=" + maxSpeed + ", fuelConsumption=" + fuelConsumption + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.maxSpeed;
        hash = 97 * hash + this.fuelConsumption;
        hash = 97 * hash + this.weight;
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
        final Engine other = (Engine) obj;
        if (this.maxSpeed != other.maxSpeed) {
            return false;
        }
        if (this.fuelConsumption != other.fuelConsumption) {
            return false;
        }
        return this.weight == other.weight;
    }
}
