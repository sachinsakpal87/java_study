package com.interview_question.array;

import java.sql.SQLException;

public class SubArrayWithMinAvg {
	static int arr[] = new int[] { 3, 7, 90, 20, 10, 50, 40 };

	public static void main(String[] args) throws SQLException {

		int k = 3; // Subarray size
		findMinAvgSubarray(arr.length, k);
	}

	private static void findMinAvgSubarray(int length, int k) {
		int subArraySum = 0, minSumb = 0;
		for (int i = 0; i < k; i++) {
			subArraySum += arr[i];
		}
		minSumb = subArraySum;
		for (int i = k; i < length; i++) {
			subArraySum += arr[i] - arr[i - k];
			if (subArraySum < minSumb) {
				minSumb = subArraySum;
			}
		}
		System.out.println(minSumb);
	}
}
