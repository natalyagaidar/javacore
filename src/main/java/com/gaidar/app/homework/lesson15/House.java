package com.gaidar.app.homework.lesson15;

import java.util.ArrayList;
/**
 * Created by Nata on 5/21/2017.
 */
public class House {
    String address;
    public ArrayList<Flat> flats;

    public House(String address, ArrayList<Flat> flats){
        this.address = address;
        this.flats = new ArrayList<>();
       this.flats.addAll(flats);
    }
    public  void getFlatsInfo(){
        for (Flat flat: flats) {
            System.out.println("Flat #"+flat.getFlatNumber() + "; costs "+flat.getFlatPrise() + " UAH; numer of rooms: " + flat.getNumberOfRooms());
            flat.printInterierItems();
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


}
