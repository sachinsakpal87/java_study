package com.threading.ThreadChapA12.DeadLock;

public class App {

	public static void main(String[] args) throws InterruptedException {

		final Processor process = new Processor();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread2");
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread3");
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					process.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Thread3");
		long startTime = System.currentTimeMillis();
		long stopTime = 0;
		System.out.println();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		stopTime = System.currentTimeMillis();
		process.finished();
		System.out.println("Time elapsed : " + (stopTime - startTime));
	}
}
