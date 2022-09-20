package com.algos.doubly_linked_list;


import java.util.Iterator;

public class DemoDoublyLinkedList {

	public static void main(String[] args) {
		List<Number> lst = new List<Number>();
		lst.addFirst(5);
		lst.addFirst(4);
		lst.addFirst(3);
		lst.addRear(7);
		lst.addRear(8);
		lst.addRear(9);
		lst.display();
		try {
			lst.InsertAt(15, 2);
			lst.InsertAt(13, 0);
			lst.InsertAt(14, 8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		lst.display();
		lst.RemoveAt(2);
		lst.display();

		Iterator itr = lst.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " -> ");
		}
	}
}
