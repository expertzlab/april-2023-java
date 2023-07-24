package com.example.calc;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldgetTheSumExpected(){
        Calculator c = new Calculator(10, 20);
        Assert.assertEquals(30, c.sum());

    }

    @Test
    public void shouldGettheSubtractionAsExpected(){
        Calculator c = new Calculator(30, 20);
        Assert.assertEquals(10, c.subtraction());

    }
    
}
