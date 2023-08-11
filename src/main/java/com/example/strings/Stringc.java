package com.example.strings;

public class Stringc {

    public static void main(String[] args) {
        String[] stra = {"Hello, Expertzians, how, are, you",
                         "Expertzlab is providing java classes",
                         "Onam is near by",
                         "Mahabaili is coming"   };
        
        for(String s : stra){
            if(s.contains("Expertz")){
                System.out.println(s);
            }
            
        } 
    }
}
