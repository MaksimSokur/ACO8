package com.company.OOP.week3.company;

/**
 * Created by User on 03.10.2015.
 */
public class Coder extends Employee{
    private String language;

    public Coder(){
        language = "Java";
    }

    private void testAccessToParent(){
        setAge(23);
        getName();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String toString(){

        return getName();
    }

    public void writeCode(){

    }
}
