package com.example.comp;

public class Arrays {

    public static void main(String[] args) throws Exception, RuntimeException {
         int[] a1 = new int[5];
        try{
           if(a1 != null)
            a1[5] = 10;

        } catch( ArrayIndexOutOfBoundsException e){
            System.out.println("Arraybound Exception caught");
            a1 = new int[6];
        }
        finally {
            System.out.println("Reached finally");
        }
        a1[5] = 10;
      System.out.println("Hello");
    }
    
}
