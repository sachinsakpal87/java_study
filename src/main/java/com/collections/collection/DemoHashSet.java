package com.collections.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * In Set duplicate are not allowed
 * Hash hence order is not maintained
 * null is allowed
 * Faster than treeset
 */
public class DemoHashSet {

	public static void main(String[] args) {

		//Set<Integer> objCollection = new HashSet<Integer>();
		HashSet objCollection = new HashSet();
		objCollection.add(9);
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
		objCollection.add("rrr");

		HashSet<String> objCollection1 = new HashSet<String>();
		objCollection1.add("alive");
		objCollection1.add("is");
		objCollection1.add("awesome");

//        System.out.println(objCollection1);
//        System.out.println(objCollection);
//
		Iterator<Integer> itr = objCollection.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

		itr.forEachRemaining(ti -> {
			System.out.println(ti);
		});
	}
}
