package com.gaidar.app.homework.lesson6;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nata on 3/25/2017.
 */
public class ArraysHome {
    public void taskA(){
        System.out.println("---------- Task A ----------");
        int[] arrayA = new int[10];
        int arraySize =0;
        for(int i = 2; i <= 20; i+=2){
            if(i%2 == 0){
                arrayA[arraySize] = i;
                arraySize++;
            }
        }
        for (int j = 0; j< arrayA.length; j++){
            System.out.print(arrayA[j] + " ");
            if(j == arrayA.length-1) System.out.println();
        }
        for (int j = 0; j< arrayA.length; j++){
            System.out.println(arrayA[j]);
        }
    }
    public void taskB() {
        System.out.println("---------- Task B ----------");
        int[] arrayB = new int[50];
        int arraySize =0;
        for(int i = 0; i <= 99; i++){
            if(i%2 == 1){
                arrayB[arraySize] = i;
                arraySize++;
            }
        }
        for (int j = 0; j< arrayB.length; j++){
            System.out.print(arrayB[j] + " ");
            if(j == arrayB.length-1) System.out.println();
        }

        for (int j = arrayB.length-1; j>= 0; j--){
            System.out.print(arrayB[j] + " ");
        }
    }

    public void taskC() {
        System.out.println("---------- Task C ----------");
        int[] arrayC = new int[15];
        Random rndNumbers = new Random();
        int evensCont =0;
        for(int i=0; i< arrayC.length; i++){

            arrayC[i] = Math.abs(rndNumbers.nextInt()%10);
            System.out.println(i + "th element is: " + arrayC[i]);
            if(arrayC[i]%2 == 0) evensCont++;
        }
        System.out.println("Total of even numbers: " + evensCont);
    }

    public void taskD() {
        System.out.println("---------- Task D ----------");
        int[] arrayC = new int[15];
        Random rndNumbers = new Random();
        int minimum =999;
        int maximum = 0;
        for(int i=0; i< arrayC.length; i++){

            arrayC[i] = Math.abs(rndNumbers.nextInt()%1000);
            System.out.println(i + "th element is: " + arrayC[i]);
            if(arrayC[i]< minimum) minimum = arrayC[i];
            if(arrayC[i]> maximum) maximum = arrayC[i];
        }
        System.out.println("MIN number: " + minimum + "; MAX number: " + maximum);
    }

    public void taskH(){
        Scanner scanner1 = new Scanner(System.in);
        int summ = 0;

        System.out.println("Enter numbers you want to add separated by ENTER. To finish input enter 'exit':");
        String input = scanner1.nextLine();
        while(!input.equals("exit")){
            summ += Integer.parseInt(input);
            input = scanner1.nextLine();
        }
        System.out.println("Summa is: " + summ);
    }

}
