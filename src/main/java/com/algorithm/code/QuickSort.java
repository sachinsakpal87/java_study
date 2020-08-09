package com.algorithm.code;

import com.reference.classes.DisplayArray;
import com.reference.classes.SwapTwoNumbers;

class QuickSort {

	public static void main(String... args){
		QuickSort obj = new QuickSort();
		int [] arr = {4,6,8,2,3,1};
		obj.qsort(arr,0,arr.length-1);
	}

	void qsort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
		int pivot = partitioned(arr, start, end);
		qsort(arr, start, pivot - 1);    //Use recursion for left array
		qsort(arr, pivot + 1, end);    //Use recursion for right array
	}

	private int partitioned(int arr[], int start, int end) {
		int pivot = arr[end]; //Assign pivot to end element
		int pindex = start; // create a pindex pointer pointing to start
		for (int i = start; i < end; i++) //Loop from start to end-1 (just to keep last element at last later will be swaped
		{
			if (arr[i] < pivot)    // if element is less than pivot then swap with pindex just to keep all element
			{                    // less than pivot to left and all element greater than pivot to right
				SwapTwoNumbers.swap(arr, pindex, i);    //swap element less than pivot with pindex element
				pindex++;        //increment pivot
			}
		}
		SwapTwoNumbers.swap(arr, pindex, end); // swap the pindex with pivot element so than all element less than pivot
		//will be left to pivot and all element greater than pivot will be right.
		return pindex;
	}

	void Display(int arr[]) {
		DisplayArray.Dispaly(arr);
	}
}
// This is just to remember the condition not always the case.
// As partitioned function is dynamic condition we cannot start loop from 0 to end we have to start from start to end.
// All the element will start with start and end with end
