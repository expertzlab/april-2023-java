package com.example.strings;

public class Stringc {

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = str+" how are you";
        System.out.println(str);
        String str2 = " how do you do";
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        StringBuilder srb = new StringBuilder(str1);
        srb.append(str2);
        str1 = sb.toString() + " I am fine, " + " How are you?";
        System.out.println(str1);
   


        
    }
    
}
