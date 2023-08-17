package com.example.absfact;

public class VictorianChairFactory extends ChairFactory {
    
    @Override
    public Chair getInstanceChair() {
        return new VictorianChair();
    }
}
