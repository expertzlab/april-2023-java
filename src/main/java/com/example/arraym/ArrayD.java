package com.example.arraym;

import java.util.Arrays;
import java.util.Scanner;

import com.example.deepcopy.Person;

public class ArrayD {

    public static void main(String[] args) {
        Person[] pa1 = new Person[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i< pa1.length; i++){
            pa1[i] = new Person();
            //1, 1; 2,2;....
            System.out.printf("Enter {%d} name:",i);
            pa1[i].setName( sc.nextLine());
            System.out.printf("Enter {%d} Age:",i);
            pa1[i].setAge( Integer.valueOf(sc.nextLine()));
        }
        //Person[] pa2 = new Person[5];
        //System.arraycopy(pa1, 0, pa2, 0, 5);
        Person[] pa2 = Arrays.copyOf(pa1, 5, Person[].class);
        //copyArray(pa1, pa2);
        pa1[3].setName("Hello");

        for(Person p : pa2){
            System.out.println(p);
        }
    
    }

    public static void copyArray(Person[] p1, Person[] p2){
        int i = 0;
        for(Person p : p1){
            p2[i++] = new Person(p);
        }
    }
    
}
