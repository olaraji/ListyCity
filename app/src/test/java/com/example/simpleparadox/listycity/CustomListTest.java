package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City ("Edmonton","Alberta"));
        assertEquals(listSize + 1, list.getCount());

    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(listSize, list.getCount());
    }
    @Test
    public void getCountTest() {
        int listSize = list.countCities();
        City city = new City("Lethbridge","Alberta");
        list.addCity(city);
        list.countCities();
        assertEquals(listSize+1, list.countCities());
    }
    @Test
    public void hasCityTest() {
        int listSize = list.countCities();
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        list.hasCity(city);
        assertEquals(listSize+1, list.getCount());
        assertTrue(list.getCities().contains(city));
    }
}
