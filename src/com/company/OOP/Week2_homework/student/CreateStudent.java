package com.company.OOP.Week2_homework.student;

/**
 * Created by User on 29.09.2015.
 */
public class CreateStudent{
    private String name;
    private String addres;
    private Object [] objects = new Object[10];

    CreateStudent curentStudent = new CreateStudent("Anton", "Kiev, Kreshatik");

    public CreateStudent(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public void studentLearn(){

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

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }
}
