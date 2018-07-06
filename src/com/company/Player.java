package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    ArrayList<Coordinate> coordinates;

    private String name;

    public Player(){

        coordinates = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }


    public void addCoordinate(Coordinate coordinate){
        this.coordinates.add(coordinate);
    }

    public Coordinate getCoordinate(int position) {
        return coordinates.get(position);
    }

    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }
}
