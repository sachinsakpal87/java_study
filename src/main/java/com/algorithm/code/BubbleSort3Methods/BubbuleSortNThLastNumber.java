package com.algorithm.code.BubbleSort3Methods;

import java.util.Arrays;

/**
 * This program can be asked as a Nth highest  or Nth last number
 */
public class BubbuleSortNThLastNumber {
	public static void main(String[] args) {
		int [] arr = new int [] {13,12,11,10,9,8,7,6,5,4,3,2,1};
		SortNthLastNumber(arr,arr.length,4);
	}

	private static void SortNthLastNumber(int [] arr, int length, int n){
		for(int i=0; i<n; i++){
			for (int j=0; j<(length-1-i); j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(n+" th number in array is "+arr[arr.length- n]);
	}
}
