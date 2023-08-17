package com.example.creation;

import com.example.animal.Animal;
import com.example.animal.Cat;
import com.example.animal.Dog;

public class CrUse {

    public static void main(String[] args) {
        Cr cr = new Cr();
        M m = cr.mymethod(new M3Factory());
        m.callme();

    }
    
}
