package com.gaidar.app.homework.lesson12;

/**
 * Created by Nata on 4/22/2017.
 */
public class WhiteCollar extends Human {
    private String company;

    public WhiteCollar(String name, int age, String company){
        super(name, age);
        this.company = company;
    }

    public void setCompany(String company){
        if(company.matches("^[a-zA-Z,-, ]+$"))
        this.company = company;
        else System.out.println("Company name is invalid");
    }

    public String getCompany(){
        return company;
    }
}
