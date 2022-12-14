package com.threading.ThreadChap9.WaitNotify;

public class App {

	public static void main(String args[]) throws InterruptedException {
		final Processor obj = new Processor();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					obj.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					obj.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
