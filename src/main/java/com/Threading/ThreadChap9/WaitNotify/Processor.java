package com.Threading.ThreadChap9.WaitNotify;

import java.util.Scanner;

public class Processor {

	public void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer Thread running....");
			/**
			 * It waits only called between synchronized block
			 */
			wait();
			System.out.println("Resumed...");
		}
	}

	public void consumer() throws InterruptedException {
		Scanner scan = new Scanner(System.in);

		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for return Key....");
			scan.nextLine();
			System.out.println("Return Key pressed....");
			/**
			 * It will notify the waiting thread to wakeup
			 * It will not hand over the control waiting thread it will wait till
			 * This thread finishes its job
			 */
			notify();
			Thread.sleep(5000);
		}
	}
}
