package com.example.arrlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.deepcopy.Person;

public class ArrayListTest {

    

    public static void main(String[] args) {
        List marL = new ArrayList<Integer>(200);

        marL.add(Integer.valueOf(2));
        marL.add(10);
        marL.add(100);

        marL.remove(2);
        System.out.println(marL);

    }
}
