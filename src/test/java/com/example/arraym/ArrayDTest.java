package com.example.arraym;

import org.junit.Test;

import com.example.deepcopy.Person;

public class ArrayDTest {

    @Test
    public void testCopyArray() {

        Person[] pa1 = new Person[3];
        Person[] pa2 = new Person[3];
        pa1[0]= new Person("a,1");
        pa1[1]= new Person("b,2");
        pa1[2]= new Person("c,3");
        ArrayD.copyArray(pa1, pa2);
        pa1[1].setName("Jack");

        for(Person p: pa2){
            System.out.println(p);
        }

        
    }
}
