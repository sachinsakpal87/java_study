package com.collection.generics;
class NodeB{
	int data;
	NodeB left, right;

	public NodeB(int data, NodeB left, NodeB right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class BinaryTree{
	NodeB root;

	public void insert(int data){
		root = insert(data,root);
	}
	public NodeB insert(int data, NodeB root){
		if(root==null) {
			root = new NodeB(data, null, null);
		}else {
			if (data < root.data) {
				return  root.left = insert(data, root.left);
			}else {
				return  root.right = insert(data,root.right);
			}
		}
		return root;
	}

	public void preOrder(){
		NodeB cache = root;
		preOrder(cache);
	}

	private void preOrder(NodeB root) {
		System.out.println("->"+root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
}

public class DemoBinarySearchTree {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(4);
		binaryTree.insert(3);
		binaryTree.insert(8);
		binaryTree.insert(6);
		binaryTree.insert(2);
		binaryTree.preOrder();

	}
}
