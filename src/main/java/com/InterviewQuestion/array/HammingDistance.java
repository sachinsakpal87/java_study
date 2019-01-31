package com.InterviewQuestion.array;
// Incomplete

import java.util.Arrays;
import java.util.HashMap;

public class HammingDistance {

	public static void swap(int[] arr, int index, int index2) {
		int tmp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 8 };
		int n = arr.length;
		int[] copy = new int[arr.length * 2];
		for (int i = 0; i < n; i++) {
			copy[i] = copy[i + n] = arr[i];
		}

		n = copy.length;
		for (int i = 0; i < n; i++) {
			swap(copy, i, ((i + (1 % n)) % n));
		}
		swap(copy, 0, n - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < (copy.length - arr.length); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != copy[i + j]) {
					break;
				}
			}
		}
	}
}
