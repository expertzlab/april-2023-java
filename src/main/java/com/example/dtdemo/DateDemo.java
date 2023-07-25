package com.example.dtdemo;

import org.joda.time.DateTime;

public class DateDemo {
    
    public static void main(String[] args) {
       DateTime dt = new DateTime();
       System.out.println("Current dt:"+ dt);
       DateTime dtA20Days = dt.plusDays(20);
       System.out.println("Date after 20 days:"+ dtA20Days);

    }
}
