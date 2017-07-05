package com.example.user.tallestbuildingslistapplication;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class TallestBuildingsTest {

    @Test
    public void getListTest() {
        TallestBuildings tallestBuildings = new TallestBuildings();
        assertEquals(10, tallestBuildings.getList().size());
    }
}
