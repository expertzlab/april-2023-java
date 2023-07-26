package com.example.stringman;

class H{
    int s;

    public H(int x){
        s = x;
    }

    public String toString(){
        return String.valueOf(s);
    }

    public void setS(int x){
        s = x;
    }
}
public class MString {

    public static void main(String[] args) {
        /* 
        String s1 = "Hello";
        String s2 = s1;
        s1 = "AnotherHello";
        System.out.println("s1:"+ s1);
        System.out.println("s2:"+ s2);
        */

        //byte, char, short, int, long, float, double
        //Byte, Character, Short, Integer, Long, Float, Double

        
        Byte b1 = Byte.valueOf((byte)1);
        Character c1 = Character.valueOf('a');
        Short s1 = Short.valueOf((short)123);
        

        H a1 = new H(10);
        H a2 = new H(20);

        System.out.println("a1:"+a1+", a2:"+a2);
        a1 = a2;
        a1.setS(30);
         System.out.println("a1:"+a1+", a2:"+a2);

        int x1 = 10;
        int x2 = 20;
        x1 = x2;
        x1 = 30;
        System.out.println("x1:"+ x1+", x2:"+ x2); 


    }
    
}
