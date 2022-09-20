package com.intervierw.questions;

public class CountNumberOfBitsInInteger {
    public static void main(String[] args) {
        int n = 6; //0110
        int count = 0;
        while (n!=0){
            count +=n&1;
            n =(n>>1);
        }
        System.out.println(count);
    }
}
