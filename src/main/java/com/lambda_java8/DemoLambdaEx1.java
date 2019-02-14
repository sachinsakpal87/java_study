package com.lambda_java8;

interface Ishow{
	void show();
}

class ShowImpl implements Ishow{
	public void show() {
		System.out.println("Show Implementation");
	}
}

public class DemoLambdaEx1 {
	public static void main(String[] args) {
		Ishow show = new ShowImpl();
		show.show();

//		Ishow ishow = public void show() {
//			System.out.println("Show Implementation");
//		};

		Ishow ishow = () -> System.out.println("Show JAVA 8 Implementation");
		ishow.show();
	}
}
