package com.lambda_java8;

interface IPrint{
	void print(String str);
}

class PrintImpl implements IPrint{
	public void print(String str) {
		System.out.println("Print Implementation with str := "+str);
	}
}

public class DemoLambdaEx2 {
	public static void main(String[] args) {
		PrintImpl print = new PrintImpl();
		print.print("Hello !!! Sachin");

//		PrintImpl = public void print(String str) {
//			System.out.println("Print Implementation with str := "+str);
//		};

		IPrint printNew = (str) -> System.out.println("Print Implementation with str := "+str);
		printNew.print("Hello !!! JAVA 8");
	}
}
