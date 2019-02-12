package com.interview_question;

public class ReverseFloat {
	public static void main(String[] args) {
		Float num = 73.12f;
		float rem = -1;
		int cnt = 0;
		do {
			rem = num % 10;
			if (rem != 0) {
				num = num * 10;
				cnt++;
			}
		} while (rem != 0);
		rem = num / 10;

		while (rem != 0) {
			rem = num % 10;
//            num =
		}

		System.out.println(num);
	}
}
