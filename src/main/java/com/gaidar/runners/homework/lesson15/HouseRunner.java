package com.gaidar.runners.homework.lesson15;

import com.gaidar.app.homework.lesson15.Flat;
import com.gaidar.app.homework.lesson15.House;
import com.gaidar.app.homework.lesson15.PieceOfInterior;
import java.util.ArrayList;

/**
 * Created by Nata on 5/23/2017.
 */
public class HouseRunner {
    public static void main(String[] args) {
       Flat flat1 = new Flat(1,2, 61, 600000 );
        Flat flat2 = new Flat(2,3, 80, 750000 );
        Flat flat3 = new Flat(3,4, 100, 900000 );

        PieceOfInterior chair1 = new PieceOfInterior("Chair", 200);
        PieceOfInterior chair2 = new PieceOfInterior("Chair", 210);
        PieceOfInterior table1 = new PieceOfInterior("Table", 300);
        PieceOfInterior table2 = new PieceOfInterior("Table", 310);
        PieceOfInterior tvset1 = new PieceOfInterior("TVset", 500);
        PieceOfInterior tvset2 = new PieceOfInterior("TVset", 550);

        flat1.addFurniture(chair1);
        flat1.addFurniture(tvset1);

        flat2.addFurniture(chair2);
        flat2.addFurniture(table1);

        flat3.addFurniture(table2);
        flat3.addFurniture(tvset2);

        ArrayList<Flat> flats = new ArrayList<Flat>(){{
            add(flat1);
            add(flat2);
            add(flat3);
        }};

        House house1 = new House("Bakynska 37D", flats);

        house1.getFlatsInfo();

    }




}
