package com.example.user.tallestbuildingslistapplication;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TallestBuildings {



    private ArrayList<Building> list;



    public TallestBuildings() {

        list = new ArrayList<Building>();

        list.add(new Building(1, "Burj Khalifa", 828, 2010));
        list.add(new Building(2, "Shanghai Tower", 632, 2016));
        list.add(new Building(3, "One World Trade Center", 541, 2014));
        list.add(new Building(4, "CTF Finance Centre", 530, 2016));
        list.add(new Building(5, "Shanghai World Financial Center", 492, 2008));
        list.add(new Building(6, "International Commerce Centre", 469, 2011));
        list.add(new Building(7, "Petronas Twin Towers I", 452, 1998));
        list.add(new Building(8, "Petronas Twin Towers II", 452, 1998));
        list.add(new Building(9, "Zifeng Tower", 450, 2010));
        list.add(new Building(10, "Taipei 101", 449, 2004));
    }




    public ArrayList<Building> getList() {
        return new ArrayList<Building>(list);
    }
}
