package com.InterviewQuestion.array;

import java.util.Arrays;

public class RotateArrayWithRange {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] range = new int[][] { { 0, 2 }, { 0, 3 } };

		for (int i = 0; i < range.length; i++) {
			int start = range[i][0];
			;
			int end = range[i][1];
			rotateArray(arr, start, end + 1, 1);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return GCD(b, a % b);
	}

	private static void rotateArray(int[] arr, int start, int end, int d) {
		int j, k, temp;
		for (int i = start; i < GCD(d, end); i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= end) {
					k = k - end;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
}
