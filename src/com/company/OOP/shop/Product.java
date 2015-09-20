package com.company.OOP.shop;

/**
 * Created by User on 20.09.2015.
 */
public class Product {
    int id;
    String name;
    double Price;

    public String asString(){

        return "id " + id + " name" + name + " Price" + Price;
    };
    public void  init(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.Price = price;
    }
}

