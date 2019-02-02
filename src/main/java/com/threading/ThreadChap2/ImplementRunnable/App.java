package com.threading.ThreadChap2.ImplementRunnable;

class Runner implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + Thread.activeCount() + " ");
			//System.out.print(" "+Thread.y);
			System.out.println("Hello " + i + " " + Thread.currentThread().getName());
			//System.out.print(" "+Thread.MAX_PRIORITY);

		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class App {

	public static void main(String args[]) {

		Runnable obj = new Runner();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();
	}
}
