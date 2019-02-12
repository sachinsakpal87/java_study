package com.interview_question.matrix;

public class DemoRotateMatrix90 {
	public static void rotate(String[][] arr){
		String rotated [][] = new String[arr[0].length][arr.length];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[0].length; j++){
				if(arr[i][j]!=">") {
					rotated[j][arr.length - 1 - i] = arr[i][j];
				}else {
					rotated[j][arr.length - 1 - i] = "^";
				}
			}
		}

		for (String[]spe_a : rotated){
			for (String spe : spe_a ){
				System.out.print(spe+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		String arr[][] = {
				{"*","*","*"},{"*","*","*"},{">",">",">"},{"*","*","*"},{"*","*","*"},
		};

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		for (String[]spe_a : arr){
			for (String spe : spe_a ){
				System.out.print(spe+" ");
			}
			System.out.println();
		}
		System.out.println();
		rotate(arr);

	}
}
