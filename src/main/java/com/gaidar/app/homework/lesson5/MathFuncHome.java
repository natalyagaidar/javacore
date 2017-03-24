package com.gaidar.app.homework.lesson5;

/**
 * Created by Nata on 3/15/2017.
 */
public class MathFuncHome {
    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static int add(int a, int b){
        return a+b;
    }


    public static double divide(int a, int b){
        if (b ==0 ){
            System.out.println("Can not delete by zero");
            return Double.MIN_VALUE;
        }
        else return (double)(a/b);


    }
}
