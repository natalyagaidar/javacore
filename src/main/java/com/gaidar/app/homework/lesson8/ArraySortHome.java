package com.gaidar.app.homework.lesson8;

/**
 * Created by Nata on 3/31/2017.
 */
public class ArraySortHome {
    public void arrayBubbleSortAccending(int[] unsortedArray) {
        for (int j = 0; j < unsortedArray.length; j++) {
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                }
            }

        }
    }

    public void arrayBubbleSortDescending(int[] unsortedArray) {
        for (int j = 0; j < unsortedArray.length; j++) {
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                }
            }

        }
    }

}
