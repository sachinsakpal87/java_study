package com.threading.ThreadChapA12.DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {

	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	public void firstThread() throws InterruptedException {
		//Thread.sleep(10000);
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			lock1.lock();
			//lock2.lock();
			try {
				//Thread.sleep(100);
				System.out.println("Running Thread in firstThread() is" + Thread.currentThread());
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				//lock2.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			lock1.lock();
			//lock1.lock();
			try {
				//Thread.sleep(100);
				System.out.println("Running Thread in secondThread() is" + Thread.currentThread());
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				//lock1.unlock();
			}
		}
	}

	public void finished() throws InterruptedException {

		System.out.println("Account 1 balance: " + acc1.getBalance());
		System.out.println("Account 2 balance: " + acc2.getBalance());
		System.out.println("Total balance: " + (acc1.getBalance() + acc2.getBalance()));
	}
}
