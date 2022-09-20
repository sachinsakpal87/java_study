package com.algos.singular_linked_list;

public class DemoLinkedList {
	public static void main(String args[]) {
//		LinkedList<Integer> linkedlst = new LinkedList<Integer>();
//		linkedlst.addLast(4);
//		linkedlst.addLast(5);
//		linkedlst.addLast(6);
//		linkedlst.addLast(7);
//		linkedlst.addLast(8);
//		System.out.println(linkedlst);
//		linkedlst.add(0, 14);
//		System.out.println(linkedlst);

		List lst = new List();
		//lst.AddFirst(3);
		//lst.AddFirst(2);
		lst.AddRear(4);
		lst.AddRear(5);
		lst.AddRear(6);
		lst.AddRear(7);
		lst.AddRear(8);
//		lst.AddFirst(1);
		lst.Display();
//		lst.insertAt(14, 0);
//		lst.Display();
//		lst.insertAt(14, 6);
//		lst.Display();
//		lst.removeAt(4);
//		lst.Display();
//		lst.removeAt(0);
		lst.rearrangeList();
		lst.Display();
//		lst.insertAt(12, 0);
//		lst.Display();
//		lst.removeAt(3);
//		lst.Display();
//		lst.shiftHead();
//		lst.Display();
//		List Revlst = lst.reverse();
//		Revlst.Display();
//		List copyList = lst.Deepcopy();
//		copyList.Display();
//
//		Iterator<Integer> itr = lst.iterator();
//		 while(itr.hasNext())
//	         System.out.print(itr.next() + " -> ");
//	      System.out.println();
	}
}
