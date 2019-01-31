package com.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.PriorityBlockingQueue;

public class DemoPriorityQueue {

	public static void main(String args[]) throws InterruptedException {
//
//        double ended queue can remove form both ends
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.add(1);
//        arrayDeque.add(2);
//        arrayDeque.add(3);
//        arrayDeque.add(4);

		PriorityBlockingQueue<String> objCollection = new PriorityBlockingQueue<String>();
		objCollection.add("alive");
		objCollection.add("is");
		objCollection.add("awesome");
		objCollection.put("Sachin");
		System.out.println(objCollection);
		System.out.println(objCollection.peek());
		System.out.println(objCollection.poll());
		System.out.println(objCollection.poll());
		objCollection.add("alive");
		objCollection.add("awesome");
		Collection<String> c = new ArrayList<String>();
		objCollection.drainTo(c);
		System.out.println(c);
		System.out.println(objCollection.take());
	}
}
