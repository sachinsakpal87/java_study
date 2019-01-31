package com.collections.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 * In List duplicates are allowed and Insertion order is maintained
 * Vector are synchronized and hence thread safe
 * Slower than array list
 * double the actual size size
 */
public class DemoVectorList {

	public static void main(String[] args) {

		//List<Integer> objCollection = new Vector<Integer>();
		Vector<Integer> objCollection = new Vector<Integer>();
		//System.out.println(objCollection.capacity());
		System.out.println();
		//objCollection.
		objCollection.add(1);
		objCollection.add(2);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(5);
		objCollection.add(7);
		objCollection.add(7);
		objCollection.add(2);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(7);
		objCollection.add(5);
		objCollection.add(null);
		objCollection.add(5);
		System.out.println("_________________________________________");
		System.out.println(" " + objCollection.toString());
		System.out.println("_________________________________________");

		if (objCollection.contains(5)) {
			System.out.println(" " + objCollection.toString());
		}

		Iterator<Integer> itr = objCollection.iterator();
		while (itr.hasNext()) {
			int temp = itr.next();
			if (temp == 7) {
				itr.remove();
			} else {
				System.out.println("->" + temp);
			}
		}
		System.out.println(" " + objCollection.toString());
		System.out.println(" " + objCollection.size());
		Object[] arr = new Object[objCollection.size()];
		arr = objCollection.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}

		Collections.sort(objCollection);
		System.out.println(" " + objCollection.toString());
	}
}
