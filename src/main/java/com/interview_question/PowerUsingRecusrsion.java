package com.interview_question;

public class PowerUsingRecusrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcPower(4, 3));
	}

	public static int calcPower(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return x * calcPower(x, (y - 1));
		}
	}
}
