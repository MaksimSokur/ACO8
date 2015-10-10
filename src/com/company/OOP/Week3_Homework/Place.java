package com.company.OOP.Week3_Homework;

import java.util.Arrays;

/**
 * Created by User on 05.10.2015.
 */
public class Place{
    private final int PLACES_IN_LUX = 20;
    private final int PLACES_IN_PLACKARD = 200;
    private final int PLACES_IN_COUPE = 50;
    private final int PLACES_OUT_BACK = 80;

    private int arrOfPlacesLux[] = new int[PLACES_IN_LUX];
    private int arrOfPlacesPlackard[] = new int[PLACES_IN_PLACKARD];
    private int arrOfPlacesInCoupe[] = new int[PLACES_IN_COUPE];
    private int arrOfPlacesOutBack[] = new int[PLACES_OUT_BACK];

    public Place(int[] arrOfPlacesLux, int[] arrOfPlacesPlackard, int[] arrOfPlacesInCoupe, int[] arrOfPlacesOutBack) {
        this.arrOfPlacesLux = arrOfPlacesLux;
        this.arrOfPlacesPlackard = arrOfPlacesPlackard;
        this.arrOfPlacesInCoupe = arrOfPlacesInCoupe;
        this.arrOfPlacesOutBack = arrOfPlacesOutBack;
    }

    public int[] getArrOfPlacesOutBack() {
        return arrOfPlacesOutBack;
    }

    public void setArrOfPlacesOutBack(int[] arrOfPlacesOutBack) {
        this.arrOfPlacesOutBack = arrOfPlacesOutBack;
    }

    public int[] getArrOfPlacesInCoupe() {
        return arrOfPlacesInCoupe;
    }

    public void setArrOfPlacesInCoupe(int[] arrOfPlacesInCoupe) {
        this.arrOfPlacesInCoupe = arrOfPlacesInCoupe;
    }

    public int[] getArrOfPlacesPlackard() {
        return arrOfPlacesPlackard;
    }

    public void setArrOfPlacesPlackard(int[] arrOfPlacesPlackard) {
        this.arrOfPlacesPlackard = arrOfPlacesPlackard;
    }

    public int[] getArrOfPlacesLux() {
        return arrOfPlacesLux;
    }

    @Override
    public String toString() {
        return "Place{" +
                "arrOfPlacesLux=" + Arrays.toString(arrOfPlacesLux) +
                ", arrOfPlacesPlackard=" + Arrays.toString(arrOfPlacesPlackard) +
                ", arrOfPlacesInCoupe=" + Arrays.toString(arrOfPlacesInCoupe) +
                ", arrOfPlacesOutBack=" + Arrays.toString(arrOfPlacesOutBack) +
                '}';
    }

    public void setArrOfPlacesLux(int[] arrOfPlacesLux) {
        this.arrOfPlacesLux = arrOfPlacesLux;


    }
}
