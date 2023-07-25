package com.example.comp;

public class MCompare {
    public static void main(String[] args) {
        One v1 = new One(10);
        One v2 = new One(15);

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

    public boolean equals(One x){
       if(this.getValue() == x.getValue()){
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

}
