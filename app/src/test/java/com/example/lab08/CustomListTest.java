package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    void hasCity_returnsTrueWhenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    void hasCity_returnsFalseWhenAbsent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    void deleteCity_removesExistingCity() {
        CustomList list = new CustomList();
        City redDeer = new City("Red Deer", "AB");
        list.addCity(redDeer);

        list.deleteCity(redDeer);

        assertFalse(list.hasCity(redDeer));
        assertEquals(0, list.countCities());
    }

    @Test
    void deleteCity_throwsWhenMissing() {
        CustomList list = new CustomList();
        City lethbridge = new City("Lethbridge", "AB");

        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(lethbridge));
    }

    @Test
    void countCities_countsAddsAndDeletes() {
        CustomList list = new CustomList();
        City a = new City("Airdrie", "AB");
        City b = new City("Brooks", "AB");

        assertEquals(0, list.countCities());

        list.addCity(a);
        assertEquals(1, list.countCities());

        list.addCity(b);
        assertEquals(2, list.countCities());

        list.deleteCity(a);
        assertEquals(1, list.countCities());
    }
}