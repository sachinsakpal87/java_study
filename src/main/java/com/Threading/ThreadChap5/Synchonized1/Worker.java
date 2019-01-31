package com.Threading.ThreadChap5.Synchonized1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Here is how lock works
 * if in project there are two threads and if we create one lock then one thread
 * can acquire one lock at a time 2nd thread will be ideal at that time
 * if we create two lock and used in two different synchronized block then
 * one thread will acquire one lock and another thread will acquire another lock
 */
public class Worker {

	private static final int _100 = 100;
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private Random random = new Random();
	private List<Integer> lst1 = new ArrayList<Integer>();
	private List<Integer> lst2 = new ArrayList<Integer>();

	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lst1.add(random.nextInt(_100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lst2.add(random.nextInt(_100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {
		System.out.println("Starting..!!!");
		long start = System.currentTimeMillis();

		//process();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
		});
		t.start();
		t2.start();
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken....." + (end - start));
		System.out.println("List1: " + lst1.size() + "; List2: " + lst2.size());
	}
}
