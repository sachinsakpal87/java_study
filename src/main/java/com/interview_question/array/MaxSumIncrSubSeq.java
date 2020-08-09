package com.interview_question.array;

public class MaxSumIncrSubSeq {
	public static void main(String[] args) {
		int arr[] = new int[] { 3, 4, 5, 10, 1, 8, 99 };
//		findMaxSumIncrSubSeq(arr);

		System.out.println("Sum of maximum sum "+
				"increasing subsequence is "+
				maxSumIS(arr, arr.length));
	}

//	private static void findMaxSumIncrSubSeq(int[] arr) {
//		Set set = new HashSet();
//		int j = 0;
//		List skipIndex = new ArrayList();
//		while (j < arr.length) {
//			int currSum = 0;
//			for (j = 0; j < arr.length - 1; j++) {
//				if (!skipIndex.contains(j)) {
//					if (arr[j] < arr[j + 1]) {
//						currSum += arr[j];
//					} else {
//						currSum += arr[j];
//						set.add(currSum);
//						skipIndex.add(j);
//						break;
//					}
//				}
//			}
//
//			if ((j + 1) == arr.length) {
//				currSum += arr[j];
//				set.add(currSum);
//				skipIndex.add(j);
//				j++;
//			}
//		}
//
//		System.out.println(Collections.max(set));
//	}

	/* maxSumIS() returns the
    maximum sum of increasing
    subsequence in arr[] of size n */
	static int maxSumIS(int arr[], int n)
	{
		int i, j, max = 0;
		int msis[] = new int[n];

        /* Initialize msis values
           for all indexes */
		for (i = 0; i < n; i++)
			msis[i] = arr[i];

        /* Compute maximum sum values
           in bottom up manner */
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] &&
						msis[i] < msis[j] + arr[i])
					msis[i] = msis[j] + arr[i];

        /* Pick maximum of all
           msis values */
		for (i = 0; i < n; i++)
			if (max < msis[i])
				max = msis[i];

		return max;
	}
}
