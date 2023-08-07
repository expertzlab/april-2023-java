package com.example.creation;

public class M2 extends M {

    public void callme(){
        System.out.println("Inside callme M2");
    }

    public static M1 getInstance(){
        return new M1();
    }
}