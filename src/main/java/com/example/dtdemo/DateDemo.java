package com.example.dtdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("Date:"+ d1);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String fd = sdf.format(d1);
        System.out.println("date:formatted:"+ fd);
    }
}
