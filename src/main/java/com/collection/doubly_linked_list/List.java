package com.collection.doubly_linked_list;

import java.util.Iterator;

import org.apache.commons.lang3.NotImplementedException;

public class List implements Iterable<Integer> {
	Node start, end;

	public void addRear(int data) {
		Node cache = new Node(data, null, null);
		if (end != null) {
			cache.prevNode = end;
			end.nextNode = cache;
		}
		end = cache;
		if (start == null) {
			start = cache;
		}
	}

	public void addFirst(int data) {
		Node cache = new Node(data, null, null);
		if (start != null) {
			cache.nextNode = start;
			start.prevNode = cache;
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
			tmp = tmp.nextNode;
			cnt++;
		}
		if (tmp != null) {
			if (tmp.prevNode != null && tmp.nextNode != null) {
				cache.prevNode = tmp.prevNode;
				cache.prevNode.nextNode = cache;
				cache.nextNode = tmp;
				cache.nextNode.prevNode = cache;
			} else if (tmp.prevNode == null) {
				addFirst(data);
			} else if (tmp.nextNode == null) {
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
			tmp = tmp.nextNode;
			cnt++;
		}
		tmp.prevNode.nextNode = tmp.nextNode;
		tmp.nextNode.prevNode = tmp.prevNode;
		tmp.prevNode = null;
		tmp.nextNode = null;
		tmp.data = 0;
	}

	public void display() {
		Node cache = start;
		while (cache != null) {
			System.out.print(cache.data + " -> ");
			cache = cache.nextNode;
		}
		System.out.println();
	}

	@Override
	public Iterator<Integer> iterator() {

		return new DoublyLinkedList();
	}

	private class DoublyLinkedList implements Iterator<Integer> {
		Node currentNode;

		DoublyLinkedList() {
			currentNode = start;
		}

		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		public boolean hasPrev() {
			return currentNode.prevNode != null;
		}

		@Override
		public Integer next() {
			if (hasNext()) {
				Integer result = currentNode.data;
				currentNode = currentNode.nextNode;
				return result;
			}
			return -1;
		}

		public Integer Prev() {
			if (hasPrev()) {
				Integer result = currentNode.data;
				currentNode = currentNode.prevNode;
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
