package com.interview_question.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSumIncrSubSeq {
	public static void main(String[] args) {
		int arr[] = new int[] { 3, 4, 5, 10 };
		findMaxSumIncrSubSeq(arr);
	}

	private static void findMaxSumIncrSubSeq(int[] arr) {
		Set set = new HashSet();
		int j = 0;
		List skipIndex = new ArrayList();
		while (j < arr.length) {
			int currSum = 0;
			for (j = 0; j < arr.length - 1; j++) {
				if (!skipIndex.contains(j)) {
					if (arr[j] < arr[j + 1]) {
						currSum += arr[j];
					} else {
						currSum += arr[j];
						set.add(currSum);
						skipIndex.add(j);
						break;
					}
				}
			}

			if ((j + 1) == arr.length) {
				currSum += arr[j];
				set.add(currSum);
				skipIndex.add(j);
				j++;
			}
		}

		System.out.println(Collections.max(set));
	}
}
