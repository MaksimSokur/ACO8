package com.company.OOP.Week2_homework.student;

/**
 * Created by User on 29.09.2015.
 */
public class CreateStudent{
    private int maxObjects = 0;
    private String name;
    private String addres;
    private Object[] objects = new Object[10];

    public CreateStudent(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public CreateStudent(Object[] objects, String addres, String name) {
        this.objects = objects;
        this.addres = addres;
        this.name = name;
    }

    public void learn(Object object){
        int hours = 0;
        while (object.getHoursWorksWithStudent() < object.getHoursInSemestr()) {
            System.out.println("Go to school!!");
            hours = object.getHoursWorksWithStudent();
            hours++;

        }
    }

    public boolean addObject(Object object){
        if(maxObjects >= objects.length){
            return false;
        }
            objects[maxObjects] = object;
            maxObjects++;
            return true;
    }
    public Object deleteLastObject(){
        if(maxObjects == 0){
            return null;
        }
        maxObjects--;
        Object finishedObject = objects[maxObjects];
        objects[maxObjects] = null;
        return finishedObject;
    }

    public void showAllObjects(){
        for (int i = 0; i < maxObjects; i++){
            Object curent = objects[i];
            curent.showInformationAboutObject();
        }
    }
    public boolean toPassAnExam (){
        for(int i = 0; i < objects.length; i++) {
            if (objects[i].getDegreeStudent()< 64) {
                return false;
            }

        }
        return true;
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
    public String showStudent(){
        return String.format("Name: %s, Adress: %s", name, addres);
    }

}
