package com.company.OOP.week3.day2;

/**
 * Created by User on 04.10.2015.
 */
public class NuclearPlant {
    private String name;
    private final int criticalTemperature = 1000;
    private final int power = 100000;
    private int requiredPower;

    @Override
    public String toString() {
        return "NuclearPlant{" +
                "name='" + name + '\'' +
                ", criticalTemperature=" + criticalTemperature +
                ", power=" + power +
                ", requiredPower=" + requiredPower +
                '}';
    }

    public NuclearPlant(String name) {
        this.name = name;

    }

    public int getCriticalTemperature() {
        return criticalTemperature;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getRequiredPower() {
        return requiredPower;
    }

    public boolean start(int curentTemperature, int power){
        if(curentTemperature >= criticalTemperature){
            System.err.println("Can not start!");
        }
        if(power < requiredPower){
            System.err.println("Not enough power");
            return false;
        }
        System.out.println("Start nuclean plant");
        return true;
    }
}
