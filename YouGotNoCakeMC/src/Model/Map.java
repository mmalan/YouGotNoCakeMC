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
    private int currentRow;
    private int currentColumn;

    public static Map createMap() {
    
        String locations[][] = {
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
        int i, j;
        
        for (i=0; i < 9; i++) {
            for (j=0; j < 3; j++)
              System.out.print(locations[i][j] + " ");
            System.out.println();
        }
        
        return null;
    }
    
    public Map(){
        noOfRows = 0;
        noOfColumns = 0;
        locations = null;
        currentRow = 0;
        currentColumn = 0;
    }
    
    public Map(int noOfRows, int noOfColumns){
        remakeMap(noOfRows, noOfColumns);
        currentRow = 0;
        currentColumn = 0;
    }
    
    public void setCurrentPosition(int currentRow, int currentColumn) {
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        if(locations[currentRow][currentColumn] != null){
            locations[currentRow][currentColumn].setVisited(true);
        }
    }
    
    public Location findLocationByLetter(char l){
        for(int r = 0; r < noOfRows; r++){
            for(int c =0; c < noOfColumns; c++){
                if(locations[r][c] != null){
                    if(locations[r][c].getLetter() == l){
                       return locations[r][c]; 
                    }
                }
            }
        }
        
        return null;
    }
    
    public Location findLocationByDescription(String d){
        for(int r = 0; r < noOfRows; r++){
            for(int c =0; c < noOfColumns; c++){
                if(locations[r][c] != null){
                    if(locations[r][c].getDescription().matches(d)){
                       return locations[r][c]; 
                    }
                }
            }
        }
        
        return null;
    } 

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        setCurrentPosition(currentRow, this.currentColumn);
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        setCurrentPosition(this.currentRow, currentColumn);
    }
    
    public void remakeMap(int noOfRows, int noOfColumns){
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for location objects
        this.locations = new Location[noOfRows][noOfColumns];
    }
           
    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
       remakeMap(noOfRows, this.noOfColumns);
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        remakeMap(this.noOfRows, noOfColumns);
    }
    
    public Location getLocationAt(int row, int column){
        return locations[row][column];
    }
    
    public void setLocationAt(Location l, int row, int column){
        locations[row][column] = l;
    }
    
    public void addLocation(Location l){
        locations[l.getRow()][l.getColumn()] = l;
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
