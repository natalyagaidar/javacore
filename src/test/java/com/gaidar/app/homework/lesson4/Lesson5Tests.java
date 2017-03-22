package com.gaidar.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nata on 3/22/2017.
 */
public class Lesson5Tests {

    @Test
    public void calculateCircleArea1Test(){
        double radius = 100.3;
        double expected = 31604.7;
        double actual = CircleArea.calculateArea(radius);

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void calculateCircleAreaZeroTest(){
        double radius = 0;
        double expected = 0;
        double actual = CircleArea.calculateArea(radius);

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void calculateCircleAreaSmallNumbersTest(){
        double radius = 0.09;
        double expected = 0.025;
        double actual = CircleArea.calculateArea(radius);

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void calculateCircleAreaReallyBigNumbersTest(){
        double radius = 1.74e35;
        double expected = 9.511485918008457E70;
        double actual = CircleArea.calculateArea(radius);

        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void evenNumbersDetectorTest(){
        int number = 86420;
        boolean actual = OddOrEven.numberCheck(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void evenZeroNumbersDetectorTest(){
        int number = 0;
        boolean actual = OddOrEven.numberCheck(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void oddNumbersDetectorTest(){
        int number = 2087654321;
        boolean actual = OddOrEven.numberCheck(number);
        Assert.assertFalse(actual);
    }

    @Test
    public void detectSquareTriangleTest(){
        double a1 = 100;
        double a2 = 100;
        double a3 = 141.42135623730950488016887242097;
        boolean actual = TriangleDetector.detectTriangle(a1,a2,a3);
        Assert.assertTrue(actual);
    }

    @Test
    public void detectSquareTriangle3Test(){
        double a1 = 4;
        double a2 = 5;
        double a3 = 3;
        boolean actual = TriangleDetector.detectTriangle(a1,a2,a3);
        Assert.assertTrue(actual);
    }


    @Test
    public void detectSquareTriangle4Test(){
        double a1 = 1.1;
        double a2 = 2.1;
        double a3 = 2;
        boolean actual = TriangleDetector.detectTriangle(a1,a2,a3);
        Assert.assertFalse(actual);
    }

    @Test
    public void detectSquareTriangle5Test(){
        double a1 = 100;
        double a2 = 200;
        double a3 = 100;
        boolean actual = TriangleDetector.detectTriangle(a1,a2,a3);
        Assert.assertFalse(actual);
    }


}
