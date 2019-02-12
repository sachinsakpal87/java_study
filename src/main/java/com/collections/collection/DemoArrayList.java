package com.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * In List duplicates are allowed and Insertion order is maintained
 * Arraylist are not synchronized and hence not thread safe
 * can be synchronized by using collections.syncronized
 * Searching is faster in ArrayList
 * Insertion and deletion is slower as shifting is required.
 * Underline data structure is Resizable or growable array
 * it implements random access
 * Faster than Vector
 * increments 50% of current size
 * Allow duplicate and unsorted but ordered
 * Heterogenious objects are allowed
 * Null is allowed
 * default size is 10
 */

public class DemoArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> objCollection = new ArrayList<Integer>();
//		ArrayList<Integer> objCollection1 = new ArrayList<Integer>();
//		
//		Method[] methods =  objCollection.getClass().getMethods();
//		for (int i = 0; i < methods.length; i++) {
//			System.out.print(methods[i]+", ");
//		}
//		System.out.println();
//		Method[] methods1 =  objCollection1.getClass().getMethods();
//		for (int i = 0; i < methods1.length; i++) {
//			System.out.print(methods1[i]+", ");
//		}

		Collection s = new ArrayList<Integer>();

		System.out.println(objCollection);
		System.out.println();
		objCollection.add(1);
		objCollection.add(2);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(null);
		objCollection.add(5);
		objCollection.add(7);
		objCollection.add(7);
		objCollection.add(2);
		objCollection.add(3);
		objCollection.add(4);
		objCollection.add(7);
		objCollection.add(5);

//		objCollection.add(null);
//		objCollection.add(null);

		System.out.println("_________________________________________");
		System.out.println(" " + objCollection.toString());
		System.out.println("_________________________________________");

		System.out.println("Element at index 5 is " + objCollection);

		System.out.println("Element at index 5 is " + objCollection.get(5));
		System.out.println("First Index of 7 is " + objCollection.indexOf(7));
		System.out.println("Last Index of 7 is " + objCollection.lastIndexOf(7));
		System.out.println("Set 15 at index 9 " + objCollection.set(9, 15));
		System.out.println("Sub list from index 5 - 9 " + objCollection.subList(0, 12));

		if (objCollection.contains(5)) {
			System.out.println(" " + objCollection.toString());
		}

//		Iterator<Integer> itr  = objCollection.iterator();
//		while(itr.hasNext()){
//			int temp = itr.next();
//			if(temp==7){
//				itr.remove();
//			}else{
//				System.out.print("->"+temp);	
//			}
//		}
		System.out.println();
		System.out.println(" " + objCollection.toString());
		System.out.println(" " + objCollection.size());
		Object[] arr = new Object[objCollection.size()];
		arr = objCollection.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		Collections.synchronizedCollection(objCollection);
        Collections.sort(objCollection);
		System.out.println(" " + objCollection.toString());
		ArrayList<Integer> obj = new ArrayList<Integer>();

//		obj.add(null);
//		obj.add(null); 
//		obj.add(null);
//		obj.add(null);
//		obj.add(null);
//		obj.add(10);
//		obj.add(10);
//		obj.add(11);
//		obj.add(12);
//		obj.remove(1);

		System.out.println(" -> " + obj.toString());
		Iterator<Integer> itr123 = obj.iterator();
		while (itr123.hasNext()) {
			System.out.println(itr123.next().toString());
		}

		List<Integer> lst = new ArrayList<Integer>(10);

		lst.add(0, null);
		lst.add(1, null);
		lst.add(2, 5);
		lst.add(2, 6);
		lst.get(0);
		lst.remove(1);
		lst.get(1);

		lst.forEach(ele -> System.out.println("Element is " + ele));
	}
}
