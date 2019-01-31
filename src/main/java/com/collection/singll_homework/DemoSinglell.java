package com.collection.singll_homework;

import java.util.Iterator;

public class DemoSinglell {
	public static void main(String args[]) {
		List lst = new List();
		lst.addRear(1);
		lst.addRear(2);
		lst.addRear(3);
		lst.addRear(4);
		lst.addRear(5);
		lst.addRear(6);
		lst.addRear(7);
		lst.displayLst();
		lst.addFirst(9);
		lst.displayLst();
		lst.insterAtPos(8, 4);
		lst.displayLst();
		lst.removeAtPos(8, 4);
		lst.displayLst();
		Iterator<Integer> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "->");
		}
	}
}
