package com.gaidar.app.classwork.lesson5;

import com.gaidar.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Nata on 3/21/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    }


    @Test
    @FileParameters(value = "src/test/resources/testdata1.csv", mapper = CsvWithHeaderMapper.class)
    public void testMathPower(double number, int power, double expected){
        Assert.assertEquals(expected , Math.pow(number, power), 2);
    }

}
