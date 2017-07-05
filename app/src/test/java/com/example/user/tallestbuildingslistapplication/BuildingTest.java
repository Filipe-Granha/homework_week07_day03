package com.example.user.tallestbuildingslistapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class BuildingTest {

    Building building;

    @Before
    public void before() {
        building = new Building(1, "Burj Khalifa", 828, 2010);
    }



    @Test
    public void getRankingTest() {
        assertEquals(1, building.getRanking());
    }



    @Test
    public void getNameTest() {
        assertEquals("Burj Khalifa", building.getName());
    }

    @Test
    public void getHeightInMetersTest() {
        assertEquals(828, building.getHeightInMeters());
    }


    @Test
    public void getInaugurationYearTest() {
        assertEquals(2010, building.getInaugurationYear());
    }



}
