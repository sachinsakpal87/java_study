package com.algos.singular_linked_list;

import java.util.Iterator;

/**
 * head is a node which always points to head of the list as shown below
 * List = head->[data-> nxtNode]
 * ->[data-> nxtNode]
 * ->[data->nxtNode]
 * -> null
 * <p>
 * To implement iterator interface we need to implement Iterable interface.
 */
class List implements Iterable<Integer> {

	/**
	 * Pointer to Node
	 */
	private Node head;

	/**
	 * Add data at the end of linked list
	 *
	 * @param data
	 */
	void AddRear(int data) {
		/**
		 * 1. create a cache element and assign head to it so that head remain as it is.
		 * 2. check if head or cache is null and create new node which has value as data and nextnode null
		 * else traverse cache till last element and assign last node with new data.
		 * 3. As cache and head points to same list head remains at head position and new
		 * node gets added to last
		 * 4. Here we do cache.nextnode = new Node
		 */
		Node cache = head;
		if (cache == null) {
			head = new Node(data, null);
		} else {
			while (cache.nextnode != null) {
				cache = cache.nextnode;
			}
			cache.nextnode = new Node(data, null);
		}
	}

	/**
	 * 1. create a cache element and assign head to it so that head remain as it is.
	 * 2. create new head and pass next node as current head it will add element at head
	 */
	void AddFirst(int data) {
		Node cache = head;
		head = new Node(data, cache);
	}

	/**
	 * 1. create a cache element and assign head to it so that head remain as it is.
	 * 2. cnt counter to count till the given position
	 * 3. While counter does not reach to desire position and cache.nextnode does not reach to null,
	 * goto next node and increment pointer
	 * 4. add new node to cache.nextnode and pass the data and current node as argument
	 */
	void insertAt(int data, int pos) {
		Node cache = head;
		int cnt = 0;
		while (cache.nextnode != null && cnt != pos) {
			cache = cache.nextnode;
			cnt++;
		}
		if (cnt == 0) {
			AddFirst(data);
		} else {
			cache.nextnode = new Node(data, cache.nextnode);
		}
	}

	/**
	 * 1. create a cache element and assign head to it so that head remain as it is.
	 * 2. cnt counter to count till the given position
	 * 3. While counter does not reach to desire position and cache.nextnode does not reach to null,
	 * goto next node and increment pointer
	 * 4. cache.nextnode will point to cache.next.nextnode
	 */
	void removeAt(int pos) {
		Node cache = head;
		Node temp = head;
		int cnt = 0;
		while (cache.nextnode != null && cnt != pos) {
			cache = cache.nextnode;
			cnt++;
			if (cnt > 2) {
				temp = temp.nextnode;
			}
		}
		if (cnt == 0) {
			shiftHead();
		} else if (cache.nextnode == null) {
			temp.nextnode = null;
		} else {
			temp.nextnode = temp.nextnode.nextnode;
		}
	}

	/**
	 * 1. create a cache element and assign head to it so that head remain as it is.
	 * 2. Shift header to next position
	 * 3. Put data as 0
	 * 4. Set pointer to null
	 */
	void shiftHead() {
		Node cache = head;
		head = head.nextnode;
		cache.data = 0;
		cache.nextnode = null;
	}

	/**
	 * 1. Create a new list object
	 * 2. create a cache element and assign head to it so that head remain as it is.
	 * 3. while cache is not null iterate head and add new element in the beginning
	 */
	List reverse() {
		List lst = new List();
		Node cache = head;
		if (head == null) {
			return null;
		}
		while (cache != null) {
			lst.AddFirst(cache.data);
			cache = cache.nextnode;
		}
		return lst;
	}

	/**
	 * 1. Create a new list twinlst object
	 * 2. create a cache element and assign head to it so that head remain as it is.
	 * 3. Return null if head is null
	 * 4. create new twinlst head node and pass cache.data as data and null as nxt node
	 * 5. create a twincache element and assign twinlst.head to it so that head remain as it is.
	 * 6. check while cache.nextnode is not null and iterate
	 * 7. twincache.nextnode = new node(pass cache.data, null)
	 */
	List Deepcopy() {
		List twinlst = new List();
		Node cache = head;
		if (head == null) {
			return null;
		}
		twinlst.head = new Node(cache.data, null);
		Node twin_cache = twinlst.head;
		while (cache.nextnode != null) {
			cache = cache.nextnode;
			twin_cache.nextnode = new Node(cache.data, null);
			twin_cache = twin_cache.nextnode;
		}
		return twinlst;
	}

	/**
	 * Below method will rearrange list in a order
	 */
	public void rearrangeList(){
		Node cache = head;	//Create temp node to maintain head
		Node slow = cache;	// Create slow fast node to find mid point of list and to break
		Node fast = slow.nextnode; //list in mid

		while (fast!=null&&fast.nextnode!=null){
			slow = slow.nextnode;
			fast = fast.nextnode.nextnode;
		}

		Node node1 = cache; //First node which start at beginning to mid point
		Node node2 = slow.nextnode; //Second node which start at mid point to last
		slow.nextnode = null; // to cut first node at mid

		node2 = reverseNode(node2); //Reverse the list

		Node temp = new Node(0,null); //temp node to append all remaining nodes
		while ( node1 != null || node2 != null){ //Iterate till both node is not null
			if(node1 != null){	//Node1 is not null append to above temp list
				temp.nextnode = node1;	//append node1 to temp
				node1 = node1.nextnode;	//node1 to next node
				temp = temp.nextnode;	//temp to next node
			}
			if(node2 != null){
				temp.nextnode = node2;	//append node1 to temp
				node2 = node2.nextnode; //node1 to next node
				temp = temp.nextnode;	//temp to next node
			}
		}
	}

	private Node reverseNode(Node node){
		Node curr = node;
		Node next, prev = null;
		while (curr!=null){
			next = curr.nextnode;	//maintain next node
			curr.nextnode = prev;	//cut curr node and set next as null in beginning, later node will be reverted
			prev = curr;	//prev as node which cut in above step
			curr = next;	// curr as next node for futher loop
		}
		return prev; //reverse list
	}

	/**
	 * Display list
	 * 1. create a cache element and assign head to it so that head remain as it is.
	 * 2. While cache is not null, SOP cache.data and point cache to next node
	 */
	void Display() {
		Node cache = head;
		while (cache != null) {
			System.out.print(cache.data + " -> ");
			cache = cache.nextnode;
		}
		System.out.print("\n");
	}

	/**
	 * Iterable inteface implements iterator method which return object of Iterator
	 */
	@Override
	public Iterator<Integer> iterator() {
		return new LinkedListIterator();
	}

	/**
	 * Private class LinkedListIterator which implements Iterator Interface
	 * which contains hasNext(), next() methods
	 */
	private class LinkedListIterator implements Iterator<Integer> //Create private class to implement iterator
	{
		/**
		 * Create Node nxtNode
		 */
		private Node nxtNode;

		/**
		 * Assign nxtNode to head
		 */
		LinkedListIterator() {
			nxtNode = head;
		}

		/**
		 * if nxtNode is null then return false
		 */
		@Override
		public boolean hasNext() {
			return nxtNode != null;
		}

		/**
		 * 1. if hasNext is false throw exception
		 * 2. Else return nxtNode.data also increment pointer
		 */
		@Override
		public Integer next() {
			if (hasNext()) {
				Integer result = nxtNode.data;
				nxtNode = nxtNode.nextnode;
				return result;
			}
			return null;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}

