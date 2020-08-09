package com.design_pattern.singleton;

import java.util.Arrays;

public class DemoProduct {
    public static void main(String[] args) {
        int [] arr = {-8,-5,-0,-1,-4,-7,-9};
        Arrays.sort(arr);
        int fir = (arr[0]*arr[1]);
        int last = (arr[arr.length-1]*arr[arr.length-2]);
        if(fir>last){
            System.out.println(arr[0]+" "+arr[1]+" "+arr[arr.length-1]);
        }else {
            System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[arr.length-3]);
        }


    }
}
