package com.Threading.ThreadChapA14.ThreadLocal;

import java.util.Random;

public class App {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable obj = new MyRunnable();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		@Override
		public void run() {

			threadLocal.set((new Random().nextInt(100)));
			try {
				//		Thread.sleep(5000);
			} catch (Exception e) {

			}
			System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		}
	}
}
