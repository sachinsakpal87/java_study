package com.algorithm.code;

import com.reference.classes.DisplayArray;

// consider array of 6 element 
// int arr [] = {2,4,6,1,3,5,9}
//First divide this array in two part and then sort 
// two part and merge with original Array.

class MergeSort {
	/**
	 * @param left
	 * @param right
	 * @param original Compare the value of left and right and merge the sorted array
	 */
	private void Merge(int left[], int right[], int original[]) {
		int i = 0, j = 0, k = 0;
		int left_array_lenght = left.length;
		int right_array_lenght = right.length;

		while (i < left_array_lenght && j < right_array_lenght) {

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
		while (i < left_array_lenght) {
			original[k] = left[i];
			i++;
			k++;
		}
		while (j < right_array_lenght) {
			original[k] = right[j];
			j++;
			k++;
		}
	}

	/**
	 * @param original We pass the original array and divide it into two sub array left and right
	 *                 Then pass those arrays for merging
	 */
	void doMeregesort(int original[]) {
		int original_array_length = original.length;
        if (original_array_length < 2) {
            return;
        }
		int mid = original_array_length / 2;
		int left[] = new int[mid];
		int right[] = new int[original_array_length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = original[i];
		}
		for (int i = mid, j = 0; i < original_array_length; i++, j++) {
			right[j] = original[i];
		}
		doMeregesort(left);
		doMeregesort(right);
		Merge(left, right, original);
		DisplayArray.Dispaly(original);
	}
}
