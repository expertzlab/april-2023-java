package com.example.map;

import java.util.Arrays;
import java.util.Comparator;

import com.example.deepcopy.Person;

public class Hashm {

    public static void main(String[] args) {

     long t1 = System.currentTimeMillis();

     Person[] pa = new Person[5];
     pa[0] = new Person("n1",20, null);
     pa[1] = new Person("n5", 22, null);
     pa[2] = new Person("n2", 22, null);
     pa[3] = new Person("n8", 22, null);
     pa[4] = new Person("n4", 22, null);

     Arrays.sort(pa, new PersonComparator() );

     for(Person p : pa){
        System.out.println(p);
     }
     long t2 = System.currentTimeMillis();
     System.out.println("time:"+ (t2-t1));
    }
    
}

class PersonComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).getName().compareTo(((Person)o2).getName());
        
    }

}