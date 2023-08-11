package com.example.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.example.deepcopy.Person;

public class Hashm {

    public static void main(String[] args) {
        Map m = new Hashtable<>();
        m.put("n1", new Person("n1", 20, null));
        m.put("n8", new Person("n8", 20, null));
        m.put("n5", new Person("n5", 20, null));
        m.put("n3", new Person("n3", 20, null));

        Set eset = m.entrySet();
        for(Object e: eset){
            System.out.println(((Entry)e).getKey()+ " " + ((Entry)e).getValue());
        }
    }
    
}

class PersonComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).getName().compareTo(((Person)o2).getName());
        
    }

}