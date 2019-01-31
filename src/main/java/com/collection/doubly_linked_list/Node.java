package com.collection.doubly_linked_list;

public class Node {
	int data;
	Node nextNode;
	Node prevNode;

	Node(int data, Node nextNode, Node prevNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
}
