package com.example.creation;

public class Cr {

    public M mymethod(MFactory mf){
          
        M m = mf.getInstance();
        return m;
    }
}
