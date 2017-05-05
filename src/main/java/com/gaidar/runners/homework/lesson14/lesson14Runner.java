package com.gaidar.runners.homework.lesson14;

import com.gaidar.app.homework.lesson14.Camomile;
import com.gaidar.app.homework.lesson14.Daisy;
import com.gaidar.app.homework.lesson14.Flower;
import com.gaidar.app.homework.lesson14.Rose;

import java.util.Scanner;

import java.util.ArrayList;


/**
 * Created by Nata on 5/3/2017.
 */
public class lesson14Runner {
    public static void main(String[] args) {
        int camomilePrise = 1;
        int rosePrise = 2;
        int daisyPrise = 3;
        ArrayList<Flower> flowers = new ArrayList<Flower>();
        System.out.println("Flowers prises: camomile - "+ camomilePrise+"$; rose - "+rosePrise+"$; daisy - "+daisyPrise+"$.");
        System.out.println("Select flowers for the bouquet:");
        System.out.println("To add camomile: press 'c'; to add rose press 'r'; to add daisy press 'd'';to exit press 'q':");
        while (true){
            Scanner in = new Scanner(System.in);

            String flower = in.nextLine();

            switch (flower){
                case "c":
                case "C": {
                    Flower camomile = new Camomile();
                    camomile.setPrise(camomilePrise);
                    flowers.add(camomile);
                }
                break;
                case "d":
                case "D": {
                    Flower daisy = new Daisy();
                    daisy.setPrise(daisyPrise);
                    flowers.add(daisy);
                }
                break;
                case "r":
                case "R": {
                    Flower rose = new Rose();
                    rose.setPrise(rosePrise);
                    flowers.add(rose);
                }
                break;
                case "q":
                case "Q":
                    System.out.println("CONGRATULATIONS!! The prise of your bouquet is: " + countPrise(flowers) + "$");
                    return;
            }

        }
    }
    public static int countPrise(ArrayList<Flower> flowers){
        int prise = 0;
        for (Flower flower:flowers) {
            prise += flower.getPrise();
        }
        return prise;
    }
}
