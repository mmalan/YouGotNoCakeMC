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
    private String currentLocation;
    private Location[][] locations;

    public Map(){
        
        currentLocation = "Home";
        this.noOfRows = 9;
        this.noOfColumns = 3;
        String locationNames[][] = {
            {"Garage", "Manhole", "Library"},
            {"Back_Yard", "Treehouse", "Skate_Park"},
            {"Front_Yard", "Outhouse", "Dark_Alley"},
            {"Barbershop", "Playground", "Dollar_Theater"},
            {"Soviet_Bakeshop", "School", "Motel_6"},
            {"Albertsons", "Florist", "Police Station"},
            {"Dr_Root_Dentist", "Grandmas", "BYU-I_Lab"},
            {"Creepy_Guy_House", "Friends", "Legend..."},
            {"Gas Station", "Museum", "X=Visited"}
        };
        // create 2-D array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                //create and initalize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                location.setName(locationNames[row][column]);
                
                //assign the location object to the current position in array
                locations[row][column] = location;
            }
        }
    }
    
    public Location getLocation(int row, int column) {
        return this.locations[row][column];
    }
           
    public int getNoOfRows() {
        return this.noOfRows;
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

    
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
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
