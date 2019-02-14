/**
 * In List duplicates are allowed and Insertion order is maintained
 * Linkedlist are not synchronized and hence not thread safe
 * can be synchronized by using collections.syncronized
 * Searching is slower in ArrayList
 * Insertion and deletion is faster in linked list as.
 * Underline data structure is DoublyLinkedList
 * it does not implements random access
 * Faster than Vector
 */

package com.collections.collection;

import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> objCollection = new LinkedList<Integer>();
		LinkedList<Integer> objCollection1 = new LinkedList<Integer>();
//		Class objt = objCollection.getClass();
//		System.out.println(""+objt.getName());
//		Method[] methods =  objt.getMethods();
//		for (int i = 0; i < methods.length; i++) {
//			System.out.print(methods[i]+", ");
//		}
//		System.out.println();
//		Class objt1 = objCollection1.getClass();
//		System.out.println(""+objt1.getName());
//		Method[] methods1 =  objt1.getMethods();
//		for (int i = 0; i < methods1.length; i++) {
//			System.out.print(methods1[i]+", ");
//		}
		System.out.println();

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
		objCollection.add(null);
		objCollection.add(null);
		objCollection.get(5);

		System.out.println("_________________________________________");
		System.out.println(" " + objCollection.toString());
		System.out.println("_________________________________________");

		System.out.println();
		System.out.println("Element at index 12 is " + objCollection.get(12));
//		System.out.println("Element at index 12 is "+objCollection.);
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
//				System.out.println("->"+temp);	
//			}
//		}
		for (Integer obj : objCollection) {
			System.out.println("-->" + obj);
		}
		System.out.println(" " + objCollection.toString());
		System.out.println(" " + objCollection.size());
		Object[] arr = new Object[objCollection.size()];
		arr = objCollection.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("-->" + arr[i]);
		}

		Collections.synchronizedCollection(objCollection);
		//Collections.sort(objCollection);
		//System.out.println(" "+objCollection.toString());

	}
}
