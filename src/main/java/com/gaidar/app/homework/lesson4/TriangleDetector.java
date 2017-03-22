package com.gaidar.app.homework.lesson4;

/**
 * Created by Nata on 3/19/2017.
 */
public class TriangleDetector {

    public static boolean detectTriangle(double sideA, double sideB, double sideC) {
        if ((Math.pow(sideA,2) == Math.pow(sideB, 2) + Math.pow(sideC, 2))
                || (Math.pow(sideB,2) == Math.pow(sideA,2) + Math.pow(sideC,2))
                || (Math.pow(sideC,2) == Math.pow(sideB,2) + Math.pow(sideA,2))) {
           return true;
        } else return false;

    }
}
