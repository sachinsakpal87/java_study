package com.InterviewQuestion;

import java.util.Scanner;

public class Sherlock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int cntfive = 0;
		int cntThree = 0;
		int cnt = 0;
		String[] arr = new String[T];
		while (T > 0) {
			int N = scanner.nextInt();
			StringBuilder result = new StringBuilder();
			int ren = -1;
			if (N >= 5) {
				ren = N - 5;
				while (ren >= 5 || ren == 0) {
					result.insert(0, "33333");
					cntThree += 5;
					//System.out.print("3");
					N = N - 5;
					ren = N - 5;
				}
			}
			if (N >= 3) {
				ren = N - 3;
				while (ren >= 3 || ren == 0) {
					//cntfive+=3;
					//System.out.print("5");
					result.insert(0, "555");
					N = N - 3;
					ren = N - 3;
				}
			}
			if (N > 1 || ren == -1) {
				//System.out.println("-1");
				result.append("-1");
			}

			arr[cnt] = result.toString();
			cnt++;
			T--;
		}
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i++]);
		}
	}
}
