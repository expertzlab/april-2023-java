package com.example.arlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DemoArrayList {

    public static void main(String[] args) {
        List ls1 = new ArrayList();
        ls1.add(10);
        ls1.add(4);
        ls1.add(8);
        List ls2 = new ArrayList<>();
        ls2.add(6);
        ls2.add(7);
        ls1.addAll(0, ls2);

        ls2.sort(new MyComparator());

        System.out.println(ls1);
        System.out.println(ls2);
        
    }
    
}


class MyComparator implements Comparator{

   public int compare(Object x, Object y){
        return - (int)x - (int) y ;
    }

  }
