package com.example.deepcopy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SorterTest {

    Sorter sorter;

    @Before
    public void init(){
        sorter = new Sorter();
    }

    @Test
    public void testSort() {

        List<Person> pl = new ArrayList<>();
        pl.add(new Person("Tinu, 20"));
        pl.add(new Person("James, 21"));
        pl.add(new Person("Karan, 22"));
        List<Person> nl = sorter.sort(pl);
        Assert.assertEquals("James", nl.get(0).getName());;

    }
}
