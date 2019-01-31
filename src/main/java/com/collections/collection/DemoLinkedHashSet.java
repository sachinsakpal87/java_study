package com.collections.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * In LinkedHashSet duplicate are not allowed
 * Linked hence Order is maintained
 * null is allowed
 * Faster than TreeSet
 */
public class DemoLinkedHashSet {

	public static void main(String[] args) {

		//Set<Integer> objCollection = new HashSet<Integer>();
		LinkedHashSet<Integer> objCollection = new LinkedHashSet<Integer>();
		objCollection.add(9);
		objCollection.add(7);
		objCollection.add(8);
		objCollection.add(5);
		objCollection.add(6);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(1);
		objCollection.add(2);
		objCollection.add(null);
		objCollection.add(null);
		objCollection.add(6);

		LinkedHashSet<String> objCollection1 = new LinkedHashSet<String>();
		objCollection1.add("alive");
		objCollection1.add("is");
		objCollection1.add("awesome");

		System.out.println(objCollection1);
		System.out.println(objCollection);

		Iterator<Integer> iterator = objCollection.iterator();
		iterator.forEachRemaining(it -> {
			System.out.println(it);
		});

//        while (iterator.hasNext()){
//            System.out.println(" Value is"+iterator.next());
//        }

	}
}
