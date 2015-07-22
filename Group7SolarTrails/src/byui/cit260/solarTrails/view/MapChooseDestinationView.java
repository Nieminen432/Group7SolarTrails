/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;
import group7solartrails.Group7SolarTrails;
import static group7solartrails.Group7SolarTrails.location;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.abs;

/**
 *
 * @author Hiatt-Adam
 */
public class MapChooseDestinationView extends View{

    public MapChooseDestinationView() {
             super("\n-------------------------------"
                + "\n  Select your next destination."
                + "\n--------------------------------"
                + "\n1 - Mercury"
                + "\n2 - Venus"
                + "\n3 - Earth"
                + "\n4 - Mars"
                + "\n5 - Jupiter"
                + "\n6 - Saturn"
                + "\n7 - Uranus"
                + "\n8 - Neptune"
                + "\n9 - Pluto"
                + "\nC - Current Location"
                + "\nD - Previous Menu"
                + "\n-----------------------------------");
    }
    public double distance = 0;
    public double travelTime = 0;
    
    @Override
    // choose a map destination
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case '1': // Choose Mercury
                this.chooseMercury();
                break;
            case '2': // Choose Venus
                this.chooseVenus();
                break;
            case '3': // Choose Earth
                this.chooseEarth();
                break;
            case '4': // Choose Mars
                this.chooseMars();
                break;
            case '5': // Choose Jupiter
                this.chooseJupiter();
                break;
            case '6': // Choose Saturn
                this.chooseSaturn();
                break;
            case '7': // Choose Uranus
                this.chooseUranus();
                break;
            case '8': // Choose Neptune
                this.chooseNeptune();
                break;
            case '9': // Choose Pluto
                this.choosePluto();
                break;
            case 'C': // Current Location
                this.chooseCurrentLocation();
                break;
            case 'D': // Leave Object
                this.choosePreviousMenu();
                break;
            default:
                try {
                this.console.println("\n*** Invalid selection *** "
                                   + "\nPrease enter to try again");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        } catch (IOException e) {
        e.printStackTrace();
        }
                try {
            if (location.getCurrentLocation() == location.getDestinationLocation()) {
                        this.console.println("\n*** Invalid selection *** "
                                            + "\nPress enter to try again");
                    }
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        } return false;
    }

    private void chooseMercury() {
        // set destination to Mercury
        try {
             
        Location location = new Location();
        location.setDestinationLocation(0);
        location.setDestLocation("Mecury");
        Group7SolarTrails.setLocation(location);
                
        
            distance = abs(Map.PlanetDist.Mercury - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseVenus() {
        // set destination to Venus
        try {
            
        Location location = new Location();
        location.setDestinationLocation(1);
        location.setDestLocation("Venus");
        Group7SolarTrails.setLocation(location);
        
        
            distance = abs(Map.PlanetDist.Venus - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseEarth() {
        // set destination to Earth
        try {
            
        Location location = new Location();
        location.setDestinationLocation(2);
        location.setDestLocation("Earth");
        Group7SolarTrails.setLocation(location);
        
            
                
            distance = abs(Map.PlanetDist.Earth - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseMars() {
        // set destination to Mars
        try {
           
        Location location = new Location();
        location.setDestinationLocation(3);
        location.setDestLocation("Mars");
        Group7SolarTrails.setLocation(location);
        
            
                
            distance = abs(Map.PlanetDist.Mars - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseJupiter() {
        // set destination to Jupiter
        try {
           
        Location location = new Location();
        location.setDestinationLocation(4);
        location.setDestLocation("Jupiter");
        Group7SolarTrails.setLocation(location);
        
            
                
            distance = abs(Map.PlanetDist.Jupiter - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseSaturn() {
        // set destination to Saturn
        try {
            
        Location location = new Location();
        location.setDestinationLocation(5);
        location.setDestLocation("Saturn");
        Group7SolarTrails.setLocation(location);
        
            
                
            distance = abs(Map.PlanetDist.Saturn - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseUranus() {
        // set destination to Uranus
        try {
            
        Location location = new Location();
        location.setDestinationLocation(6);
        location.setDestLocation("Uranus");
        Group7SolarTrails.setLocation(location);
  
            distance = abs(Map.PlanetDist.Uranus - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseNeptune() {
        // set destination to Neptune
        try {
            
        Location location = new Location();
        location.setDestinationLocation(7);
        location.setDestLocation("Neptune");
        Group7SolarTrails.setLocation(location);

            distance = abs(Map.PlanetDist.Neptune - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void choosePluto() {
        // set destination to Pluto
        try {
            
        Location location = new Location();
        location.setDestinationLocation(8);
        location.setDestLocation("Pluto");
        Group7SolarTrails.setLocation(location);

            distance = abs(Map.PlanetDist.Pluto - Group7SolarTrails.getLocation().getCurrentLocation());
            travelTime = ((distance/Group7SolarTrails.getEngine().getMaxSpeed())/24);
        
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
            "Something went wrong selecting a destination");
        } finally {  
            try {
                this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
                this.console.println("Your next destination is " + Group7SolarTrails.getLocation().getDestLocation());
                this.console.println("This is a distance of " + distance + " meridian.");
                this.console.println("This trip will take approximately " + travelTime + " days");
                this.console.println("Press Enter to continue.");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void chooseCurrentLocation() {
        // View Current Location
        try {
        this.console.println("Your current location is " + Group7SolarTrails.getLocation().getCurrentLoc());
        this.console.println("---- Press Enter to Continue ----");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                MapChooseDestinationView mapDestView = new MapChooseDestinationView();
                mapDestView.display();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private void choosePreviousMenu() {
        // Previous Menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
    
    
    
    
}
