package com.example.arlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DemoArrayList {

    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add(10);
        ls.add(4);
        ls.add(8);
        ls.add(6);
        ls.sort(new MyComparator());
        System.out.println(ls);

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            ls.add(sc.nextInt());
        }
    }
    
}


class MyComparator implements Comparator{

   public int compare(Object x, Object y){
        return - (int)x - (int) y ;
    }

  }
