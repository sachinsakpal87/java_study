package com.algorithm.code;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		int arr[] = new int[] { 53, 1, 4, 3, 6, 5, 8, 9, 23, 5 };
//        bSort(arr,0,arr.length);
		quickSort(arr, 0, arr.length - 1);
		display(arr);
		Scanner scan = new Scanner(System.in);
		int searchNum = Integer.parseInt(scan.next());
		int start = 0;
		int end = arr.length;
		int val = bSearch(arr, start, end, searchNum);
		if (val == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("found at" + val);
		}
	}

	public static int bSearch(int[] arr, int start, int end, int num) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == num) {
			return mid + 1;
		}
		if (num < arr[mid]) {
			return bSearch(arr, start, mid - 1, num);
		} else {
			return bSearch(arr, mid + 1, end, num);
		}
	}

	public static void bSort(int[] arr, int start, int end) {
		for (int i = start; i < end; i++) {
			for (int j = start; j < end - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
		int pivote = partitioned(arr, start, end);
		quickSort(arr, start, pivote - 1);
		quickSort(arr, pivote + 1, end);
	}

	private static int partitioned(int[] arr, int start, int end) {
		int pindex = start;
		int pivote = arr[end];
		for (int i = start; i < end; i++) {
			if (arr[i] < pivote) {
				swap(arr, pindex, i);
				pindex++;
			}
		}
		swap(arr, pindex, end);
		return pindex;
	}

	private static void swap(int[] arr, int pindex, int i) {
		int temp = arr[i];
		arr[i] = arr[pindex];
		arr[pindex] = temp;
	}

	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
