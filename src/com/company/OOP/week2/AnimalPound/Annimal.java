package com.company.OOP.week2.AnimalPound;

/**
 * Created by User on 27.09.2015.
 */
public class Annimal {
    private String name;
    private String type;
    private int age;
    private String color;
    public static int count = 0;

    public Annimal(String name, String type, int age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public Annimal(){
        count++;
    }
    {count++;}

    public static int count() {
        System.out.println("Created " + count++ + " pet(s)\n");
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
