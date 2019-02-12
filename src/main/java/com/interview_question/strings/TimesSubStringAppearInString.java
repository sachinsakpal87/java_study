package com.interview_question.strings;

public class TimesSubStringAppearInString {
	public static void main(String[] args) {
		String main = "GeeksforGeeks";
		String sub = "Gks";
		int count = count(main, sub, main.length(), sub.length());
		System.out.println(count);
	}

	private static int count(String main, String sub, int mainLength, int subLength) {
		if ((mainLength == 0 && subLength == 0) || subLength == 0) {
			return 1;
		}
		if (mainLength == 0) {
			return 0;
		}
		if (main.charAt(mainLength - 1) == sub.charAt(subLength - 1)) {
			return count(main, sub, mainLength - 1, subLength - 1) + count(main, sub, mainLength - 1, subLength);
		} else {
			return count(main, sub, mainLength - 1, subLength);
		}
	}
}
