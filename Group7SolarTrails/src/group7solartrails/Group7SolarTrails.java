/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7solartrails;

import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.Character;
import byui.cit260.solarTrails.model.AlienObjects;
import byui.cit260.solarTrails.model.Engine;
import byui.cit260.solarTrails.model.Food;
import byui.cit260.solarTrails.model.Fuel;
import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.HarvestingFuel;
import byui.cit260.solarTrails.model.InventoryItem;
import byui.cit260.solarTrails.model.ItemSynthesizer;
import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Medicine;
import byui.cit260.solarTrails.model.Minerals;
import byui.cit260.solarTrails.model.Parts;
import byui.cit260.solarTrails.model.RandomEncounterSceneType;
import byui.cit260.solarTrails.model.RegularSceneType;
import byui.cit260.solarTrails.model.ResearchEvent;
import byui.cit260.solarTrails.model.ScientistSpecialization;
import byui.cit260.solarTrails.model.Ship;
import byui.cit260.solarTrails.model.SynthesizedItems;

/**
 *
 * @author Hiatt-Adam
 */
public class Group7SolarTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Space Captain");
       playerOne.setBestScore(200);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       InventoryItem inventoryItem = new InventoryItem();
       
       inventoryItem.setInventoryType("Inventory");
       inventoryItem.setQuantityInStock(500);
     
       String inventoryInfo = inventoryItem.toString();
       System.out.println(inventoryInfo);
    
       Fuel fuel = new Fuel();
       
       fuel.setTotal(500);
       String fuelInfo = fuel.toString();
       System.out.println(fuelInfo);
       
       Minerals minerals = new Minerals();
       
       minerals.setName("iron");
       minerals.setPrice(100);
       minerals.setDescription("A pile of iron used to make parts for the ship");
       minerals.setType("metal");
       minerals.setSize(50);
       minerals.setWeight(200);
       
       String mineralInfo = minerals.toString();
       System.out.println(mineralInfo);
       
       ItemSynthesizer synthesizer = new ItemSynthesizer();
       
       synthesizer.setEfficiency(20);
       synthesizer.setListItems("List of Items");
       synthesizer.setStateOfRepair("This item has 80% left");
       
       String synthesizerInfo = synthesizer.toString();
       System.out.println(synthesizerInfo);
       
       Parts parts = new Parts();
       parts.setApplication("Repairs the Ship");
       parts.setPercentRepaired(20);
       
       String partsInfo = parts.toString();
       System.out.println(partsInfo);
       
       SynthesizedItems synthesized = new SynthesizedItems();
       synthesized.setWeight(200);
       
       String synthesizedInfo = synthesized.toString();
       System.out.println(synthesizedInfo);
       
       Food food = new Food();
       food.setTotal(100);
       
       String foodInfo = food.toString();
       System.out.println(foodInfo);
       
       Medicine medicine = new Medicine();
       medicine.setApplication("Heals the Character a certain percent");
       medicine.setEffectiveness(10);
       
       String medicineInfo = medicine.toString();
       System.out.println(medicineInfo);
       
       
       
       Character character = new Character();
       character.setDescription("A super awesome dude!");
       character.setHealth(200);
       
       String characterInfo = character.toString();
       System.out.println(characterInfo);
       
       AlienObjects alienObject = new AlienObjects();
       Game game = new Game();
       HarvestingFuel fuelHarvest = new HarvestingFuel();
       Location location = new Location();
       Map map = new Map();
       RandomEncounterSceneType randEncSceneType = new RandomEncounterSceneType();
       RegularSceneType regSceneType = new RegularSceneType();
       ResearchEvent resEvent = new ResearchEvent();
       ScientistSpecialization sciSpec = new ScientistSpecialization();
       Ship ship = new Ship();
       Engine engine = new Engine();
       
       alienObject.setAmountResearched(40);
       alienObject.setDescription("Stuff and things");
       alienObject.setDistanceToUranus(57);
       alienObject.setResearchScenarios("Things and such?");
       alienObject.setSpeed(47000);
       
       game.setCrewName("AwesomeSauce7");
       game.setCurrentScore(700000000);
       game.setGameDate(57);
       game.setNoPeople(7);
       game.setTotalTime(17);
       
       fuelHarvest.setAmountAvailable(200);
       fuelHarvest.setDescription("More things and Stuff");
       fuelHarvest.setFoodUsed(100);
       fuelHarvest.setFuelUsed(100);
       fuelHarvest.setIsBlocked(true);
       fuelHarvest.setResourceType(2);
       fuelHarvest.setTravelTime(3);
       
       location.setAmountRemaining(7);
       location.setVisited(1, true);
       
       engine.setFuelConsumption(34);
       engine.setMaxSpeed(800);
       engine.setWeight(74);
       
       ship.setEngine(engine);
       ship.setDescription("Big");
       ship.setLength(70000000);
       
       String objectInfo = alienObject.toString();
       String gameInfo = game.toString();
       String fuelHarvestInfo = fuelHarvest.toString();
       String locInfo = location.toString();
       String mapInfo = map.toString();
       String randEncSceneTypeInfo = randEncSceneType.toString();
       String regSceneTypeInfo = regSceneType.toString();
       String resEventInfo = resEvent.toString();
       String sciSpecInfo = sciSpec.toString();
       String shipInfo = ship.toString();
       String engineInfo = engine.toString();
       
       System.out.println(objectInfo);
       System.out.println(gameInfo);
       System.out.println(fuelHarvestInfo);
       System.out.println(locInfo);
       System.out.println(mapInfo);
       System.out.println(randEncSceneTypeInfo);
       System.out.println(regSceneTypeInfo);
       System.out.println(resEventInfo);
       System.out.println(sciSpecInfo);
       System.out.println(shipInfo);
       System.out.println(engineInfo);
    }
}
