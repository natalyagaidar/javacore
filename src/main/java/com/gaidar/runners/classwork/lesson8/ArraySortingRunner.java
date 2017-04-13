package com.gaidar.runners.classwork.lesson8;

import com.gaidar.app.classwork.lesson8.ArraysSorting;

/**
 * Created by Nata on 3/31/2017.
 */
public class ArraySortingRunner {
    public static void main(String[] args) {
        int[] unsortedArray = {100, 9 , 77, 0, 11, -11};
        System.out.println("BEFORE");
        for (int i=0; i< unsortedArray.length;i++){
            System.out.print(unsortedArray[i] + " ");
        }
        ArraysSorting sort = new ArraysSorting();
        sort.arrayBubbleSort(unsortedArray);
        System.out.println();
        System.out.println("AFTER");
        for (int i=0; i< unsortedArray.length;i++){
            System.out.print(unsortedArray[i] + " ");
        }

    }
}
