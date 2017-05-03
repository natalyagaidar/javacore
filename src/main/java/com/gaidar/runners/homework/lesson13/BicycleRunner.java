package com.gaidar.runners.homework.lesson13;

import com.gaidar.app.homework.lesson13.Bicycle;
import com.gaidar.app.homework.lesson13.BicycleWithRing;
import com.gaidar.app.homework.lesson13.CustomBicycle;

/**
 * Created by Nata on 4/30/2017.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRing bike1 = new BicycleWithRing();
        bike1.ring();

        CustomBicycle bike2 = new CustomBicycle();
        bike2.setGear(23);
        bike2.ride();
    }

}
