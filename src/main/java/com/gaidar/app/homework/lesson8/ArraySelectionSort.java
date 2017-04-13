package com.gaidar.app.homework.lesson8;

/**
 * Created by Nata on 3/31/2017.
 */
public class ArraySelectionSort {
    public int[] arraySelectionSort(int[] arrayToSort){
        int i, j, firstElement, tempElement;
        for (i =0; i< arrayToSort.length-1; i++){
            firstElement = i;
            for(j = i+1; j< arrayToSort.length; j++){
                if(arrayToSort[j] < arrayToSort[firstElement])
                    firstElement = j;
            }
            if(firstElement != i) {
                tempElement = arrayToSort[firstElement];
                arrayToSort[firstElement] = arrayToSort[i];
                arrayToSort[i] = tempElement;
            }

        }
        return arrayToSort;
    }
}
