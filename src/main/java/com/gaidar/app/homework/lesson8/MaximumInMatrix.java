package com.gaidar.app.homework.lesson8;

/**
 * Created by Nata on 4/13/2017.
 */
public class MaximumInMatrix {
    //Method which prints the matrix
    public void matrixPrint(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Method which finds the maximum number in the matrix
    public int maximumInMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maximum < matrix[i][j]) maximum = matrix[i][j];
            }

        }
        return maximum;
    }
}
