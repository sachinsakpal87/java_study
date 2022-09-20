package com.algorithm.code;

public class DemoMainClass {

	public static void main(String[] args) {
		//Object of Binary Search
//		BinarySearch binary_search = new BinarySearch();
//		//Object of Bubble Sort
//		BubbleSort bubble_sort = new BubbleSort();
//		//Object of Linear Search
//		LinearSearch linear_search = new LinearSearch();
//		//Object of Quick Sort
//		QuickSort qsort = new QuickSort();
		//Object of Merge Sort
		MergeSort objeMerge = new MergeSort();

//		int arr[] = { 5, 2, 1, 4, 3 };
//        //Bubble Sort
//        bubble_sort.Sort(arr, arr.length);
//        bubble_sort.Display(arr);

//        //Binary Search
//        System.out.println("The value is at position :: " + binary_search.bSearch(arr, 4));
//
//        //Linear Search
//        System.out.println("The value is at position :: " + linear_search.doLinearSearch(arr, 5));

		//Quick Sort Algorithm
//		qsort.qsort(arr, 0, arr.length - 1);
//		qsort.Display(arr);
//
//		System.out.println("Start of a program");
//		int arr1[] = { 2, 4, 6, 1, 3, 5, 9 };
//		objeMerge.doMeregesort(arr1);
//		DisplayArray.Dispaly(arr1);
//
//
//		int best[] = { 1, 2, 3, 4, 5, 6, 7 };
//		int worst[] = { 7, 6, 5, 4, 3, 2, 1};
//
//		objeMerge.doMeregesort(best);
//		objeMerge.doMeregesort(worst);

        int[] arri = {8, 4, 2, 1};
        objeMerge.doMeregesort(arri);
//        System.out.println(objeMerge.doMeregesort(arri));
	}
}
