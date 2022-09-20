package com.abstractex;

abstract class baseAbstract {
    int c, d;
    baseAbstract (int a, int b) {
        this.c = a;
        this.d = b;
    }

}

class childAbstract extends baseAbstract {


    childAbstract(int a, int b) {
        super(a, b);
    }
}

public class DemoAbstractEx5 {
    public static void main(String[] args) {
        baseAbstract obj = new childAbstract(5,6);
    }
}
