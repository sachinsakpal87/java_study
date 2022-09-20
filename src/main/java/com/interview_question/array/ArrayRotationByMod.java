package com.interview_question.array;

import java.util.Arrays;

public class ArrayRotationByMod {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 11, 1, 2 , 3, 4};
        System.out.println(findMinInSortedArray(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
    }

//    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//    {5, 6, 7, 8, 9, 10, 11, 1, 2 , 3, 4};
//    {1, 2};
//    {2, 1};
//    {1};
//    {5,1,2,3,4};
//     {5,6,7,1,2,3,4};
//     {5,6,7,8,1,2,3,4};
//     {2,3,4,5,6,7,8,1};
    static int findMinInSortedArray(int []arr, int start, int end){
        int mid = (start+end)/2;
         if(end<start)
             return arr[0];

        if(start<mid&&arr[mid-1]>arr[mid])
            return arr[mid];
        if(end>mid&&arr[mid+1]<arr[mid])
            return arr[mid+1];
        if(arr[mid]>arr[end]){
            return findMinInSortedArray(arr,mid+1,end);
        }else {
            return findMinInSortedArray(arr,start,mid-1);
        }
    }
}
