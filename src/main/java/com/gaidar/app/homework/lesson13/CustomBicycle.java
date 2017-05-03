package com.gaidar.app.homework.lesson13;

/**
 * Created by Nata on 4/30/2017.
 */
public class CustomBicycle extends Bicycle {
    private int speed;
    private int gear;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(gear);
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Wshhhh");
    }
}
