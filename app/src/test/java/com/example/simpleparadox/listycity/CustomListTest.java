package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    void testHasCity() {
        int listSize = list.getCount();
        assertEquals(1, list.getCount());
        City city = new City("Calgary", "Alberta");
        list.hasCity(city);
        assertEquals(listSize+1, list.getCount());
    }
}
