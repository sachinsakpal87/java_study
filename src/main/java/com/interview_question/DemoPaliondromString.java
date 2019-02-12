package com.interview_question;

import java.util.Scanner;

public class DemoPaliondromString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string_demo :: ");
		String str = scanner.next();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if (sb.toString().equals(str)) {
			System.out.println("Yeah..!!!");
		} else {
			System.out.println("Naa!!!!");
		}

//        char[] arr = str.toCharArray();
//        int cnt = arr.length / 2;
//        int i = 0;
//        boolean flag = true;
//        while (cnt > i) {
//            if (arr[cnt - i] != arr[cnt + i]) {
//                flag = false;
//            }
//            i++;
//
//        }
//        if (flag)
//            System.out.println("string_demo is paliondrom");
//        else
//            System.out.println("string_demo is not paliondrom");

		char[] arr = str.toCharArray();
		int mid = (arr.length / 2);
		int begin = 0;
		int end = arr.length - 1;
		boolean flag = true;
		for (int i = begin; i <= mid; i++) {
			if (arr[begin] == arr[end]) {
				begin++;
				end--;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("string_demo is paliondrom");
		} else {
			System.out.println("string_demo is not paliondrom");
		}

		char[] newArr = str.toCharArray();
		int length = newArr.length;
		boolean newFlag = false;
		for (int i = 0; i <= length / 2; i++) {
			if (newArr[i] == newArr[length - 1 - i]) {
				newFlag = true;
			} else {
				newFlag = false;
				break;
			}
		}

		if (newFlag) {
			System.out.println("string_demo is paliondrom");
		} else {
			System.out.println("string_demo is not paliondrom");
		}
	}
}
