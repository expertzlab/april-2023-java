package com.example.comp;

public class MCompare  {
    public static void main(String[] args) {
        One v1 = new One(10);
        Two v2 = new Two(10);

        if(v1.equals(v2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class One{
    int value;

    public One(int x){
        this.value = x;
    }

    public int getValue(){
        return value;
    }

    public boolean equals(Object x){
        
        int y = 0;
        if(x instanceof One){
           y =  ((One)x).getValue();
        } else {
           y = ((Two)x).getValue();
        }
        
       if(this.getAge() == x.getAge() && this.getName().equals(x.getName())  ){
        return true;
       } else {
        return false;
       }
    }
}

class Two{
    int value;

    public Two(int x){
        this.value = x;
    }

     public int getValue(){
        return value;
    }    

}
