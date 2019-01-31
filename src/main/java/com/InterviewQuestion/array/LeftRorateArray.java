package com.InterviewQuestion.array;

public class LeftRorateArray {
	public static void main(String[] args) {
		System.out.println(4%1);
		System.out.println(4%3);
		System.out.println(4%2);
		System.out.println(4%4);
		System.out.println(4%5);
		System.out.println(4%11);
		System.out.println(11%10);
		System.out.println(1%10);

		int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		rorateArray(arr,10
				,arr.length);
	}

	private static void rorateArray(int[] arr, int d, int n) {

		int mod = d % n;
		for(int i = 0; i < n; ++i)
			System.out.print(arr[(i + d) % n]+ " ");
		System.out.println();
	}
}
