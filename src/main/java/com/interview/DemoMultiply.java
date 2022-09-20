package com.interview;

public class DemoMultiply {
//    12  -> num1
//    *
//    94 -> num2
//    ---
//    24
//    120
//      144

    public int multiply(int num1, int num2, int factor){
        if(num1==0){
            return 0;
        }
        int rem = num1%10;
        num1= num1/10;
        int res = rem*num2*factor;
        factor = factor*10;
        return res+multiply(num1,num2,factor);
    }

    public static void main(String[] args) {
        DemoMultiply obj = new DemoMultiply();
        System.out.println(obj.multiply(12,12,1));

    }
}
