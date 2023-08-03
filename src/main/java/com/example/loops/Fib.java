package com.example.loops;

public class Fib {

    public static void main(String[] args) {
        
         for (int n = 1; n < 13; n++) {// 1 1 2 3 5
            System.out.print(fib(n) + " ");
        }
    }
    
    public static int fib(int n){
 
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+ fib(n-2) ;
        
    }
    
}
