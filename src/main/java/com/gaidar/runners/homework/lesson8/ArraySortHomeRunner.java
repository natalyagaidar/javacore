package com.gaidar.runners.homework.lesson8;

import com.gaidar.app.homework.lesson8.ArrayPrint;
import com.gaidar.app.homework.lesson8.ArraySelectionSort;
import com.gaidar.app.homework.lesson8.ArraySortHome;
import com.gaidar.app.homework.lesson8.MaximumInMatrix;

import java.util.Random;

/**
 * Created by Nata on 3/31/2017.
 */
public class ArraySortHomeRunner {
    public static void main(String[] args) {
        //Task A -- Bubble sort DESC and ASC
        System.out.println("-----Task A------");
        int[] arrayToSort = {100, 9, -9, 201, 15, -9999, 0, -9999, 201, 7349, -827};
        ArraySortHome arraySortHome = new ArraySortHome();
        arraySortHome.arrayBubbleSortAccending(arrayToSort);
        ArrayPrint arrayPrint = new ArrayPrint();
        System.out.println("Array is sorted (using Bubble method) ACCENDING");
        arrayPrint.arrayPrint(arrayToSort);

        arraySortHome.arrayBubbleSortDescending(arrayToSort);
        System.out.println("\nArray is sorted (using Bubble method) DESCENDING");
        arrayPrint.arrayPrint(arrayToSort);
        System.out.println();

// Task B - Selective Sort
        System.out.println("------Task B------");
        int[] arrayToSelectiveSort = {-555, 999, 8, -43, 21, 0, -555};
        ArraySelectionSort arraySelectionSort = new ArraySelectionSort();
        arraySelectionSort.arraySelectionSort(arrayToSelectiveSort);
        System.out.println("Array is sorted using Selective Sort algorithm:");
        arrayPrint.arrayPrint(arrayToSelectiveSort);

//Task C - matrix
        System.out.println();
        System.out.println("------Task C------");

        int[][] myMatrix = new int[4][3];
        for (int i= 0; i< myMatrix.length; i++){
            for (int j = 0; j< myMatrix[i].length; j++){
                myMatrix[i][j] = randomFill();
            }
        }
        MaximumInMatrix maximumInMatrix = new MaximumInMatrix();
        maximumInMatrix.matrixPrint(myMatrix);
        System.out.println("Maximum number in Matrix: " + maximumInMatrix.maximumInMatrix(myMatrix));

    }

    //Generates Random numbers in diapason [-99, 99]
    public static int randomFill(){

        Random rand = new Random();
        int randomNum = rand.nextInt()%100;
        return randomNum;
    }


}
