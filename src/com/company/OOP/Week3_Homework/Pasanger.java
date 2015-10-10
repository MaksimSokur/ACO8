package com.company.OOP.Week3_Homework;

import com.company.OOP.week2.Day2.model.Address;
import com.company.OOP.week2.Day2.model.Human;

/**
 * Created by User on 04.10.2015.
 */
public class Pasanger extends Human{
    private double haveMoney;

    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public Pasanger(String name, int age, String phone, Address address) {
        super(name, age, phone, address);
    }
}
