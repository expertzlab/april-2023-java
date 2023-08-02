package com.example.loops;

public class Myloop {
    public static void main(String[] args) {
        //1, 1, 2, 3, 5, 8, 13
        int i = 0;
        int j = 1;
        while(j<13){
            int n = i+j;
            System.out.println(n);
            i = j;
            j = n;
        }
    }
}
