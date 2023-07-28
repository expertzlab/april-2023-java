package com.example.comp;

final public class Arrayw {

    final int[] ar1;

    public Arrayw(){
        ar1 = new int[10];
        for(int i=0; i< 10; i++){
            ar1[i] = i;
        }
    }

    public void printArray(){
        for(int i=0; i< 10; i++){
            System.out.println(ar1[i]);
        }
    }
    
    public int[] getAr1() {
        int[] x = ar1.clone();
        
        return x;
    }

}
