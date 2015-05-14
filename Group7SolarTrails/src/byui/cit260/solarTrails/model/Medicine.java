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
public class Medicine implements Serializable{
    
    private String application;
    private double effectiveness;

    public Medicine() {
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public double getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(double effectiveness) {
        this.effectiveness = effectiveness;
    }

    @Override
    public String toString() {
        return "Medicine{" + "application=" + application + ", effectiveness=" + effectiveness + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.application);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.effectiveness) ^ (Double.doubleToLongBits(this.effectiveness) >>> 32));
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
        final Medicine other = (Medicine) obj;
        if (!Objects.equals(this.application, other.application)) {
            return false;
        }
        if (Double.doubleToLongBits(this.effectiveness) != Double.doubleToLongBits(other.effectiveness)) {
            return false;
        }
        return true;
    }
            
    
}
