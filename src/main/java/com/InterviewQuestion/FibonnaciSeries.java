package com.InterviewQuestion;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {

			System.out.print(" " + fibonnaci(i));
		}
	}

	private static int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonnaci(n - 1) + fibonnaci(n - 2);
	}
}
