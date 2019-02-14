package com.collection.binary_search_tree;

public class DemoBinarySearchTree {

	public static void main(String[] args) {
		BStree obj = new BStree();
		obj.insert(4);
		obj.insert(2);
		obj.insert(3);
		obj.insert(1);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.inorder();

		obj.flattenTree();
		obj.inorder();
//		obj.inorder();
//
//		obj.mirrorTree();
//
//		obj.inorder();

	}
}

