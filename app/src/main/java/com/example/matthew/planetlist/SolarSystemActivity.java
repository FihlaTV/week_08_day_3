package com.example.matthew.planetlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SolarSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planet_list);

        SolarSystem solarSystem = new SolarSystem();
        ArrayList<Planet> list = solarSystem.getList();

        SolarSystemAdapter solarSystemAdapter = new SolarSystemAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.listID);
        listView.setAdapter(solarSystemAdapter);
    }


}
