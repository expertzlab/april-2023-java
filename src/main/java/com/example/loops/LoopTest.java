package com.example.loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopTest {
    
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
      
        //byte, short, character, int, float, double
        //Byte, Short, Character...

        for(int i =0; i < 10 ; i++){
            al.add(i);
        }
       
        for(Object o: al){
            
            if(! (((Integer)o).intValue() %2 == 0)){
                continue;
            }
            System.out.println(o);
        }
                   
    }
}
