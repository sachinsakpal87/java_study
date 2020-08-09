package com.interview_question;

public class ReverseFloat {
	public static void main(String[] args) {
		float var = 71.59f;
		System.out.println(revesefloat(var));

	}

	private static float revesefloat(float var) {
		String str = String.valueOf(var);
		String[] arr = str.split("[.]+");
		arr[0] = revese(arr[0]);
		arr[1] = revese(arr[1]);
		return Float.valueOf(arr[0]+"."+arr[1]);
	}

	private static String revese(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		return stringBuilder.reverse().toString();
	}
}
