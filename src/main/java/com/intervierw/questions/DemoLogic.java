package com.intervierw.questions;

public class DemoLogic {
    public int fibo(int i){
        if(i<2)
            return i;
        return fibo(i-1)+fibo(i-2);
    }

    public static void main(String[] args) {
        DemoLogic obj = new DemoLogic();
        int n=6;
        //Find fibo of 6
        // 1 1 2 3 5 8

        for (int i=1; i<=n; i++){
            System.out.print(obj.fibo(i)+" ");
        }
    }
}
