package com.example.abs;

public class IntCalculator implements BaseCalculator {
    int a;
    int b;

    public IntCalculator(int x, int y){
        a = x;
        b = y;
    }

    public Object sum(){
        return Integer.valueOf( a+b);
    }

    public Object difference(){
        return a - b;
    }
}
