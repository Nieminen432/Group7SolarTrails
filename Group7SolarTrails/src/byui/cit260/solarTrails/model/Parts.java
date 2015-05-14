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
public class Parts implements Serializable{

    // class instance variables
    private String application;
    private double percentRepaired;

    public Parts() {
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public double getPercentRepaired() {
        return percentRepaired;
    }

    public void setPercentRepaired(double percentRepaired) {
        this.percentRepaired = percentRepaired;
    }

    @Override
    public String toString() {
        return "Parts{" + "application=" + application + ", percentRepaired=" + percentRepaired + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.application);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.percentRepaired) ^ (Double.doubleToLongBits(this.percentRepaired) >>> 32));
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
        final Parts other = (Parts) obj;
        if (!Objects.equals(this.application, other.application)) {
            return false;
        }
        if (Double.doubleToLongBits(this.percentRepaired) != Double.doubleToLongBits(other.percentRepaired)) {
            return false;
        }
        return true;
    }

    
}
