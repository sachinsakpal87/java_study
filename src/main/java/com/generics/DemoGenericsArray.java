package com.generics;

class GenericArray {

	<T> void show(T[] arr) {
		for (T item : arr) {
			System.out.print(item.toString() + " ");
		}
		System.out.println();
	}
}

public class DemoGenericsArray {
	public static void main(String[] args) {
		final GenericArray genericArray = new GenericArray();
//        int [] arr = {1,2,3,4,5}; Generics can't be applied to primitive
		genericArray.show(new Integer[] { 1, 2, 3, 4, 5 });
		genericArray.show(new String[] { "test1", "test2", "test3", "test4", "test5" });
	}
}
