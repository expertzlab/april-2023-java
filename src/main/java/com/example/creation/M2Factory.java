package com.example.creation;

public class M2Factory implements MFactory {

    public M getInstance(String type){
        return new M2();
    }
    
}
