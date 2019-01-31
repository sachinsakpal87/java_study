package com.collection.binary_search_tree;

import java.util.Iterator;

public class DemoBinarySearchTree {

	public static void main(String[] args) {
		BStree obj = new BStree();
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(1);
		obj.insert(2);
		obj.insert(4);
		obj.insert(3);

		obj.inorder();

		obj.mirrorTree();

		obj.inorder();

	}
}

