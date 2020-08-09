package com.intervierw.questions;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5};
        int sum = 0;
        int sum1 = 0;
        for (int i=1,j=0; i<=arr[(arr.length-1)];i++,j++){
            sum += i;
            if(j<arr.length){
                sum1+= arr[j];
            }
        }
        System.out.println(sum - sum1);

    }
}
