package com.algos.singll_homework;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.NotImplementedException;

class List implements Iterable<Integer> {
	Node head;

	void addRear(int data) {
		Node cache = head;
		if (cache == null) {
			head = new Node(data, null);
		} else {
			while (cache.nextNode != null) {
				cache = cache.nextNode;
			}
			cache.nextNode = new Node(data, null);
		}
	}

	void addFirst(int data) {
		Node cache = head;
		head = new Node(data, cache);
	}

	void insterAtPos(int data, int pos) {
		Node cache = head;
		int cnt = 0;
		while (cache != null && cnt != pos) {
			cache = cache.nextNode;
			cnt++;
		}
		cache.nextNode = new Node(data, cache.nextNode);
	}

	void removeAtPos(int data, int pos) {
		Node cache = head;
		int cnt = 0;
		while (cache != null && cnt != pos) {
			cache = cache.nextNode;
			cnt++;
		}
		cache.nextNode = cache.nextNode.nextNode;
	}

	void displayLst() {
		Node cache = head;
		while (cache != null) {
			System.out.print(cache.data + "->");
			cache = cache.nextNode;
		}
		System.out.println("");
	}

	List reverseLinkedList() {
		List rev = new List();
		Node cache = head;
		while (cache != null) {
			addFirst(cache.data);
			cache = cache.nextNode;
		}
		return rev;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new LinkedList();
	}

	private class LinkedList implements Iterator<Integer> {

		Node nxtNode;

		LinkedList() {
			nxtNode = head;
		}

		@Override
		public boolean hasNext() {
			return nxtNode != null;
		}

		@Override
		public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			Integer result = nxtNode.data;
			nxtNode = nxtNode.nextNode;
			return result;
		}

		@Override
		public void remove() {
			throw new NotImplementedException("Implementation not avaialble");
		}
	}
}
