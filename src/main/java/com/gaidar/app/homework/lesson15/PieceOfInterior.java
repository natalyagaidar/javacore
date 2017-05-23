package com.gaidar.app.homework.lesson15;

/**
 * Created by Nata on 5/21/2017.
 */
public class PieceOfInterior {
    String name;
    int prise;

    public PieceOfInterior(String name, int prise){
        this.name = name;
        this.prise = prise;
    }

    public PieceOfInterior(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getPrise() {
        return prise;
    }

    public String getName() {
        return name;
    }
}
