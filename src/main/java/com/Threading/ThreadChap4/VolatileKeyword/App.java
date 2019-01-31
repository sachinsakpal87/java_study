package com.Threading.ThreadChap4.VolatileKeyword;

import java.util.Scanner;

class Processor extends Thread {
	/**
	 * So in some system Java caches the variable here running and assume that it will always
	 * be true so it may be possible that program won't stop when we hit the enter key
	 * as value of running will never change.
	 * So when we add volatile keyword we tell JVM not to cache the value of running
	 * which means when we hit Enter program will guarantee to stop
	 * <p>
	 * Volatile prevent variable to get cached when it is in the running
	 */
	private volatile boolean running = true;

	//private boolean running =  true;
	public void run() {
		while (running) {
			System.out.println("Hello");

//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	public void shutdown() {
		running = false;
	}
}

public class App {

	public static void main(String args[]) {

		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press return to stop ....");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		proc1.shutdown();
	}
}
