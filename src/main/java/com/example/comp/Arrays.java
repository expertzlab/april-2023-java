package com.example.comp;

public class Arrays {

    static int[] ar1 = new int[10];
    public static void main(String[] args) {
        int[] ar2 = ar1;
        for(int i = 0; i< 10; i++){
            ar2[i] = i;
        }
        for(int i = 0; i< 10; i++){
           System.out.println(ar1[i]); 
        }
        
    }
    
}
