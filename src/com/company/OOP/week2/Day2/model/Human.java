package com.company.OOP.week2.Day2.model;

/**
 * Created by User on 27.09.2015.
 */
public class Human {
    private String Name;
    private int Age;
    private String Phone;

    public Human(String name, int age, String phone) {
        Name = name;
        Age = age;
        Phone = phone;
    }

    private Address address;

    public Human(String name, Address address, String phone, int age) {
        Name = name;
        this.address = address;
        Phone = phone;
        Age = age;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
