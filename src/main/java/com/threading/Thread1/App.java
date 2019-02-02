package com.threading.Thread1;

class Test extends Thread {

	Test(String str) {
		super(str);
	}
}

public class App {

	public static void main(String args[]) {
		new Test("Test1").start();
		new Test("Test2").start();
		System.out.println("Hello");
	}
}
