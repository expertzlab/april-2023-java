package com.example.calendar;

public class CalendarSamples {
    
    public static String decideivalue(int i) {
   
        String result = null;
        switch(i){
            case 1:
                result = "values is 1";
                break;
            case 2:
            case 3:
            case 4:
                result = "less than 5";
                break;
            
            case 5:
            case 6:
            case 7:
                result = "less than 8";
            case 8:
        }
       return result;

    }
}
