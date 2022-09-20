package com.interview_question.array;

import java.util.Arrays;
import java.util.List;

public class RearrangeArray2 {
	public static void main(String[] args) {
		int[] arr = new int[] { -1, -1, 6, 1, 9, 2, 3, -1, 4, -1 };
		for (int i = 0; i < arr.length; ) {
			if (arr[i] >= 0 && arr[i] != i) {
				int index = arr[i];
				int ele = arr[index];
				arr[index] = arr[i];
				arr[i] = ele;
			} else {
				i++;
			}
		}
        List lst = Arrays.asList(arr);
	}
}
