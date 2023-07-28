package com.example.arrlist;

import java.util.HashMap;
import java.util.Map;

import com.example.deepcopy.Person;

public class MapTest {

    public static void main(String[] args) {
        Map m1 = new HashMap<String, Person>();
        m1.put("1", new Person("nidhu", 22, new String[] {"add1", "add2"}));
        m1.put("2", new Person("eswar", 23, new String[] {"add3", "add4"}));
    
        System.out.println(m1.get("1"));

    }
    
}
