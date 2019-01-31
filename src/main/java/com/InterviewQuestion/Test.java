package com.InterviewQuestion;

public class Test {

	public static int multiply(int y) {
		int x = 2;
		if (y == 1) {
			return x;
		}
		return x * multiply(y - 1);
	}

	public static void main(String[] args) {

		System.out.println(multiply(5));
	}
}
