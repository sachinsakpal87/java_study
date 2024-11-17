package com.algos.singll_homework;

class Node {
	int data;
	Node nextNode;

	Node() {
		this.data = 0;
		this.nextNode = null;
	}

	Node(int data, Node nexNode) {
		this.data = data;
		this.nextNode = nexNode;
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
}
