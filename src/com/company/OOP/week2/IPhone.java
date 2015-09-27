package com.company.OOP.week2;

/**
 * Created by User on 26.09.2015.
 */
public class IPhone {
    public static String CEO = "Stive Jobs";

    private String version;
    private double pontRate;
    private String color;
    private  double size;

    public IPhone(){
        System.out.println("Defoult name");
    }

    public IPhone(String version, double pontRate, String color, double size) {
        this.version = version;
        this.pontRate = pontRate;
        this.color = color;
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPontRate() {
        return pontRate;
    }

    public void setPontRate(double pontRate) {
        this.pontRate = pontRate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public IPhone(String version){

    }

    public static void CEO() {

        System.out.println(CEO);
    }
}
