package com.company.OOP.Week3_Homework;


import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by User on 05.10.2015.
 */
public class TestTrain {
    public static void main(String[] args) {
        //Place place = new Place();
        Wagon wagon = new Wagon(1);
        Train train = new Train("Kiev", 20, 120, 300,new GregorianCalendar(2015,10,7,15,30) );
        //Ticket ticket = new Ticket("Kiev", 120, 500, 20,new GregorianCalendar(2015,10,7,15,30), 100000001, place.setArrOfPlacesInCoupe(), 250.30);

       // System.out.println(place.toString());
        System.out.println(wagon.toString());
        System.out.println(train);
        RailStation Kiev = new RailStation("Kyiv", new Date(2015), new Date(10), new Date(2015));

        Kiev.addTrainInStation(train);
        Kiev.showAllAtCurentStation();
    }
}
