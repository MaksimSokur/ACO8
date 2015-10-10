package com.company.OOP.Week3_Homework;

import com.company.OOP.week2.Day2.model.Address;
import com.company.OOP.week2.Day2.model.Human;

import java.util.ArrayList;

/**
 * Created by User on 04.10.2015.
 */
public class Seller extends Human{
    private ArrayList<Place> places = new ArrayList<>();
    private ArrayList<Wagon> wagons = new ArrayList<>();
    private ArrayList<Train> trains = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private double enoughtMoney;


    public Seller(String name, int age) {
        super(name, age);
    }

    Seller seller1 = new Seller("Kate", 30);


    @Override
    public String toString() {
        return "Seller{" +
                "places=" + places +
                ", wagons=" + wagons +
                ", trains=" + trains +
                ", tickets=" + tickets +
                ", seller1=" + seller1 +
                '}';
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
