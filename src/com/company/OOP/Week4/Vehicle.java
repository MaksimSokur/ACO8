package com.company.OOP.Week4;

/**
 * Created by User on 10.10.2015.
 */
public class Vehicle extends Machine{
    public String type;

    public Vehicle(int speed, int weight, String model) {
        super(speed, weight, model);
    }

    @Override
    public void go() {
        System.out.println("Car go method");
    }
}
