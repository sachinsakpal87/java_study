package com.InterviewQuestion;

public class FindMaximumNumber {
    public static void main(String args[]) {

        int arr[] = {6, 7, 9, 2, 3, 5, 7, 4, 1, 2, 3, 6, 9, 0, 8};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in an array is " + max);

        max= 0;
        for (int i=0; i<arr.length/2;i++){
            if(arr[i]<arr[arr.length-1-i]){
                if(max<arr[arr.length-1-i])
                    max = arr[arr.length-1-i];
            }else {
                if(max<arr[i])
                    max = arr[i];
            }
        }
        System.out.println(max);

    }

}
