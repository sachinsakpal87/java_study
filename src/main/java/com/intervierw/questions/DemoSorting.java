package com.intervierw.questions;

class util {
	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	public static void display(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}

class bubblesort {

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					util.swap(arr, j, j + 1);
				}
			}
		}
		util.display(arr);
	}
}

class selectionsort {

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			util.swap(arr, index, i);
		}
		util.display(arr);
	}
}

public class DemoSorting {

	public static void main(String[] args) {

		int[] arr = { 9, 1, 8, 5, -4, 7, 3, -2 };
		bubblesort objbubblesort = new bubblesort();
		objbubblesort.sort(arr);

		System.out.println();
		int[] arrsel = { 9, 1, 8, 5, -5, 7, 3, -2 };
		selectionsort objselectionsort = new selectionsort();
		objselectionsort.sort(arrsel);
	}
}
