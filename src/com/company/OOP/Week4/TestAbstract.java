package com.company.OOP.Week4;

/**
 * Created by User on 10.10.2015.
 */
public class TestAbstract {
    public static void main(String[] args) {
        Machine machine = new Airplane();
        machine.go();
        Machine auto = new Vehicle(200, 1800, "Opel");
        auto.go();
    }
}
