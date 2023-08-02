package com.example.calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalendarSamplesTest {

    CalendarSamples c1;

    @Before
    public void init(){
        c1 = new CalendarSamples();
    }

    @Test
    public void weGetValuesis1WhenOneisPassed() {
        Assert.assertEquals("values is 1",c1.decideivalue(1)); 
    }

    @Test
    public void weGetlessThan5When2isPassed() {
        Assert.assertEquals("less than 5",c1.decideivalue(2)); 
    }
}
