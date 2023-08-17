package com.example.creation;

public class M1Factory implements MFactory {

    public M getInstance(String familytype){
        if(M1_TYPE.equals(familytype))
            return new M1();
        else   
            return new M2();
    }
    
}
