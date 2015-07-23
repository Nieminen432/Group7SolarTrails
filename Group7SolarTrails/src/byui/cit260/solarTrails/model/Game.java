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

public class Game implements Serializable{
    
    //class instance variables
    private String crewName;
    private Player player;
    private double totalTime;
    private double currentScore;
    private double noPeople;
    private double gameDate;
    private InventoryItem[] inventory;
    private Ship ship;
    private Map map;
    private Engine engine;
    private Fuel fuel;
    private Crew Crew;
    private AlienObjects alienObejcts;
    private Medicine medicine;
    private Minerals minerals;
    private Parts parts;
    private SynthesizedItems synthesizedItems;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Crew getCrew() {
        return Crew;
    }

    public void setCrew(Crew Crew) {
        this.Crew = Crew;
    }

    public AlienObjects getAlienObejcts() {
        return alienObejcts;
    }

    public void setAlienObejcts(AlienObjects alienObejcts) {
        this.alienObejcts = alienObejcts;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Minerals getMinerals() {
        return minerals;
    }

    public void setMinerals(Minerals minerals) {
        this.minerals = minerals;
    }

    public Parts getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts = parts;
    }

    public SynthesizedItems getSynthesizedItems() {
        return synthesizedItems;
    }

    public void setSynthesizedItems(SynthesizedItems synthesizedItems) {
        this.synthesizedItems = synthesizedItems;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    private int location = 0;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Game() {
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }

    public double getGameDate() {
        return gameDate;
    }

    public void setGameDate(double gameDate) {
        this.gameDate = gameDate;
    }

    @Override
    public String toString() {
        return "Game{" + "crewName=" + crewName + ", totalTime=" + totalTime + ", currentScore=" + currentScore + ", noPeople=" + noPeople + ", gameDate=" + gameDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.crewName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.gameDate) ^ (Double.doubleToLongBits(this.gameDate) >>> 32));
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.crewName, other.crewName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noPeople) != Double.doubleToLongBits(other.noPeople)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gameDate) != Double.doubleToLongBits(other.gameDate)) {
            return false;
        }
        return true;
    }

    public void setAlienObjects(Ship ship) {
        //Set Object
    }

    public int getLocation() {
        return location;
    }
    
           
    
}
