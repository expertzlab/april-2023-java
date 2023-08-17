package com.example.absfact;

public class ModernTableFactory extends TableFactory {

    @Override
    public Table getInstanceTable() {
        return new ModernTable();
    }
    
}
