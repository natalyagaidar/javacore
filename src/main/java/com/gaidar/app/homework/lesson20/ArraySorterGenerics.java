package com.gaidar.app.homework.lesson20;

import java.math.BigDecimal;

/**
 * Created by Nata on 6/2/2017.
 */
public class ArraySorterGenerics<T extends Number>  {
    T[] array;


    public ArraySorterGenerics(T[] unsortedArray) {
        this.array = unsortedArray;
    }

    public void sort(){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                //if (array[i].toString().compareTo(array[i + 1].toString()) > 0) {
                if(array[i].floatValue() > array[i+1].floatValue()){
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
            }
            }
        }
    }

    public T[] getArray(){
        return this.array;
    }
}
