package com.interview_question;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CandyDist {

	public static int calcMaxCandy(LinkedList<Integer> lst, int N) {
		int finalCandyCnt = 0;
		int candyEach = 1;
		int i = 0;
		int last = Integer.MAX_VALUE, first;
		ListIterator<Integer> itr = lst.listIterator();
		List<Integer> candyList = new LinkedList<Integer>();
		while (itr.hasNext()) {
			first = itr.next();
			if (first > last) {
				i++;
				candyList.add(candyEach + i);
			}
			if (first <= last) {
				i = 0;
				candyList.add(candyEach + i);
			}
			last = first;
		}
		ListIterator<Integer> itr2 = candyList.listIterator();
		while (itr2.hasNext()) {
			finalCandyCnt += itr2.next();
		}

		return finalCandyCnt;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		LinkedList<Integer> lst = new LinkedList<Integer>();
		int cnt = N;
		while (cnt > 0) {
			lst.add(scanner.nextInt());
			cnt--;
		}
		//Collections.sort(lst);
		int maxCandy = calcMaxCandy(lst, N);
		System.out.println(maxCandy);
	}
}
