
package com.intervierw.questions;


import java.util.ArrayList;
import java.util.List;

public class DemoOnline {

    public static  int add (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int i =010;
        int j=07;
        System.out.println(i);
        System.out.println(j);
        short s = 9;
        System.out.println(add(s,6));

//        int k =0;
//
//        do {
//            k++;
//        }while (k<0);


        double d = 10.0/-0;
        if(d==Double.POSITIVE_INFINITY){
            System.out.println("Yeah");
        }

        List<String>list = new ArrayList();

        int x=0;
        for (x=1; x<4;x++);
        System.out.println(x);


    }
}
