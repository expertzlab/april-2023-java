package com.example.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarSamples {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar(2020,8-1 ,2);
        //System.out.println(cal);
        System.out.println("epoch:" +cal.getTime());
        System.out.println("Year:"+ cal.get(Calendar.YEAR));
    
        int i = 10;
        while(i< 100){
            if( i< 20){
                System.out.println("hello");
                
            }
            i = i + 10;
        }
        

    }
}
