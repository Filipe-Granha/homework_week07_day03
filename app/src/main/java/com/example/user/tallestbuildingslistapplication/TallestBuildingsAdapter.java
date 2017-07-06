package com.example.user.tallestbuildingslistapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 06/07/2017.
 */

public class TallestBuildingsAdapter extends ArrayAdapter<Building> {

    public TallestBuildingsAdapter(Context context, ArrayList<Building> buildings) {
        super(context, 0, buildings);
    }



    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.buildings_item, parent, false);
        }

        Building currentBuilding = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBuilding.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentBuilding.getName().toString());

        TextView height = (TextView) listItemView.findViewById(R.id.height);
        height.setText("Height: " + currentBuilding.getHeightInMeters().toString() + "m");

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText("Year of inauguration: " + currentBuilding.getInaugurationYear().toString());



        return listItemView;
    }
}
