package com.exception;

public class InterviewQuestionException {

	public static void main(String[] args) {
		InterviewQuestionException obj = new InterviewQuestionException();
		obj.fun1();
	}

	void fun() {
		throw new ArithmeticException();
	}

	//Below exception has to be thrown or else compile time error try removing throws
	void fun2() throws Exception {
		throw new Exception();
	}

	//Only one exception per try block
	void fun1() {
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("exception occurred in catch of fun1");
			try {
				fun();
				//System.out.println("exception occurred in try of fun1 method try-catch block");
				fun2(); //needs to be surrounded by try catch block.
			} catch (ArithmeticException ea) {
				System.out.println("Arithmetic exception occurred in catch of fun1 method try-catch block");
			} catch (Exception ea) {
				System.out.println("exception occurred in catch of fun1 method try-catch block");
			}
		}
	}
}
