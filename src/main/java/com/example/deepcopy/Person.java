package com.example.deepcopy;

public class Person {
    
    String name;
    int age;
    String[] addr;

    public Person(String n, int a, String[] ar){
        name = n;
        age = a;
        addr = ar;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getAddr() {
        return addr;
    }

    public String toString(){
        return ""+age+", "+name+", "+ addr[0]+", "+ addr[1];
    }

}
