package com.interview_question.array;

public class LeftRorateArray {
	public static void main(String[] args) {
		System.out.println(1%5);
		System.out.println(2%5);
		System.out.println(3%5);
		System.out.println(4%5);
		System.out.println(5%5);
		System.out.println(6%5);
		System.out.println(7%5);
		System.out.println(8%5);
		System.out.println(9%5);
		System.out.println(10%5);
		System.out.println(11%5);
//		System.out.println(11%10);
//		System.out.println(1%10);

		int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		rorateArray(arr,4
				,arr.length);
	}

	private static void rorateArray(int[] arr, int d, int n) {

		int mod = d % n;
		for(int i = 0; i < n; ++i)
			System.out.print(arr[(i + d) % n]+ "/index"+(i + d) % n);
		System.out.println();
	}
}
