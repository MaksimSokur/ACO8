package com.company.OOP.Week3_Homework;

import javax.xml.crypto.Data;
import java.util.GregorianCalendar;

/**
 * Created by User on 04.10.2015.
 */
public class Ticket extends Train{
    protected double price;
    protected final int id;
    protected final Place place;

    public Ticket(String wayAtMove, int HAVE_WAGON, int averangeSpeed, int distance, GregorianCalendar dataOfOut, int id, Place place, double price) {
        super(wayAtMove, HAVE_WAGON, averangeSpeed, distance, dataOfOut);
        this.id = id;
        this.place = place;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", id=" + id +
                ", place=" + place +
                '}';
    }
}
