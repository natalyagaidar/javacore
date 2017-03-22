package com.gaidar.runners.homework;

import com.gaidar.app.classwork.lesson4.CircleArea;
import com.gaidar.app.homework.lesson4.NumbersComparation;
import com.gaidar.app.homework.lesson4.OddOrEven;
import com.gaidar.app.homework.lesson4.TriangleDetector;

import java.util.Scanner;

/**
 * Created by Nata on 3/19/2017.
 */
public class Lesson4Runners {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select what do you want to do:");
            System.out.println("1: Detect right-angled triangle");
            System.out.println("2: Compare two numbers");
            System.out.println("3: calculate circle area");
            System.out.println("4: detect odd or even numbers");
            System.out.println("Exit: Exit");

            String userInput = scanner.nextLine();

            switch (userInput){
                 case "1": {
                     Scanner scanner1 = new Scanner(System.in);
                     System.out.println("Enter 3 sides separated by ENTER:");
                     double sideA = scanner.nextDouble();
                     double sideB = scanner.nextDouble();
                     double sideC = scanner.nextDouble();
                     if (TriangleDetector.detectTriangle(sideA, sideB, sideC))
                         System.out.println("It is a correct triangle");
                     else System.out.println("It is not the needed triangle");
                 }
                break;
                case "2": {
                    NumbersComparation.numberComparation();
                }
                break;
                case "3": {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter radiuses of 2 circles separated by ENTER:");
                    double radius1 = scanner.nextDouble();
                    double radius2 = scanner.nextDouble();
                    CircleArea.calculateBigger(radius1, radius2);
                }
                break;
                case "4": {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    if(OddOrEven.numberCheck(number))
                        System.out.println("Number is even");
                    else System.out.println("The number is odd");

                }
                break;
                case "Exit":
                    System.out.println("Goodbye");
                    return;

                default:
                    System.out.println("Incorrect option is selected, please pick one of the list");
            }
        }
    }
}
