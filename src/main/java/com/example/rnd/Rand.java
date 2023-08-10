package com.example.rnd;


public class Rand {

    public static void main(String[] args) {

        int[] ar = {10, 23, 4,5, 3, 2, 45,6 ,7,22};

        for(int i =0 ;i < 9; i++){
            for(int j=0; j< 9; j++){
                if(ar[j] > ar[j+1]){
                    int x = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = x;
                }
            }
        }

        for(int i = 0; i< 10; i ++){
            System.out.print(ar[i]+ ", ");
        }
        System.out.println("\n");
        
    }
    
}
