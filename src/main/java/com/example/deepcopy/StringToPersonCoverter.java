package com.example.deepcopy;

public class StringToPersonCoverter {
    public Person convert(String str){
        System.out.println("in converter:"+ str);
        return new Person(str, 0, null);
    }
}
