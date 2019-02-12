package com.interview_question;

import java.util.ArrayList;
import java.util.List;

public class DemoListPalindrome {
	public static void main(String[] args) {
		List lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(3);
		lst.add(2);
		lst.add(1);

		int mid = (lst.size() / 2);
		int begin = 0;
		int end = lst.size() - 1;
		for (int i = begin; i <= mid; i++) {
			if (lst.get(i).equals(lst.get(end - i))) {
//                begin++;
//                end--;
			} else {
				System.out.println("not");
				break;
			}
		}
	}
}
