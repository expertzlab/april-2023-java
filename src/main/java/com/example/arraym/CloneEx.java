package com.example.arraym;

import com.example.deepcopy.Person;

public class CloneEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        Person p1 = new Person("manoj", 22, null);
        
        Person p2 = (Person) p1.clone();

        p1.setAge(25);
        p1.setName("manoj1");

        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
    }
    
}
