package com.example.user.tallestbuildingslistapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TallestBuildingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildings_list);

        TallestBuildings tallestBuildings = new TallestBuildings();
        ArrayList<Building> list = tallestBuildings.getList();

        TallestBuildingsAdapter buildingAdapter = new TallestBuildingsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(buildingAdapter);
    }


    public void getBuilding(View listItem) {
        Building building = (Building) listItem.getTag();
        Log.d("Building Name: ", building.getName());
    }
}
