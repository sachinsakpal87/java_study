package com.algorithm.code;

class BinarySearch {
	private BubbleSort obj = new BubbleSort();

	int bSearch(int arr[], int num) {
		obj.Sort(arr, arr.length); // For Binary Search array must be sorted
		return search(arr, 0, arr.length - 1, num);
	}

	//Recursive algorithm to search position of element
	private int search(int arr[], int left, int right, int num) {
		// if left > right means element not found
		if (left >= right) {
			return -1;
		}
		int mid = (left + right) / 2;
		if (arr[mid] == num) {
			return mid + 1;
		} else if (num < arr[mid]) {
			return search(arr, left, mid - 1, num);
		}
		return search(arr, mid + 1, right, num);
	}
}

