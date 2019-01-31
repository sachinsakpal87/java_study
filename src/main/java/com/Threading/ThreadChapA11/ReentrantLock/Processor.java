package com.Threading.ThreadChapA11.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {
	private int cnt = 0;
	/**
	 * Reentrant lock is substitute to synchronized block
	 * user needs to create object of this lock and call .lock() method
	 */
	private Lock lock = new ReentrantLock();
	/**
	 * To use conditions in Reentrant lock use
	 * Condition object
	 */
	//private Condition cond = lock.newCondition();

	/**
	 * Function to increment the count value
	 * if the threads are not synchronized at the end incorrect
	 * value will be returned
	 */
	private void increment() {
		for (int i = 0; i < 10000; i++) {
			cnt++;
		}
	}

	void FirstThread() throws InterruptedException {
		/**
		 * acquire the lock
		 */
		lock.lock();
		/**Below code can be comment out
		 * used just to see the cond object use
		 * await is similar to wait in thread it wait till it gets notify
		 */
		//System.out.println("Waiting for 2nd Thread");
		//cond.await();
		//System.out.println("Wokeup");
		try {
			increment();
		} finally {
			/**Added in try catch block, so that no matter exception occured in increment method
			 * lock should be unblock
			 * must unlock after all tasked are completed
			 */
			lock.unlock();
		}
	}

	void SecondThread() throws InterruptedException {
		/**
		 * Sleep added to confirm First Thread should start first
		 */
		Thread.sleep(1000);
		/**
		 * acquire the lock
		 */
		lock.lock();
		//System.out.println("Press Enter to resume");
		//new Scanner(System.in).nextLine();
		//System.out.println("Key is pressed...!!");
		//cond.signal();
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	void callAfter() {
		System.out.println("Final Count is : " + cnt);
	}
}
