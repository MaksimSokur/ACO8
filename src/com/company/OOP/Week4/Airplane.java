package com.company.OOP.Week4;

import com.company.OOP.week2.Day2.model.Human;

/**
 * Created by User on 10.10.2015.
 */
public class Airplane extends Machine {
    private String type;
    private Human pilot;

    public Airplane(){
        super(1500, 500000, "AN-140");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void go(){
        System.out.println("Airplane " + toString() + " is flying");

    };
}
