package com.gaidar.runners.homework.lesson20;

import com.gaidar.app.homework.lesson20.ArraySorterGenerics;

/**
 * Created by Nata on 6/6/2017.
 */
public class ArraySorterGenericRunner {

    public static void main(String[] args) {
    Integer[] intArray = {4, -1, 5, 100, -999, 0};
        ArraySorterGenerics<Integer> integerArraySorterGenerics = new ArraySorterGenerics<>(intArray);
        integerArraySorterGenerics.sort();
        System.out.println("----Array of Integers----");
        for (int i=0; i <integerArraySorterGenerics.getArray().length-1; i++){
            System.out.println(integerArraySorterGenerics.getArray()[i]);
        }

        Double[] doubleArray = {4.0, -1.0, 5.1, 100.9, -999.7, 0.1, -0.1};
        ArraySorterGenerics<Double> doubleArraySorterGenerics = new ArraySorterGenerics<>(doubleArray);
        doubleArraySorterGenerics.sort();
        System.out.println("----Array of Doubles----");
        for (int i=0; i <doubleArraySorterGenerics.getArray().length-1; i++){
            System.out.println(doubleArraySorterGenerics.getArray()[i]);
        }

        Float[] floatArray = {4.0005f, -1.01f, 4.0005f, 100.999f, -999.78f, 0.1003f, -0.1004f, -999.781f};
        ArraySorterGenerics<Float> floatArraySorterGenerics = new ArraySorterGenerics<>(floatArray);
        floatArraySorterGenerics.sort();
        System.out.println("----Array of Floats----");
        for (int i=0; i <floatArraySorterGenerics.getArray().length-1; i++){
            System.out.println(floatArraySorterGenerics.getArray()[i]);
        }


    }
}