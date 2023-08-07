package com.example.abs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainCalc {

    public static void main(String[] args){
        try{

        BaseCalculator bc = new FloatCalculator(20, 30);
        System.out.println("Diff: "+ bc.difference());
        System.out.println("Sum: "+ bc.sum());
        bc = new IntCalculator(20, 30);
    
        System.out.println("Diff: "+ bc.difference());
        System.out.println("Sum: "+ bc.sum());
        }catch(IOException io){
            
        }
    }
    
}
