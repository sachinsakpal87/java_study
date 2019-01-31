package com.InterviewQuestion.array;

public class RearrangeArray2 {
	public static void main(String[] args) {
		int[] arr = new int[] { -1, -1, 6, 1, 9, 2, 3, -1, 4, -1 };
		for (int i = 0; i < arr.length; ) {
			if (arr[i] >= 0 && arr[i] != i) {
				int ele = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = ele;
			} else {
				i++;
			}
		}
	}
}
