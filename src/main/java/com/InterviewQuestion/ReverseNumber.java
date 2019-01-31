package com.InterviewQuestion;

public class ReverseNumber {

	public static void main(String args[]) {

		/**
		 * Reverse the number
		 */
//        int result = 0;
//        int number = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number :: ");
//        number = scanner.nextInt();
//        while (number > 0) {
//            result = number % 10 + result * 10;
//            number = number / 10;
//        }
//        System.out.println(result);

		int num = 4;
		boolean flag = true;
		for (int i = 1; i < 20; i++) {
			int b = i % num;
			if (b == 0) {
				flag = false;
				b = ((i / num) * num) / (i / num);
			}
			System.out.println(i + "%4 \t" + b);
		}
	}
}
