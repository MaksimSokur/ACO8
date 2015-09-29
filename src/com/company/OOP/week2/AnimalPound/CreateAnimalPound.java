package com.company.OOP.week2.AnimalPound;

/**
 * Created by User on 27.09.2015.
 */
public class CreateAnimalPound {
    public int freeCell = 0;
    public int cell = 0;
    private String address;
    private String time;
    private Annimal[] annimals = new Annimal[10];

    public CreateAnimalPound(String address, Annimal[] annimals, String time) {
        this.address = address;
        this.annimals = annimals;
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void addAminal(Annimal annimal) {
        if (freeCell == cell) {
            // annimal[freeCell] = Annimal;}
            freeCell++;
        }
    }
}