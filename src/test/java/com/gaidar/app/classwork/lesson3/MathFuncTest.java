package com.gaidar.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nata on 3/15/2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTestPositiveNumbers() {
        int a = 1;
        int b = 2;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = 2;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiplyTestNegativeNumbers() {
        int a = -11;
        int b = -21;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = 231;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiplyTestPositiveNegativeNumbers() {
        int a = -11;
        int b = 37;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = -407;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiplyTestWithZero() {
        int a = 999;
        int b = 0;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = 0;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyTestMinimumNegative() {
        int a = Integer.MIN_VALUE;
        int b = 1;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = Integer.MIN_VALUE;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyTestMaximumPositive() {
        int a = Integer.MAX_VALUE;
        int b = 1;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = Integer.MAX_VALUE;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addTestPositiveNumbers(){
        int a = 399;
        int b = 200;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = 599;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void addTestNegativeNumbers(){
        int a = -599;
        int b = -500;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = -1099;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void addTestPositiveAndNegativeNumbers(){
        int a = 599;
        int b = -500;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = 99;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void addTestWithZero(){
        int a = 0;
        int b = -500;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = -500;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addTestMinimumValue(){
        int a = Integer.MIN_VALUE;
        int b = 0;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = Integer.MIN_VALUE;;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void addTestMaximumValue(){
        int a = Integer.MAX_VALUE;
        int b = 0;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = Integer.MAX_VALUE;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void divideTestPositiveNumbers(){
        int a = 5;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = 2.5;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divideTestNegativeNumbers(){
        int a = -105;
        int b = -5;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = 21;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divideTestPositiveAndPositiveNumbers(){
        int a = -501;
        int b = 4;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = -125.25;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divideTestByZero(){
        int a = 500;
        int b = 0;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = Double.MIN_VALUE;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divideTestMinimumPositiveNumbers(){
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = 1;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void divideTestMaximumPositive(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = 1;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public  void absTestNegativeNumber(){
        double a = -9876.54;
        double expectedResult = 9876.54;
        double actualResult = Math.abs(a);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public  void absTestPositiveNumber(){
        double a = 345678.90;
        double expectedResult = 345678.90;
        double actualResult = Math.abs(a);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }
}

