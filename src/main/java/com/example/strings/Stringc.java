package com.example.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Stringc {

    public static void main(String[] args) {
        String[] stra = {"abc.com",
                         "a$@k",
                         "+44 23333 1234 5678",
                         "abc.com"   };

                        
        Pattern pattern = Pattern.compile("^(\\+?44\\s?|0)(\\d{2,5}\\s?)(\\d{3,4}\\s?)(\\d{4})$");

        for(String s : stra){
            Matcher matcher = pattern.matcher(s);
            if(matcher.matches()){
              //String rp =   matcher.replaceAll("python");
              System.out.println(s);
            }
        }
       
    }
}
