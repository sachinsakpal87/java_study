package com.collections.collection;

import java.util.HashSet;

/**
 * In Set duplicate are not allowed
 * Hash hence order is not maintained
 * null is allowed
 * Faster than treeset
 *
 * hash set internal working
 * 1. When we add values to hash set it will internally create new hashmap and will store.
 * entered value as key to hashmap (as key are unique, values of hashset are unique)
 * 2. hash set will internally store "PRESENT" as a value for each key which will be used at the
 * the time of remove() function as remove returns boolean.
 * 3. return map.remove(o)==PRESENT; map.remove return value
 */
public class DemoHashSet {

	public static void main(String[] args) {
//:::::::::::::::::::::::::: Hashset add function returns boolean value ::::::::::::::::::::::::::://
		//Set<Integer> hashSet = new HashSet<Integer>();
		int [] a = {1,4,6,6,5};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        System.out.println(hashSet);

		System.out.println("Hashset add function returns `true` if value is not present :: "+hashSet.add(9));
//		System.out.println("Hashset add function returns `false` if value is present :: "+hashSet.add(9));
//		hashSet.add(7);
//		hashSet.add(8);
//		hashSet.add(5);
//		hashSet.add(6);
//		hashSet.add(3);
//		hashSet.add(4);
//		hashSet.add(1);
//		hashSet.add(2);
//		hashSet.add(null);	//Hashset accepts null value
//		hashSet.add(null);
//		hashSet.add(6);
//		hashSet.add("rrr");
//
//		System.out.println("Hashset remove function returns `true` if value is removed :: "+hashSet.remove(8));
//		System.out.println("Hashset remove function returns `false` if value is not present in hashset :: "+hashSet.remove(20));
//
//		hashSet.remove(6);
//
//		HashSet<String> objCollection1 = new HashSet<String>();
//		objCollection1.add("alive");
//		objCollection1.add("is");
//		objCollection1.add("awesome");
//
//
//
//
//
////        System.out.println(objCollection1);
////        System.out.println(hashSet);
////
//		Iterator<Integer> itr = hashSet.iterator();
////        while(itr.hasNext()){
////            System.out.println(itr.next());
////        }
//
//		itr.forEachRemaining(ti -> {
//			System.out.println(ti);
//		});
	}
}
