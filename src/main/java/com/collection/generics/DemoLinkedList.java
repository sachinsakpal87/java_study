package com.collection.generics;

import java.util.Iterator;

class Node<T> {
	T data;
	Node next;

	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}
}

class List<T> implements Iterable {
	Node head;

	public void addRear(T data) {
		Node cache = head;
		if (cache == null) {
			head = new Node(data, null);
		} else {
			while (cache.next != null) {
				cache = cache.next;
			}
			cache.next = new Node(data, null);
		}
	}

	public void addFirst(int data) {
		head = new Node(data, head);
	}

	public void addAtPos(int data, int pos) {
		Node cache = head;
		Node temp = head;
		int cnt = 0;
		while (cnt != pos && cache.next != null) {
			temp = cache;
			cache = cache.next;
			cnt++;
		}
		if (cnt == pos) {
			if (cnt == 0) {
				addFirst(data);
			} else {
				temp.next = new Node(data, temp.next);
			}
		} else {
			cache.next = new Node(data, null);
		}
	}

	public void show() {
		Node cache = head;
		String separator = "";
		while (cache != null) {
			System.out.print(separator + cache.data);
			separator = "->";
			cache = cache.next;
		}
		System.out.println();
	}

	public void shiftHead(){
		Node cache= head;
		head = head.next;
		cache.next = null;
		cache.data = 0;
	}

	public void removeAtPos(int pos) {
		Node cache = head;
		Node temp = head;
		int cnt = 0;
		while (cnt != pos && cache.next != null) {
			temp = cache;
			cache = cache.next;
			cnt++;
		}
		if (cnt == pos) {
			if (cnt == 0) {
				shiftHead();
			} else {
				temp.next = temp.next.next;
			}
		} else {
			temp.next = null;
		}
	}

	public Iterator iterator() {
		return new DemoLinkedListIterator();
	}

	private class DemoLinkedListIterator implements Iterator {
		Node curr = head;
		public boolean hasNext() {
			return curr != null;
		}

		public T next() {
			T data = (T) curr.data;
			curr = curr.next;
			return data;
		}
	}
}

public class DemoLinkedList {
	public static void main(String[] args) {
		List<String> lst = new List();
		lst.addRear("a1");
		lst.addRear("2a");
		lst.addRear("3");
		lst.addRear("4");
		lst.addRear("a5");
		lst.removeAtPos(6);
		lst.show();
		Iterator itr = lst.iterator();
		while (itr.hasNext()){
			System.out.print(itr.next()+"->");
		}
	}
}
