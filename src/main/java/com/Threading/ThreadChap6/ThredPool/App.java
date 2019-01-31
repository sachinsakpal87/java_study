package com.Threading.ThreadChap6.ThredPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

	private int id;

	Processor(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting : " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed : " + id);
	}
}

public class App {

	public static void main(String args[]) {
		/**
		 * Here we are defining a Threadpool of size 2 which means
		 */
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			/**
			 * assign task to each process
			 */
			executor.submit(new Processor(i));
		}
		/**
		 * This will not shutdown immedeatly it will wait for
		 * all threads to complete		 *
		 */
		executor.shutdown();

		System.out.println("All tasked submitted");

		/**
		 * It will wait for all executor threads to complete the task
		 * before proceeding with next statement i.e. next sysout mentioned below
		 */
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasked completed");
	}
}
