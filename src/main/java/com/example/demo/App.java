package com.example.demo;

import java.util.Scanner;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    //static Logger logger = LoggerFactory.getLogger(App.class);
    static Scanner sc = new Scanner(System.in);

    static int[] arr = new int[10];

    public static void main( String[] args )
    {
        System.out.println("Enter 10 numbers");
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("sum="+ findSum(arr) );

    }

    public static int findSum(int[] a1){
        int sum = 0;
        for(int i=0; i<10; i++){
            sum = sum + arr[i] ;
        }
        return sum;
    }
}
