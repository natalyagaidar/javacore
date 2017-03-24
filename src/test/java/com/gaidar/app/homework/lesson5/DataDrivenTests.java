package com.gaidar.app.homework.lesson5;

import com.gaidar.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Nata on 3/24/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataDrivenTests {
    @Test
    @FileParameters(value = "src/test/resources/multiply.csv", mapper = CsvWithHeaderMapper.class)
    public void dataDrivenMultiplyTest(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFuncHome.multiply(argA, argB));
    }

    @Test
    @FileParameters(value = "src/test/resources/power.csv", mapper = CsvWithHeaderMapper.class)
    public void dataDrivenPowerTest(double argA, int argB, double expOut) {
        Assert.assertEquals(expOut, Math.pow(argA, argB), 2);
    }

    @Test
    @FileParameters(value = "src/test/resources/circle.csv", mapper = CsvWithHeaderMapper.class)
    public void dataDrivenCircleAreaTest(double area, double expOut) {
        Assert.assertEquals(expOut, CircleAreaHome.calculateArea(area), 2);
    }

    @Test
    @FileParameters(value = "src/test/resources/odds.csv", mapper = CsvWithHeaderMapper.class)
    public void dataDrivenCircleAreaTest(int number, boolean expOut) {
        Assert.assertEquals(expOut, OddOrEvenHome.numberCheck(number));
    }

}
