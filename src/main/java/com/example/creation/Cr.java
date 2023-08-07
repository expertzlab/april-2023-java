package com.example.creation;

public class Cr {
    public static void main(String[] args)  {
        MFactory mf = new M1Factory();
       M m = mf.getInstance();
      
    }

    public M mymethod(MFactory mf){
          
        M m = mf.getInstance();
        return m;
    }
}
