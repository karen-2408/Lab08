package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {

    private final List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        if (city == null) {
            throw new IllegalArgumentException("city is null");
        }
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not in list");
        }
    }

    public int countCities() {
        return cities.size();
    }


    public List<City> getCities() {
        return new ArrayList<>(cities);
    }
}