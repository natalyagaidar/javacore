package com.gaidar.runners.homework.lesson12;

import com.gaidar.app.homework.lesson12.WhiteCollar;

/**
 * Created by Nata on 4/22/2017.
 */
public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whiteCollar1 = new WhiteCollar("Lyosha", 23, "Google Inc.");

        System.out.println("Name: " + whiteCollar1.getName() + " Age: " + whiteCollar1.getAge() + " Company: "
                + whiteCollar1.getCompany());

        WhiteCollar whiteCollar2 = new WhiteCollar("not specified", 1, "not specified");
        whiteCollar2.setAge(11);
        whiteCollar2.setCompany("Google Inc.");

        System.out.println("Name: " + whiteCollar2.getName() + " Age: " + whiteCollar2.getAge() + " Company: "
                + whiteCollar2.getCompany());

    }


}
