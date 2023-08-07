package com.example.loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopTest {
    
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
      

        for(int i =0; i < 10 ; i++){
            al.add(i);
        }
       
        Object[] outa =  al.stream().filter( x ->  x % 2 == 0 ).toArray();

        for(Object o: outa){
            System.out.println(o);
        }
                   
    }
}
