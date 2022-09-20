package com.algos.singular_linked_list;

/*
 * Node contains data and next node
 *
 * List = head->[data-> nxtNode]
 *		 					->[data-> nxtNode]
 *		  								->[data->nxtNode]
 *		  											-> null
 *
 * */
class Node {

	int data;
	Node nextnode;

	Node(int data, Node next) {
		this.data = data;
		this.nextnode = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextnode() {
		return nextnode;
	}

	public void setNextnode(Node nextnode) {
		this.nextnode = nextnode;
	}
}
