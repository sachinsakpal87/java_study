package com.threading.Thread;

class TestClass implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Child Thread is Running");
		}
	}
}

public class RunnableDemo {
	public static void main(String args[]) {

		TestClass obj = new TestClass();
		Thread t = new Thread(obj);
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread is Running");
		}
	}
}
