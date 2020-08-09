package com.collections.collection;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> objCollection = new Stack<Integer>();
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
		System.out.println(objCollection.push(9)+" Pushed value");
		System.out.println(objCollection.push(9)+" Pushed value");
		objCollection.push(10);
		System.out.println(objCollection.pop());
		System.out.println("_________________________________________");
		System.out.println(" " + objCollection.toString());
		System.out.println("_________________________________________");
		objCollection.push(9);
	}
}
