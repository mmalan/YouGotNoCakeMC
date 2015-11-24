/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Clayton
 */
public class Map implements Serializable{
     //class instance vaiables
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public static Map createMap() {
    
        //create the map
        Map map = new Map(5, 5);
        
        //create the scenes for the game
        //Scene[] scenes = createScenes();
        
        //assign scenes to locations
        //GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public Map(){
    }
    
    public Map(int noOfRows, int noOfColumns){
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                //create and initalize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the location object to the current position in array
                locations[row][column] = location;
            }
        }
    }
           
    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public String toString() {
        return "MapView{" + "rowCount=" + noOfRows + ", columnCount=" + noOfColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.noOfRows);
        hash = 97 * hash + Objects.hashCode(this.noOfColumns);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.noOfRows, other.noOfRows)) {
            return false;
        }
        if (!Objects.equals(this.noOfColumns, other.noOfColumns)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
