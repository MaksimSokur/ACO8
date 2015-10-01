package com.company.OOP.Week2_homework.student;

import java.io.PrintStream;

/**
 * Created by User on 29.09.2015.
 */
public class CreateStudent{
    private String name;
    private String addres;
    public Object [] objects = new Object[10];


    public CreateStudent(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public void studentLearn(){
        for(int i = 0; i < objects.length; i++)
        objects[i].showInformationAboutObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public PrintStream showStudent(){
        return System.out.printf("Name: %s, Adress: %s", name, addres);
    }

}
