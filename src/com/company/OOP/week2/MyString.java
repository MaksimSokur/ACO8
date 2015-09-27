package com.company.OOP.week2;

/**
 * Created by User on 26.09.2015.
 */
public class MyString {
    private char [] mas;

    public MyString(){

    }
    public MyString(char[] mas) {
        this.mas = mas;
    }
    public MyString(String str){
        mas = str.toCharArray();
    }
    public String asString(){
        return  new String(mas);
    }
}
