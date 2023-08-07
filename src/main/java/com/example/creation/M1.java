package com.example.creation;

public class M1 extends M {

    public void callme(){
        System.out.println("Inside callme M1");
    }

    public static M1 getInstance(){
        return new M1();
    }
}
