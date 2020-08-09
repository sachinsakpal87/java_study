package com.intervierw.questions;

public class DemoPrePostOperator {
    public static void main(String[] args) {

        int j=0, k=0;
        for (int i=0; i< 50; i++) {
            j = j++;
            k = ++k;
        }
        System.out.println(j+"\t"+k);

//        int p = 2000000000;
//        int m = 0;
//        System.out.println(p+50);
//
//
//        for (float x=2000000000; x<p+50; x++){
//            System.out.println(x);
//            m++;
//        }
//        float x=2000000000;
//        if(x==(2000000050)){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//        System.out.println(m);

//        for (float x=0.1f; x<0.5; ){
//            System.out.println(x);
//            x=x+0.1f;
//        }
//        \u000d for(int i=0; i<50; i++)System.out.println("Hello"+i);
    }
}
