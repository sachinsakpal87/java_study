package com.intervierw.questions;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Integer n = 111, m = 111;
        int sum = 0;
        int base = 1 ;
        while (n>0){
            int no = n%10;
            n = n/10;
            sum += (no * base);
            base = base * 2;
        }
        System.out.println(sum);

        System.out.println(Integer.parseInt(m.toString(),2));
    }
}
