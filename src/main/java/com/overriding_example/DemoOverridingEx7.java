package com.overriding_example;

/**
 * Below is not overriding as signature is not same
 * co varient is applicable only for return type
 */
class Parent10{
    public void fun(Object obj){
        System.out.println("Parent");
    }
}

class Child10 extends Parent10 {

    public void fun(String obj){
        System.out.println("Child");
    }
//    public void fun(Object obj){
//        System.out.println("Child");
//    }

//    public int fun(Object obj) {
//        return 1;
//    }
}
public class DemoOverridingEx7 {
    public static void main(String[] args) {
        Parent10 p = new Child10();
        p.fun("Sachin");
    }
}
