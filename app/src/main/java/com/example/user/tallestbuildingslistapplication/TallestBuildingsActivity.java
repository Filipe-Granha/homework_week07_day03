package com.example.user.tallestbuildingslistapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TallestBuildingsActivity extends AppCompatActivity {


    Button detailsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildings_list);

        TallestBuildings tallestBuildings = new TallestBuildings();
        ArrayList<Building> list = tallestBuildings.getList();

        TallestBuildingsAdapter buildingAdapter = new TallestBuildingsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(buildingAdapter);

        Log.d(getClass().toString(), "onCreate called");

        detailsButton = (Button) findViewById(R.id.detailsButton);
    }


    public void getBuilding(View listItem) {
        Building building = (Building) listItem.getTag();
        Log.d("Building Name: ", building.getName());
    }




    public void onDetailsButtonClicked(View button) {
        Log.d(getClass().toString(), "onDetailsButtonClicked was called");
        Intent intent = new Intent(this, BuildingActivity.class);
        startActivity(intent);
    }
}