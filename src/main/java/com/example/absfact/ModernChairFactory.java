package com.example.absfact;

public class ModernChairFactory extends ChairFactory {

    @Override
    public Chair getInstanceChair() {
        return new ModernChair();
    }
    
}
