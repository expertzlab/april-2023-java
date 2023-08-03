package com.example.loops;

public class Myloop {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
         fib(i, j);

    }

    public static int fib(int i, int j){
            int n = 0;
            System.out.println("j:"+j);
            if(j < 13){
                n = fib(j, i+j);
            }
            System.out.println("n:"+n);
            return j + n;
    }
}
