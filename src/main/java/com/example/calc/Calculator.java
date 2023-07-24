package com.example.calc;

public class Calculator {

    int a;
    int b;

    public Calculator(int x, int y){
        this.a = x;
        this.b = y;
    }

    public int sum(){
        return a+b;
    }

    public int subtraction(){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 20);
        System.out.println("sum="+c.sum());
    }

    
}
