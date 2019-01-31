package com.algorithm.code.BubbleSort3Methods;

import java.util.Arrays;

/**
 * This program can be asked as a Nth lowest  or first Nth number
 * We are using reverse bubble sort.
 */
public class BubbuleSortNThLowestNumber {
	public static void main(String[] args) {
		int [] arr = new int [] {1,10,3,8,5,6,7,4,9,2,11};
		SortBubbuleSortNThLowestNumber(arr,arr.length,4);
	}

	private static void SortBubbuleSortNThLowestNumber(int [] arr, int length, int n){
		for(int i=(length-1); i>n; i--){
			for (int j=(length-1); j>(length-1-i); j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(n+" th number in array is "+arr[arr.length- n]);
	}
}
