package com.exception;

import java.io.*;

public class Interview {
    public static void main(String[] args) throws IOException {
//        Interview obj = new Interview();
//        int var = obj.fun();
//        System.out.println(var);


        if(foo()){
            System.out.println("IF Executed");
        }else {
            System.out.println("Failed to execute if");
        }

    }

    private static boolean foo() {

        try {
            int i = 5/0;
        }finally {
            return true;
        }




    }


    int fun() throws IOException {
        try {
            return calVal();
        }catch (ArithmeticException e){
            System.out.println( "Exception occurred");
        }finally {
            return calVal();
        }

    }

    private int calVal() throws IOException {
        return 5/0;
    }
}
