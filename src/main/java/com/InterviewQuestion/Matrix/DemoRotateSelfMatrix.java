package com.InterviewQuestion.Matrix;

public class DemoRotateSelfMatrix {
	public static void main(String[] args) {
		int [][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		show(arr);

		rotateMatrixBy90(arr);
	}

	private static void show(int[][] arr) {
		for(int [] a : arr){
			for (int i : a){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void rotateMatrixBy90(int[][] arr) {
		int c=0,r=0,ce=arr.length-1,re=arr.length-1;

		for (int j=0; j<(arr.length)/2;j++) {
			for (int i = j; i < arr.length- 1-j; i++) {
				int temp = arr[r+j][c + i];
				arr[r+j][c + i] = arr[r + i][ce-j];
				arr[r + i][ce-j] = arr[re-j][ce - i];
				arr[re-j][ce - i] = arr[re - i][c+j];
				arr[re - i][c+j] = temp;
				show(arr);
			}
		}

	}

}