package com.example.matthew.planetlist;

import java.util.ArrayList;

public class SolarSystem {

    private ArrayList<Planet> list;

    public SolarSystem() {
        list = new ArrayList<Planet>();
        list.add(new Planet("Mercury"));
        list.add(new Planet("Venus"));
        list.add(new Planet("Earth"));
        list.add(new Planet("Mars"));
        list.add(new Planet("Jupiter"));
        list.add(new Planet("Saturn"));
        list.add(new Planet("Uranus"));
        list.add(new Planet("Neptune"));

    }

    public ArrayList<Planet> getList() {
        return new ArrayList<Planet>(list);
    }
}

