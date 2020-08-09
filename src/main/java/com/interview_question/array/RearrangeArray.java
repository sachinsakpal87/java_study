package com.interview_question.array;

public class RearrangeArray {
	public static void main(String[] args) {
		int[] arr = new int[] { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		int[] result = new int[arr.length];
//		for (int i=0; i<result.length; i++){
//			result[i] = -1;
//		}
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				flag = true;
				continue;
			}
			if (arr[i] != -1) {
				result[arr[i]] = arr[i];
			}
			if (result[i] > 0) {

			} else {
				result[i] = -1;
			}
		}
		if (flag) {
			result[0] = 0;
		}

		System.out.println(result);
	}
}
