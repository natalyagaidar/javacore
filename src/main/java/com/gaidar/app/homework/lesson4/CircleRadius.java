package com.gaidar.app.homework.lesson4;

import java.util.Scanner;

/**
 * Created by Nata on 3/19/2017.
 */
public class CircleRadius {
    public static final double PI = 3.14d;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius:");
        double radius = scanner.nextDouble();
        double circleArea = PI*radius*radius;
        System.out.println("Area is " + circleArea);
    }
}
