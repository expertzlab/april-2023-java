package com.example.dtdemo;

import org.joda.time.DateTime;

public class DateDemo {
    
    public static void main(String[] args) {
        
       DateTime today = new DateTime();
       DateTime yesterday = new DateTime().minusDays(1);
       System.out.println("today:" + today);
       System.out.println("yesterday:" + yesterday);

       if(yesterday.isAfter(today)){
         System.out.println("YES");
       } else{
        System.out.println("NO");
       }

    }
}
