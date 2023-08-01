package com.example.deepcopy;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sorter {

    public List<Person> sort(List<Person> lp){
        SortedMap map = new TreeMap<>();

        for(int i=0; i< lp.size(); i++){
            map.put(lp.get(i).getName(), lp.get(i));
        }
        List<Person> nList = new ArrayList<>();
        nList.addAll(map.values());
        return nList;
    }
}
