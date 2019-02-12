package com.algorithm.code;

import com.reference.classes.DisplayArray;
import com.reference.classes.SwapTwoNumbers;

class
BubbleSort {

	//Object to display array

	public static void main(String[] args) {
		//Object of Binary Search

		//Object of Bubble Sort
		BubbleSort bubble_sort = new BubbleSort();
		//Object of Linear Search
		int arr[] = { 5, 2, 4, 3, 6, 9, 8, 11, 20, 33, 1 };
		bubble_sort.Sort(arr, arr.length);
		bubble_sort.Display(arr);
	}

//    public void Sort(int arr[], int length) {
//
//        //Outer for loop start from i=0 to length of array -1
//        for (int i = 0; i < length; i++) {
//            //Inner for loop start from j=0 to length of array -1 -i
//            //Inner loop is dynamic in order to improve performance
//            //Bubble sort has worst-case and average complexity both О(n2)
//            for (int j = 0; j < length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    SwapTwoNumbers.swap(arr, j, j + 1);
//                }
//            }
//
//        }
//    }

	public void Display(int arr[]) {
		DisplayArray.Dispaly(arr);
	}

	public void Sort(int arr[], int length) {

		//Outer for loop start from i=0 to length of array -1
		for (int i = length - 1; i >= ((length - 1) - 3); i--) {
			//Inner for loop start from j=0 to length of array -1 -i
			//Inner loop is dynamic in order to improve performance
			//Bubble sort has worst-case and average complexity both О(n2)
			for (int j = length - 1; j > (length - 1 - i); j--) {
				if (arr[j] > arr[j - 1]) {
					SwapTwoNumbers.swap(arr, j, j - 1);
				}
			}
			System.out.println();
		}
	}
}
