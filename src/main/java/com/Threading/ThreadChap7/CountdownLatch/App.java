package com.threading.ThreadChap7.CountdownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {

	/**
	 * No need to use synchronized keyword as the CountDownLatch class is thread safe
	 */
	private CountDownLatch latch;

	Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Started....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * Whenever below method is called the value of latch is decreases by 1
		 */
		latch.countDown();
		System.out.println("End....");
	}
}

public class App {

	public static void main(String args[]) {
		CountDownLatch latch = new CountDownLatch(1);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 9; i++) {
			executor.submit(new Processor(latch));
		}

		try {
			/**
			 * It waits until the countDown latch count down to zero
			 */
			latch.await();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Completed..!!!");
	}
}
