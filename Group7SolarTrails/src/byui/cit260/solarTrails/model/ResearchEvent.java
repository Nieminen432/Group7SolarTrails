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
public class ResearchEvent implements Serializable{
    private String description;
    private int time;
    private int amountAvailable;
    private int foodUsed;
    private int fuelUsed;
    private int bonusFromSpecialization;
    private int amountResearched;

    public ResearchEvent() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
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

    public int getBonusFromSpecialization() {
        return bonusFromSpecialization;
    }

    public void setBonusFromSpecialization(int bonusFromSpecialization) {
        this.bonusFromSpecialization = bonusFromSpecialization;
    }

    public int getAmountResearched() {
        return amountResearched;
    }

    public void setAmountResearched(int amountResearched) {
        this.amountResearched = amountResearched;
    }

    @Override
    public String toString() {
        return "ResearchEvent{" + "description=" + description + ", time=" + time + ", amountAvailable=" + amountAvailable + ", foodUsed=" + foodUsed + ", fuelUsed=" + fuelUsed + ", bonusFromSpecialization=" + bonusFromSpecialization + ", amountResearched=" + amountResearched + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.time;
        hash = 23 * hash + this.amountAvailable;
        hash = 23 * hash + this.foodUsed;
        hash = 23 * hash + this.fuelUsed;
        hash = 23 * hash + this.bonusFromSpecialization;
        hash = 23 * hash + this.amountResearched;
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
        final ResearchEvent other = (ResearchEvent) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.time != other.time) {
            return false;
        }
        if (this.amountAvailable != other.amountAvailable) {
            return false;
        }
        if (this.foodUsed != other.foodUsed) {
            return false;
        }
        if (this.fuelUsed != other.fuelUsed) {
            return false;
        }
        if (this.bonusFromSpecialization != other.bonusFromSpecialization) {
            return false;
        }
        return this.amountResearched == other.amountResearched;
    }
    
    
}
