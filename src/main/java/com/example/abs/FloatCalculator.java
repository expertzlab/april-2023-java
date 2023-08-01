package com.example.abs;

public class FloatCalculator implements BaseCalculator {
    
    float a;
    float b;

    public FloatCalculator(float x, float y){
        a = x;
        b = y;
    }

    public Object sum(){
        return Float.valueOf(a+b);
    }

    public Object difference(){
        return a - b;
    }
}
