package com.company.OOP.Week3_Homework;

import com.company.OOP.Array_Homework.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by User on 06.10.2015.
 */
public class RailStation {
    protected final int TRAINS_IN_STATION = 2;
    public String nameOfStation;
    private ArrayList <Train> trains;
    private Date trainOutPlatform;
    private Date trainInPlatform;
    private Date courentTime;

    public RailStation(String nameOfStation, Date trainOutPlatform, Date trainInPlatform, Date courentTime) {
        this.nameOfStation = nameOfStation;
        this.trainOutPlatform = trainOutPlatform;
        this.trainInPlatform = trainInPlatform;
        this.courentTime = courentTime;
    }

    public boolean addTrainInStation(Train train){
        if(TRAINS_IN_STATION <= trains.size()){
            return false;
        }
        trains.add(train);
        return true;
    }

    public String showAllAtCurentStation(){
        return String.format("%s",trains);
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public Date getTrainInPlatform() {
        return trainInPlatform;
    }

    public void setTrainInPlatform(Date trainInPlatform) {
        this.trainInPlatform = trainInPlatform;
    }

    public Date getTrainOutPlatform() {
        return trainOutPlatform;
    }

    public void setTrainOutPlatform(Date trainOutPlatform) {
        this.trainOutPlatform = trainOutPlatform;
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public Date getCourentTime() {
        return courentTime;
    }

    public void setCourentTime(Date courentTime) {
        this.courentTime = courentTime;
    }

    public int getTRAINS_IN_STATION() {
        return TRAINS_IN_STATION;
    }

    @Override
    public String toString() {
        return "RailStation{" +
                "nameOfStation='" + nameOfStation + '\'' +
                ", trains=" + trains +
                ", trainOutPlatform=" + trainOutPlatform +
                ", trainInPlatform=" + trainInPlatform +
                ", courentTime=" + courentTime +
                '}';
    }
}
