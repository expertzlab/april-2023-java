package com.example.creation;

public interface MFactory {

    final String M1_TYPE = "M1";
    final String M2_Type = "M2";

    public M getInstance(String type);
}
