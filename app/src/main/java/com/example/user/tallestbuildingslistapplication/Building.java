package com.example.user.tallestbuildingslistapplication;

/**
 * Created by user on 05/07/2017.
 */

public class Building {

    private int ranking;
    private String name;
    private int heightInMeters;
    private int inaugurationYear;


    public Building(int ranking, String name, int heightInMeters, int inaugurationYear) {
        this.ranking = ranking;
        this.name = name;
        this.heightInMeters = heightInMeters;
        this.inaugurationYear = inaugurationYear;
    }


    public int getRanking() {
        return ranking;
    }


    public String getName() {
        return name;
    }


    public int getHeightInMeters() {
        return heightInMeters;
    }


    public int getInaugurationYear() {
        return inaugurationYear;
    }


}
