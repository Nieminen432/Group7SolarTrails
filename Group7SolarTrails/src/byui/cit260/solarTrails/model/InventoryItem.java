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
public class InventoryItem implements Serializable{
    // class instance variables
    private int inventoryType;
    private int quantity;
    private String description;
    
    public InventoryItem() {
        this.inventoryType = 0;
        this.quantity = 0;
        this.description = "";
    }
    
    public InventoryItem(int type, int quant, String desc) {
        this.inventoryType = type;
        this.quantity = quant;
        this.description = desc;
    }

    public int getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(int inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.inventoryType);
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
        final InventoryItem other = (InventoryItem) obj;
        return Objects.equals(this.inventoryType, other.inventoryType);
    }

    public String getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
