/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import byui.cit260.solarTrails.control.*;

/**
 *
 * @author Joseph
 */
public class Location implements Serializable{
    private int location = 0;
    private boolean[] visited = new boolean[9];
    private Scene scene;

    public Location() {
        
    }

    public boolean getVisited(int index) {
        return visited[index];
    }

    public void setVisited(int index, boolean visited) {
        this.visited[index] = visited;
    }

    public void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
