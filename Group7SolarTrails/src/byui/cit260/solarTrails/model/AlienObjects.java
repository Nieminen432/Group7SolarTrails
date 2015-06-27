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
 * @author Hiatt-Adam
 */
public class AlienObjects implements Serializable{
    
    //class instance variables
    private String description;
    private String researchScenarios;
    private double speed;
    private double amountResearched;
    private double distanceToUranus;

    public AlienObjects() {
        this.description = "\nThis is an unknown alien object";
        
        this.amountResearched = 0;
        this.distanceToUranus = 100;
        this.speed = 100;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResearchScenarios() {
        return researchScenarios;
    }

    public void setResearchScenarios(String researchScenarios) {
        this.researchScenarios = researchScenarios;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAmountResearched() {
        return amountResearched;
    }

    public void setAmountResearched(double amountResearched) {
        this.amountResearched = amountResearched;
    }

    public double getDistanceToUranus() {
        return distanceToUranus;
    }

    public void setDistanceToUranus(double distanceToUranus) {
        this.distanceToUranus = distanceToUranus;
    }

    @Override
    public String toString() {
        return "AlienObjects{" + "description=" + description + ", researchScenarios=" + researchScenarios + ", speed=" + speed + ", amountResearched=" + amountResearched + ", distanceToUranus=" + distanceToUranus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.researchScenarios);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amountResearched) ^ (Double.doubleToLongBits(this.amountResearched) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.distanceToUranus) ^ (Double.doubleToLongBits(this.distanceToUranus) >>> 32));
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
        final AlienObjects other = (AlienObjects) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.researchScenarios, other.researchScenarios)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountResearched) != Double.doubleToLongBits(other.amountResearched)) {
            return false;
        }
        if (Double.doubleToLongBits(this.distanceToUranus) != Double.doubleToLongBits(other.distanceToUranus)) {
            return false;
        }
        return true;
    }
    
    
    
}
