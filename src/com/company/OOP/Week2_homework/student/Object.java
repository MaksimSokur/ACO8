package com.company.OOP.Week2_homework.student;

import java.util.Scanner;

/**
 * Created by User on 29.09.2015.
 */
public class Object {
    private String nameObject;
    private int hoursInSemester;
    private int hoursWorksWithStudent;
    private int degreeStudent;

    public Object(String nameObject, int degreeStudent, int hoursWorksWithStudent, int hoursInSemestr) {
        this.nameObject = nameObject;
        this.degreeStudent = degreeStudent;
        this.hoursWorksWithStudent = hoursWorksWithStudent;
        this.hoursInSemester = hoursInSemestr;
    }

    public void showObjectMenu(){
        int choise = -1;
        Scanner scanner = new Scanner(System.in);
        while (choise != 4){
            choise = scanner.nextInt();
            if(choise == 1){
                toPassAnExam();
            }else if(choise == 2){
                showInformationAboutObject();
            }else if(choise == 3){
                takeTheValue(nameObject);
            }
        }
    }
    public boolean toPassAnExam (){
        if(degreeStudent < 64){
            return false;
        }
        return true;
    }
    public void showInformationAboutObject(){
        System.out.printf("Name of Object: %s, amount of hours: %d", nameObject, hoursWorksWithStudent);
    }
    public void takeTheValue(String nameObject){
        System.out.printf("Value of student: %s = %d", nameObject, degreeStudent );
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public int getDegreeStudent() {
        return degreeStudent;
    }

    public void setDegreeStudent(int degreeStudent) {
        this.degreeStudent = degreeStudent;
    }

    public int getHoursWorksWithStudent() {
        return hoursWorksWithStudent;
    }

    public void setHoursWorksWithStudent(int hoursWorksWithStudent) {
        this.hoursWorksWithStudent = hoursWorksWithStudent;
    }

    public int getHoursInSemestr() {
        return hoursInSemester;
    }

    public void setHoursInSemestr(int hoursInSemestr) {
        this.hoursInSemester = hoursInSemestr;
    }
}
