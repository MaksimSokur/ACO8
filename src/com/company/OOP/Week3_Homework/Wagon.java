package com.company.OOP.Week3_Homework;

import java.util.ArrayList;

/**
 * Created by User on 04.10.2015.
 */
public class Wagon {
    private final int number;
    ArrayList<Place> places;

    public Wagon(int number) {
        this.number = number;
    }

    public void useWagon(Place place){

    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "number=" + number +
                ", places=" + places +
                '}';
    }
}
