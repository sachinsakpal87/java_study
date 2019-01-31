package com.collections.collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * In Set duplicate are not allowed
 * Tree hence Elements are in sorted order
 * Tree hence null is not allowed
 * slower than Hashset
 * Heterogenious object is not allowed it will throw ClassCastException
 */
public class DemoTreeSet {

	public static void main(String[] args) {

//        Below code will give ClassCastException as hestrogenious objects are not allowed
//        TreeSet set = new TreeSet();
//        set.add("temp");
//        set.add(1);

		//Set<Integer> objCollection = new
		SortedSet<Integer> objCollection = new TreeSet<Integer>();
		TreeSet obj = new TreeSet();
//        obj.add("Sachin");
//        obj.add(1);

		objCollection.add(9);
		objCollection.add(7);
		objCollection.add(8);
		objCollection.add(5);
		objCollection.add(6);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(1);
		objCollection.add(2);
//        objCollection.add(null);
		//objCollection.add(null);
		objCollection.add(6);

		TreeSet<String> objCollection1 = new TreeSet<String>();
		objCollection1.add("alive");
		objCollection1.add("is");
		objCollection1.add("awesome");

		System.out.println(objCollection1);
		System.out.println(objCollection);
		System.out.println(obj);
	}
}
