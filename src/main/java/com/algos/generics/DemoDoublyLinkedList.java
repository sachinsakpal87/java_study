package com.algos.generics;

import java.util.Iterator;
import java.util.LinkedList;

class NodeD<T>{
	T data;
	NodeD prev, next;

	public NodeD(T data, NodeD prev, NodeD next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}

class ListD<T> implements Iterable {
	NodeD head, tail;

	public void addRear(T data){
		NodeD cache = new NodeD(data,null,null);
		if(tail ==null){
			tail = cache;
			head = cache;
		}else {
			cache.prev = tail;
			cache.prev.next = cache;
			tail = cache;
		}
	}

	public void addFront(T data){
		NodeD cache = new NodeD(data,null,null);
		if(head ==null){
			head = cache;
			tail = cache;
		}else {
			cache.next = head;
			cache.next.prev = cache;
			head =cache;
		}
	}

	public void addAtPos(T data,int pos){
		NodeD cache = new NodeD(data,null,null);
		NodeD tmp = head;
		NodeD slow = head;
		int cnt = 0;
		while (cnt != pos && tmp.next !=null){
			slow = tmp;
			tmp = tmp.next;
			cnt++;
		}
		if (cnt == pos) {
			if (cnt == 0) {
				addFront(data);
			} else {
				cache.next = slow.next;
				cache.next.prev = cache;
				cache.prev = slow;
				cache.prev.next  = cache;
			}
		} else {
			addRear(data);
		}
	}

	public void show(){
		NodeD cache = head;
		while (cache != null){
			System.out.print(cache.data+"->");
			cache = cache.next;
		}
		System.out.println();
	}

	public void shiftHead(){
		head = head.next;
		head.prev = null;
	}

	public void shiftTail(){
		tail = tail.prev;
		tail.next = null;
	}
	public void removeAtPos(int pos){
		NodeD tmp = head;
		NodeD slow = head;
		int cnt = 0;
		while (cnt != pos && tmp.next !=null){
			slow = tmp;
			tmp = tmp.next;
			cnt++;
		}
		if (cnt == pos) {
			if (cnt == 0) {
				shiftHead();
			} else {
				slow.next =slow.next.next;
				if(slow.next !=null) {
					slow.next.prev = slow;
				}
			}
		} else {
			shiftTail();
		}
	}

	public Iterator iterator() {
		return new DemoDoublyLinkedListIterator();
	}

	private class DemoDoublyLinkedListIterator implements Iterator {

		NodeD curr = head;

		public boolean hasPrev() {
			return curr.prev !=null;
		}

		public boolean hasNext() {
			return curr != null;
		}

		public Object next() {
			T data = (T) curr.data;
			curr = curr.next;
			return data;
		}

		public Object prev() {
			T data = (T) curr.data;
			curr = curr.prev;
			return data;
		}
	}
}

public class DemoDoublyLinkedList {
	public static void main(String[] args) {

		ListD<String> listD = new ListD();
		listD.addRear("1");
		listD.addRear("2");
		listD.addRear("3");
		listD.addRear("4ds");
		listD.addRear("5");
		listD.show();
		listD.removeAtPos(4);
		listD.show();

		Iterator itr =  listD.iterator();
		while (itr.hasNext()){
			System.out.print(itr.next()+"->");
		}

	}
}
