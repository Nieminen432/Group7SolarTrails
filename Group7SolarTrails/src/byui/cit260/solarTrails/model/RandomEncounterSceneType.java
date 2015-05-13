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
public class RandomEncounterSceneType implements Serializable {
    private String description;
    private int travelTime;
    private boolean isBlocked;
    private int encounterType;
    private int foodUsed;
    private int fuelUsed;

    public RandomEncounterSceneType() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public int getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(int encounterType) {
        this.encounterType = encounterType;
    }

    public int getFoodUsed() {
        return foodUsed;
    }

    public void setFoodUsed(int foodUsed) {
        this.foodUsed = foodUsed;
    }

    public int getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(int fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    @Override
    public String toString() {
        return "RandomEncounterSceneType{" + "description=" + description + ", travelTime=" + travelTime + ", isBlocked=" + isBlocked + ", encounterType=" + encounterType + ", foodUsed=" + foodUsed + ", fuelUsed=" + fuelUsed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + this.travelTime;
        hash = 47 * hash + (this.isBlocked ? 1 : 0);
        hash = 47 * hash + this.encounterType;
        hash = 47 * hash + this.foodUsed;
        hash = 47 * hash + this.fuelUsed;
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
        final RandomEncounterSceneType other = (RandomEncounterSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (this.isBlocked != other.isBlocked) {
            return false;
        }
        if (this.encounterType != other.encounterType) {
            return false;
        }
        if (this.foodUsed != other.foodUsed) {
            return false;
        }
        return this.fuelUsed == other.fuelUsed;
    } 
}
