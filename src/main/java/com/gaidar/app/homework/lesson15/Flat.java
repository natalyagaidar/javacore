package com.gaidar.app.homework.lesson15;

import java.util.ArrayList;
/**
 * Created by Nata on 5/21/2017.
 */
public class Flat {
    int flatNumber;
    int numberOfRooms;
    int flatArea;
    int flatPrise;
    public ArrayList<PieceOfInterior> interierItems;

    public Flat(int flatNumber, int numberOfRooms, int flatArea, int flatPrise){
        this.flatNumber = flatNumber;
        this.numberOfRooms = numberOfRooms;
        this.flatArea = flatArea;
        this.flatPrise = flatPrise;
        interierItems = new ArrayList<>();
    }

    public Flat(){

    }

    public void addFurniture(PieceOfInterior interierItem){

            this.interierItems.add(interierItem);
        System.out.println("New furniture is bought: " + interierItem.getName() + " with prise " + interierItem.getPrise() + " UAH for the flat number " + this.flatNumber);

    }


    public void setFlatArea(int flatArea) {
        this.flatArea = flatArea;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setFlatPrise(int flatPrise) {
        this.flatPrise = flatPrise;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFlatArea() {
        return flatArea;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public int getFlatPrise() {
        return flatPrise;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void printInterierItems(){
        System.out.println("The flat #" + this.flatNumber + " has the furniture:");
        for (PieceOfInterior item: interierItems) {
            System.out.println(item.getName());


        }
    }

}
