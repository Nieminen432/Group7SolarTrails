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
public class ItemSynthesizer implements Serializable{
    
    // class instance variables
    private String stateOfRepair;
    private String listItems;
    private double efficiency;

    public ItemSynthesizer() {
    }
    
    public String getStateOfRepair() {
    return stateOfRepair;
    }

    public void setStateOfRepair(String stateOfRepair) {
        this.stateOfRepair = stateOfRepair;
    }

    public String getListItems() {
        return listItems;
    }

    public void setListItems(String listItems) {
        this.listItems = listItems;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "ItemSynthesizer{" + "stateOfRepair=" + stateOfRepair + ", listItems=" + listItems + ", efficiency=" + efficiency + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.stateOfRepair);
        hash = 71 * hash + Objects.hashCode(this.listItems);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.efficiency) ^ (Double.doubleToLongBits(this.efficiency) >>> 32));
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
        final ItemSynthesizer other = (ItemSynthesizer) obj;
        if (!Objects.equals(this.stateOfRepair, other.stateOfRepair)) {
            return false;
        }
        if (!Objects.equals(this.listItems, other.listItems)) {
            return false;
        }
        if (Double.doubleToLongBits(this.efficiency) != Double.doubleToLongBits(other.efficiency)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
