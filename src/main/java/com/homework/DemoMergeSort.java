package com.homework;

public class DemoMergeSort {

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void doMerger(int[] left, int[] right, int[] original) {
		int lenLeft = left.length;
		int lenRight = right.length;
		int i = 0, j = 0, k = 0;
		while (i < lenLeft && j < lenRight) {
			if (left[i] < right[j]) {
				original[k] = left[i];
				i++;
				k++;
			} else {
				original[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < lenLeft) {
			original[k] = left[i];
			i++;
			k++;
		}
		while (j < lenRight) {
			original[k] = right[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] Originalarr) {
		int lenOriginal = Originalarr.length;
		if (lenOriginal < 2) {
			return;
		}
		int mid = lenOriginal / 2;
		int[] left = new int[mid];
		int[] right = new int[lenOriginal - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = Originalarr[i];
		}
		for (int j = 0, i = mid; i < lenOriginal; i++, j++) {
			right[j] = Originalarr[i];
		}
		mergeSort(left);
		mergeSort(right);
		doMerger(left, right, Originalarr);
		//	display(Originalarr);
	}

	public static void main(String[] args) {
		int[] arr = { 9, 5, 6, 8, 3, 4, 1, 2, 7 };
		//int lenghtarr = arr.length;
		mergeSort(arr);
		display(arr);
	}
}
