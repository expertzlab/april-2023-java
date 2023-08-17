package com.example.absfact;

//FactoryMethod Pattern Demo
public class FMDemo {

    public static void operation(ChairFactory cf) {
        Chair c1 =  cf.getInstanceChair();
        c1.sit();
        
    }
    
}