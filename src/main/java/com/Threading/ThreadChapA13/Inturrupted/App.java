package com.threading.ThreadChapA13.Inturrupted;

import java.util.Random;

public class App {

	public static void main(String args[]) {
		final Random random = new Random();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Starting The Thread....");
				for (int i = 0; i < 1E8; i++) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Thread is inturrupted");
						break;
					}

					Math.sin(random.nextDouble());
				}
				System.out.println("Ending The Thread....");
			}
		});
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.interrupt();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
