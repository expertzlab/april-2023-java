package com.example.absfact;

public class VictorianTableFactory extends TableFactory {
   
    @Override
    public Table getInstanceTable() {
        return new VictorianTable();
    }
}
