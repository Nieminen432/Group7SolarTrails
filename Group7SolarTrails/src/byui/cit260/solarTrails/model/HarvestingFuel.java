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
public class HarvestingFuel implements Serializable {
    private String description;
    private int travelTime;
    private boolean isBlocked;
    private int amountAvailable;
    private int resourceType;
    private int foodUsed;
    private int fuelUsed;

    public HarvestingFuel() {
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

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public int getResourceType() {
        return resourceType;
    }

    public void setResourceType(int resourceType) {
        this.resourceType = resourceType;
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
        return "HarvestingFuel{" + "description=" + description + ", travelTime=" + travelTime + ", isBlocked=" + isBlocked + ", amountAvailable=" + amountAvailable + ", resourceType=" + resourceType + ", foodUsed=" + foodUsed + ", fuelUsed=" + fuelUsed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.travelTime;
        hash = 23 * hash + (this.isBlocked ? 1 : 0);
        hash = 23 * hash + this.amountAvailable;
        hash = 23 * hash + this.resourceType;
        hash = 23 * hash + this.foodUsed;
        hash = 23 * hash + this.fuelUsed;
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
        final HarvestingFuel other = (HarvestingFuel) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (this.isBlocked != other.isBlocked) {
            return false;
        }
        if (this.amountAvailable != other.amountAvailable) {
            return false;
        }
        if (this.resourceType != other.resourceType) {
            return false;
        }
        if (this.foodUsed != other.foodUsed) {
            return false;
        }
        return this.fuelUsed == other.fuelUsed;
    }
}
