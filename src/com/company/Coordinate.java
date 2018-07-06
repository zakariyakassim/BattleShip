package com.company;

import java.util.Random;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate getRandomCoordinates(int length){

        return new Coordinate(new Random().nextInt(length)+1, new Random(length).nextInt(length)+1);

    }

}
