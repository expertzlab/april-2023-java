package com.example.abs;

public class MainCalc {

    public static void main(String[] args) {
        BaseCalculator bc = new FloatCalculator(20, 30);
        System.out.println("Diff: "+ bc.difference());
        System.out.println("Sum: "+ bc.sum());
        bc = new IntCalculator(20, 30);
    
        System.out.println("Diff: "+ bc.difference());
        System.out.println("Sum: "+ bc.sum());
    }
    
}
