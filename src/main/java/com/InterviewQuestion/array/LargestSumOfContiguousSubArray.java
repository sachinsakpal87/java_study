package com.InterviewQuestion.array;

public class LargestSumOfContiguousSubArray {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " +
				maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
//		int max_sofar = 0; int max = 0;
//		for (int i=0; i< a.length; i++){
//			if(a[i]<=0 && max ==0){
//				max = 0;
//			}else{
//				max += a[i];
//				if(max>max_sofar)
//					max_sofar = max;
//			}
//		}
//
//		return max_sofar;

		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}
}
