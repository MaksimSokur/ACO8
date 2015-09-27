package com.company.OOP.week2.Day2.model;

/**
 * Created by User on 27.09.2015.
 */
public class Dog {
    private String name;
    private int age;

    private Address home;

    private Human owner;

    public Dog(String name, int age, Human owner) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, Human owner, Address home) {

        this.name = name;
        this.age = age;
        this.owner = owner;
        this.home = home;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
