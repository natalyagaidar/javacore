package com.gaidar.app.homework.lesson12;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

/**
 * Created by Nata on 4/22/2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        if((age>0) && (age < 120)){
            this.age = age;
            System.out.println("New age setted");
        }
        else System.out.println("Invalid age");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
