package com.InterviewQuestion;

import java.util.Arrays;

public class ShiftArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int input = 4;
		for (int i = 0; i < arr1.length; i++) {
			if (i >= input) {
				swap(arr1, i % input, i);
			}
		}

		System.out.println(Arrays.toString(arr1));

		String str = "sachin";

		str = str + "sakpal";
		System.out.println(str);
		StringBuilder stringBuilder = new StringBuilder("Sachin");
		stringBuilder.append("sac");
		System.out.println(stringBuilder);
	}

	private static void swap(int[] arr, int i, int i1) {
		int temp = arr[i];
		arr[i] = arr[i1];
		arr[i1] = temp;
	}
}
