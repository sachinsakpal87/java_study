package com.abstractex;

public class InterviewJu {
    public static void printA(int[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        for (int j=0; j<arr.length; j++){
            int max = Integer.MIN_VALUE;
            for (int i = j+1; i < arr.length; i++) {
                if(max<arr[i]){
                    max = arr[i];
                }
            }
            arr[j] = max;
        }
        arr[arr.length-1] = -1;
        printA(arr);
    }

}
