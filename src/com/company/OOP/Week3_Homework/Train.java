package com.company.OOP.Week3_Homework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by User on 04.10.2015.
 */
public class Train{
    private final String wayAtMove;
    private int averangeSpeed;
    private int distance;
    private final int HAVE_WAGON;
    private GregorianCalendar dataOfOut;
    private ArrayList<Wagon> wagons = new ArrayList<>();
    private ArrayList<RailStation> stations = new ArrayList<>();

    public Train(String wayAtMove, int HAVE_WAGON, int averangeSpeed, int distance, GregorianCalendar dataOfOut) {
        this.wayAtMove = wayAtMove;
        this.HAVE_WAGON = HAVE_WAGON;
        this.averangeSpeed = averangeSpeed;
        this.distance = distance;
        this.dataOfOut = dataOfOut;
    }

  //  public String addStation(RailStation station){
    //    if()
      //  return String.format()
   // }

    public boolean addWagon(Wagon wagon){
       if (HAVE_WAGON >= wagons.size()) {
           return false;
       }
        wagons.add(wagon);
        return true;
    }

    @Override
    public String toString() {
        return "Train{" +
                "wayAtMove='" + wayAtMove + '\'' +
                ", averangeSpeed=" + averangeSpeed +
                ", distance=" + distance +
                ", HAVE_WAGON=" + HAVE_WAGON +
                ", dataOfOut YEAR=" + dataOfOut.get(Calendar.YEAR)+
                ", MONTH = " + dataOfOut.get(Calendar.MONTH)+
                ", DAY = " + dataOfOut.get(Calendar.DAY_OF_MONTH)+
                ", HOUR=" + dataOfOut.get(Calendar.HOUR_OF_DAY)+
                ", MINUTES = " + dataOfOut.get(Calendar.MINUTE)+
                '}';
    }

    public String getWayAtMove() {
        return wayAtMove;
    }

    public int getAverangeSpeed() {
        return averangeSpeed;
    }

    public void setAverangeSpeed(int averangeSpeed) {
        this.averangeSpeed = averangeSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public void setStations(ArrayList<RailStation> stations) {
        this.stations = stations;
    }

    public int getHAVE_WAGON() {

        return HAVE_WAGON;
    }

    public ArrayList<RailStation> getStations() {
        return stations;
    }

}
