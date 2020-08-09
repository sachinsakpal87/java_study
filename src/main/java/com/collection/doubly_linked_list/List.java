package com.collection.doubly_linked_list;

import java.util.Iterator;

import org.apache.commons.lang3.NotImplementedException;

public class List implements Iterable<Integer> {
	Node start, end;

	public void addRear(int data) {
		Node cache = new Node(data, null, null);
		if (end != null) {
			cache.prev = end;
			end.next = cache;
		}
		end = cache;
		if (start == null) {
			start = cache;
		}
	}

	public void addFirst(int data) {
		Node cache = new Node(data, null, null);
		if (start != null) {
			cache.next = start;
			start.prev = cache;
		}
		start = cache;
		if (end == null) {
			end = start;
		}
	}

	public void InsertAt(int data, int pos) throws Exception {
		Node cache = new Node(data, null, null);
		Node tmp = start;
		int cnt = 0;
		while (tmp != null && cnt != pos) {
			tmp = tmp.next;
			cnt++;
		}
		if (tmp != null) {
			if (tmp.prev != null && tmp.next != null) {
				cache.prev = tmp.prev;
				cache.prev.next = cache;
				cache.next = tmp;
				cache.next.prev = cache;
			} else if (tmp.prev == null) {
				addFirst(data);
			} else if (tmp.next == null) {
				addRear(data);
			}
		} else {
			throw new Exception("Invalid Position ::" + pos);
		}
	}

	public void RemoveAt(int pos) {
		Node tmp = start;
		int cnt = 0;
		while (tmp != null && cnt != pos) {
			tmp = tmp.next;
			cnt++;
		}
		tmp.prev.next = tmp.next;
		tmp.next.prev = tmp.prev;
		tmp.prev = null;
		tmp.next = null;
		tmp.data = 0;
	}

	public void display() {
		Node cache = start;
		while (cache != null) {
			System.out.print(cache.data + " -> ");
			cache = cache.next;
		}
		System.out.println();
	}

	@Override
	public Iterator<Integer> iterator() {

		return new DoublyLinkedList();
	}

	private class DoublyLinkedList implements Iterator<Integer> {
		Node current;

		DoublyLinkedList() {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		public boolean hasPrev() {
			return current.prev != null;
		}

		@Override
		public Integer next() {
			if (hasNext()) {
				Integer result = current.data;
				current = current.next;
				return result;
			}
			return -1;
		}

		public Integer Prev() {
			if (hasPrev()) {
				Integer result = current.data;
				current = current.prev;
				return result;
			}
			return -1;
		}

		@Override
		public void remove() {
			throw new NotImplementedException("Implementation not there");
		}
	}
}
