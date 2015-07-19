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

    public Engine() {
    }

    public Engine(int engineNum) {
        this.maxSpeed = engineNum*20;
        switch (engineNum) {
            case 1:
                this.fuelConsumption = 1;
                break;
            case 2:
                this.fuelConsumption = 2;
                break;
            case 3:
                this.fuelConsumption = 3;
                break;
        }
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

    @Override
    public String toString() {
        return "Engine{" + "maxSpeed=" + maxSpeed + ", fuelConsumption=" + fuelConsumption + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.maxSpeed;
        hash = 97 * hash + this.fuelConsumption;
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
        return true;
    }
}
