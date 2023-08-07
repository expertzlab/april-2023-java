package com.example.abs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FloatCalculator implements BaseCalculator {
    
    float a;
    float b;

    public FloatCalculator(float x, float y){
        a = x;
        b = y;
    }

    public B sum() throws FileNotFoundException {
        return new B();
    }


    public Object difference(){
        return a - b;
    }
}
