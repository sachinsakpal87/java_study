package com.interview_question.strings;

public class StringIsPanagram {
	public static void main(String[] args) {

		String string = "The quick brown fox jumps over the lazy dog";

		boolean[] flags = new boolean[26];
		for (int i = 0; i < string.length(); i++) {
			if (string.toLowerCase().charAt(i) >= 'a' && string.toLowerCase().charAt(i) <= 'z') {
				flags[string.toLowerCase().charAt(i) - 'a'] = true;
			}
		}
		for (boolean flag : flags) {
			if (!flag) {
				System.out.println("Not panagram");
				break;
			}
		}
	}
}
