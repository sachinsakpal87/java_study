package com.overloading_example;

public class DemoOverloadingEx8 {

    public void fun(String var){

    }

    public void fun(String var2,String... var){
        System.out.println("var args");
    }

    public void fun(String var, String var2){
        System.out.println("2 var");
    }
    public static void main(String[] args) {
        DemoOverloadingEx8 overloadingEx8 = new DemoOverloadingEx8();
        overloadingEx8.fun("abc","pqr");
    }
}
