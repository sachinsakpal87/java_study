package com.InterviewQuestion;

public class SubSetOfArray {

	static int maxSubArraySum(int a[], int size) {

		int maxValue = Integer.MIN_VALUE, isMaxValue = 0;

		for (int i = 0; i < size; i++) {
			isMaxValue = isMaxValue + a[i];
			if (isMaxValue < 0) {
				isMaxValue = 0;
			}

        /* Do not compare for all
           elements. Compare only
           when max_ending_here > 0 */
			else if (maxValue < isMaxValue) {
				maxValue = isMaxValue;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = a.length;
		int max_sum = maxSubArraySum(a, n);
		System.out.println("Maximum contiguous sum is "
				+ max_sum);
	}
}
