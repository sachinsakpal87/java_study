package com.interview_question.strings;

import java.util.Scanner;

public class CheckIfStringIsInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string :: ");
		String stirng = scanner.next();

		System.out.println(isNumber(stirng));
	}

	private static boolean isNumber(String stirng) {
		for (int i = 0; i < stirng.length(); i++) {
			if (!Character.isDigit(stirng.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
