package com.Threading.ThreadChapA10.WaitNotifyProducerConsumerProgram;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
	private final int SIZE = 10;
	/**
	 * Always create new lock object to get internal lock
	 */
	Object lock = new Object();
	/**
	 * Linked list is not synchronized used in this example to
	 * overcome consumer producer issue in Legacy ways
	 */
	private LinkedList<Integer> lst = new LinkedList<Integer>();

	/**
	 * Job of this method to produce the input
	 * It will add the element in the list
	 *
	 * @throws InterruptedException
	 */
	public void producer() throws InterruptedException {
		int value = 0;
		while (true) {
			/**
			 * synchronized block so that one thread can
			 * have the lock at a time
			 * only one thread can enter in synchronized block
			 */
			synchronized (lock) {
				/**
				 * if List is Full then wait till consumer consume few
				 * values and notify
				 */
				while (lst.size() == SIZE) {
					lock.wait();
				}
				lst.add(value++);
				lock.notify();
			}
		}
	}

	public void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			/**
			 * synchronized block so that one thread can
			 * have the lock at a time
			 * only one thread can enter in synchronized block
			 */
			synchronized (lock) {
				/**
				 * if List is empty then wait till producer produce few
				 * values and notify
				 */
				while (lst.size() == 0) {
					lock.wait();
				}
				System.out.print("Size of the list is : " + lst.size());
				/**
				 * remove first is used as incremental value is used in a list
				 * should work as FIFO manner
				 */
				int value = lst.removeFirst();
				System.out.println("; consumed value is : " + value);
				lock.notify();
			}
			/**
			 * Thread.sleep so that user can view the output in console
			 */
			Thread.sleep(random.nextInt(1000));
		}
	}
}
