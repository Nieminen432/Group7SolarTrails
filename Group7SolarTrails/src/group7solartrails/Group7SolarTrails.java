/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7solartrails;

import byui.cit260.solarTrails.model.*;
import byui.cit260.solarTrails.view.*;
import byui.cit260.solarTrails.exceptions.*;
import byui.cit260.solarTrails.control.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Hiatt-Adam
 */
public class Group7SolarTrails {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Ship ship = null;
    private static InventoryItem inventory = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Group7SolarTrails.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Group7SolarTrails.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Group7SolarTrails.inFile = inFile;
    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Group7SolarTrails.currentGame = currentGame;
    }

    public static Ship getShip() {
        return ship;
    }

    public static void setShip(Ship ship) {
        Group7SolarTrails.ship = ship;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Group7SolarTrails.player = player;
    }    

    public static InventoryItem getInventory() {
        return inventory;
    }

    public static void setInventory(InventoryItem inventory) {
        Group7SolarTrails.inventory = inventory;
    }
    
    public static void setCrew(int maxCrew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
    public static void main(String[] args) {
        
        try {
            // open character stream files for end user input and output
            Group7SolarTrails.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            Group7SolarTrails.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            Group7SolarTrails.logFile = new PrintWriter(filePath);

        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        return;
        
        } catch (Throwable e) {
        System.err.println("Exception: " + e.toString() +
                            "\nCause: " + e.getCause() + 
                            "\nMessage: " + e.getMessage());
        e.printStackTrace();;
    }
    finally {
            try {
                if (Group7SolarTrails.inFile != null)
                    Group7SolarTrails.inFile.close();
                
                if (Group7SolarTrails.outFile != null)
                    Group7SolarTrails.outFile.close();
                
                if (Group7SolarTrails.logFile != null)
                    Group7SolarTrails.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
}

    
        
        
        
        
        
        
        
       /** class info that was previously added
        * Player One class
       Player playerOne = new Player();
       
       playerOne.setName("Space Captain");
       playerOne.setBestScore(200);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       // Inventory Item Class
       
       InventoryItem inventoryItem = new InventoryItem();
       
       inventoryItem.setInventoryType("Inventory");
       inventoryItem.setQuantityInStock(500);
     
       String inventoryInfo = inventoryItem.toString();
       System.out.println(inventoryInfo);
       
       // Fuel Class
    
       Fuel fuel = new Fuel();
       
       fuel.setTotal(500);
       String fuelInfo = fuel.toString();
       System.out.println(fuelInfo);
       
       // Mineral Class
       
       Minerals minerals = new Minerals();
       
       minerals.setName("iron");
       minerals.setPrice(100);
       minerals.setDescription("A pile of iron used to make parts for the ship");
       minerals.setType("metal");
       minerals.setSize(50);
       minerals.setWeight(200);
       
       String mineralInfo = minerals.toString();
       System.out.println(mineralInfo);
       
       // Item Synthesizer Class
       
       ItemSynthesizer synthesizer = new ItemSynthesizer();
       
       synthesizer.setEfficiency(20);
       synthesizer.setListItems("List of Items");
       synthesizer.setStateOfRepair("This item has 80% left");
       
       String synthesizerInfo = synthesizer.toString();
       System.out.println(synthesizerInfo);
       
       // Parts Class
       
       Parts parts = new Parts();
       parts.setApplication("Repairs the Ship");
       parts.setPercentRepaired(20);
       
       String partsInfo = parts.toString();
       System.out.println(partsInfo);
       
       // Synthesized Items Class
       
       SynthesizedItems synthesized = new SynthesizedItems();
       synthesized.setWeight(200);
       
       String synthesizedInfo = synthesized.toString();
       System.out.println(synthesizedInfo);
       
       // Food Class
       
       Food food = new Food();
       food.setTotal(100);
       
       String foodInfo = food.toString();
       System.out.println(foodInfo);
       
       // Medicine Class
       
       Medicine medicine = new Medicine();
       medicine.setApplication("Heals the Character a certain percent");
       medicine.setEffectiveness(10);
       
       String medicineInfo = medicine.toString();
       System.out.println(medicineInfo);
       
       // Character Class
       
       GameCharacter character = new GameCharacter();
       character.setDescription("A super awesome dude!");
       character.setHealth(200);
       
       String characterInfo = character.toString();
       System.out.println(characterInfo);
       
       // Alien Objects Class
       
       AlienObjects alienObject = new AlienObjects();
       
       alienObject.setAmountResearched(40);
       alienObject.setDescription("Stuff and things");
       alienObject.setDistanceToUranus(57);
       alienObject.setResearchScenarios("Things and such?");
       alienObject.setSpeed(47000);
       
       String objectInfo = alienObject.toString();
       System.out.println(objectInfo);
       
       // Game Class
       
       Game game = new Game();
       
       game.setCrewName("AwesomeSauce7");
       game.setCurrentScore(700000000);
       game.setGameDate(57);
       game.setNoPeople(7);
       game.setTotalTime(17);
       
       String gameInfo = game.toString();
       System.out.println(gameInfo);
       
       // Harvesting Fuel class
       
       HarvestingFuel fuelHarvest = new HarvestingFuel();
       
       fuelHarvest.setAmountAvailable(200);
       fuelHarvest.setDescription("More things and Stuff");
       fuelHarvest.setFoodUsed(100);
       fuelHarvest.setFuelUsed(100);
       fuelHarvest.setIsBlocked(true);
       fuelHarvest.setResourceType(2);
       fuelHarvest.setTravelTime(3);
       
       String fuelHarvestInfo = fuelHarvest.toString();
       System.out.println(fuelHarvestInfo);
       
       // Illness Class 
       
       Illness illness = new Illness();
       illness.setSeverity(5);
       illness.setType(5);
       
       String illnessInfo = illness.toString();
       System.out.println(illnessInfo);
       
       // Location Class
       
       Location location = new Location();
       
       location.setAmountRemaining(7);
       location.setVisited(1, true);
       
       String locInfo = location.toString();
       System.out.println(locInfo);
       
       // Map Class
       
       Map map = new Map();
       
       String mapInfo = map.toString();
       System.out.println(mapInfo);
       
       // Random Encounter Scene Type
       
       RandomEncounterSceneType randEncSceneType = new RandomEncounterSceneType();
       
       String randEncSceneTypeInfo = randEncSceneType.toString();
       System.out.println(randEncSceneTypeInfo);
       
       // Regular Scene Type
       
       RegularSceneType regSceneType = new RegularSceneType();
       
       String regSceneTypeInfo = regSceneType.toString();
       System.out.println(regSceneTypeInfo);
       
       // Research Event Class
       
       ResearchEvent resEvent = new ResearchEvent();
       
       String resEventInfo = resEvent.toString();
       System.out.println(resEventInfo);
       
       // Scientist Specialization Class
       
       ScientistSpecialization sciSpec = new ScientistSpecialization();
       
       String sciSpecInfo = sciSpec.toString();
       System.out.println(sciSpecInfo);
       
       // Ship Class
       
       Ship ship = new Ship();
       
       String shipInfo = ship.toString();
       System.out.println(shipInfo);
       
       // Engine Class
       
       Engine engine = new Engine();
 
       engine.setFuelConsumption(34);
       engine.setMaxSpeed(800);
       engine.setWeight(74);
       
       ship.setEngine(engine);
       ship.setDescription("Big");
       ship.setLength(70000000);
       
       String engineInfo = engine.toString();
       System.out.println(engineInfo);
       
    */
    



