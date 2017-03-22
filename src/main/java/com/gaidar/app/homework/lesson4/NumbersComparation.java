package com.gaidar.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Nata on 3/19/2017.
 */
public class NumbersComparation {
    public static void numberComparation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 DOUBLE numbers to compare:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        if(number1 > number2)
            System.out.println("Number1 is bigger");
        else if (number2>number1)
            System.out.println("Number2 is bigger");
        else System.out.println("Number1 and Number2 are equal");
    }

}
