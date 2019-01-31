package com.algorithm.code;

class LinearSearch {
	public int doLinearSearch(int arr[], int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i + 1;
			}
		}
		return -1;
	}
}
