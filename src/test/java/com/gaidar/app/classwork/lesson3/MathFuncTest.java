package com.gaidar.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Nata on 3/15/2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1;
        int b = 2;

        MathFunc mathFunc = new MathFunc();
        int expectedResult = 200;
        int actualResult = mathFunc.multiply(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addTest(){
        int a = 599;
        int b = -500;
        MathFunc mathFunc = new MathFunc();
        int expectedResult = 99;
        int actualResult = mathFunc.add(a,b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest(){
        int a = 5;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        double expectedResult = 2.5;
        double actualResult = mathFunc.divide(a,b);
        Assert.assertEquals(expectedResult, actualResult, 2);
    }
}

