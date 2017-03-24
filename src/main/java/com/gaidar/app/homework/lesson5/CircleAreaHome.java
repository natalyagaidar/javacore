package com.gaidar.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by Nata on 3/19/2017.
 */
public class CircleAreaHome {
    public static final double PI = 3.1415926535897932384626433832795d;
    public static double calculateArea(double radius) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter circle radius:");
        //double radius = scanner.nextDouble();
        double circleArea = Math.pow(radius, 2) * PI;
        return circleArea;
    }

    public static void calculateBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 radiuses to calculate which is bigger:");
        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double area1 = CircleAreaHome.calculateArea(radius1);
        double area2 = CircleAreaHome.calculateArea(radius2);
        if(area1 > area2)
            System.out.println("Area1 " + area1 +" is bigger");
        else if (area2>area1)
            System.out.println("Area2 " +area2 +" is bigger");
        else System.out.println("Area1 and Area2 are equal: " + area1 + " = " +area2);
    }
}
