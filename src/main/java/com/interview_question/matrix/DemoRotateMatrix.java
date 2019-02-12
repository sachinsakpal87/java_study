package com.interview_question.matrix;

import java.util.Scanner;

public class DemoRotateMatrix {

	static int size;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the matrix size :: ");
		size = Integer.parseInt(scanner.next());
		int[][] arr = new int[size][size];
		System.out.println("Enter the matrix ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		printMatrix(arr);
		rotateMatrix(arr, size, size);
		printMatrix(arr);
	}

	private static void rotateMatrix(int[][] arr, int size, int size1) {
		int m = 0, n = 0;
		int endr = size;
		int endc = size1;
		int prev, curr = 0;

		while (m < endr && n < endc) {

			if (m + 1 == endr || n + 1 == endc) {
				break;
			}

			prev = arr[m + 1][n];
			for (int i = m; i < endc; i++) {
				curr = arr[m][i];
				arr[m][i] = prev;
				prev = curr;
			}
			n++;

			printMatrix(arr);

			for (int i = n; i < endr; i++) {
				curr = arr[i][endc - 1];
				arr[i][endc - 1] = prev;
				prev = curr;
			}
			endc--;

			printMatrix(arr);

			for (int i = endc - 1; i >= m; i--) {
				curr = arr[endr - 1][i];
				arr[endr - 1][i] = prev;
				prev = curr;
			}
			endr--;
			printMatrix(arr);

			for (int i = endr - 1; i >= n; i--) {
				curr = arr[i][m];
				arr[i][m] = prev;
				prev = curr;
			}
			m++;
			printMatrix(arr);
		}
	}

	private static void printMatrix(int[][] arr) {
		System.out.println();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
