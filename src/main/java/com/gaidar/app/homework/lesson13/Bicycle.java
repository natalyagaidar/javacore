package com.gaidar.app.homework.lesson13;

/**
 * Created by Nata on 4/30/2017.
 */
public abstract class Bicycle {

    public void ride() {
        System.out.println("Wroom!");
    }

    abstract void setSpeed(int speed);

    abstract void setGear(int gear);
}
