package com.threading.ThreadChap5.Synchonized;

//import java.util.concurrent.atomic.AtomicInteger;

public class App {

	/**
	 * Atomic int increases the count in 1 step
	 * where as count++ takes 3 steps
	 */
	//private AtomicInteger count = new AtomicInteger(0);
	private int count = 0;
	private int count1 = 0;
	private int count2 = 0;

	public static void main(String args[]) {

		App app = new App();
		app.doWork();
	}

	/**
	 * if method is declare as synchronized
	 * Then only one method can have access to that block
	 */
	public synchronized void increment() {
		count1++;
	}

	public void doWork() {
		final Object lock = new Object();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					synchronized (lock) {
						count++;
					}
					count2++;
					increment();
					//count.incrementAndGet();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					synchronized (lock) {
						count++;
					}
					count2++;
					increment();
					//count.incrementAndGet();
				}
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Count with synchonized block is " + count);
		System.out.println("Count with synchonized method is " + count1);
		System.out.println("Count without synchonized is " + count2);
	}
}
