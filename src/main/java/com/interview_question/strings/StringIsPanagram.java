package com.interview_question.strings;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringIsPanagram {
	public static void main(String[] args) {

		List collection = new LinkedList();
		collection.add(true);
		collection.add(true);
		collection.add(false);
		collection.add(false);
		collection.add(true);

		Collections.sort(collection);
		System.out.println(collection);


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
