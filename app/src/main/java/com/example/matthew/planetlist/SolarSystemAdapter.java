package com.example.matthew.planetlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SolarSystemAdapter extends ArrayAdapter<Planet> {


    public SolarSystemAdapter(Context context, ArrayList<Planet> planets){
        super(context, 0, planets);
    }


    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.planet_name, parent, false);
        }

        Planet currentPlanet = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.textView);
        textView.setText(currentPlanet.getName().toString());

        return listItemView;
    }





}
