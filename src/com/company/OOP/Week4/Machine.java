package com.company.OOP.Week4;

/**
 * Created by User on 10.10.2015.
 */
public abstract class Machine {
    private final int speed;
    private final int weight;
    private final String model;



    public Machine(int speed, int weight, String model) {
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public abstract void go();
}
