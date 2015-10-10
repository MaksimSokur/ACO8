package com.company.OOP.week3.company.day1;

/**
 * Created by User on 03.10.2015.
 */
public class Coder extends Employer {
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

    public Coder(String name, int age, double salary, String language) {
        super(name, age, salary);
        this.language = language;
    }

    public String toString(){


        return getName();
    }

    public void writeCode(){
        System.out.println("coder write code");
    }
}
