package com.algos.generics;// Write a Binary search Tree in JAVA
// Insert a node
// Pre Order
// Post Order
// In Order
// Find element
// BFS
// Mirror Tree
// Flatten Tree

import java.util.*;

class NodeG<T extends Comparable<T>>{
	T data;
	NodeG left,right;

	NodeG(T data, NodeG left, NodeG right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

class Tree<T extends Comparable<T>>{
	NodeG root;

	/**
	 * Insert Node
	 */
	public void insert(T data){
		root = insert(root,data);
	}

	private NodeG insert(NodeG root, T data){
		NodeG cache = root;	//Cache just to keep root node as it is
		if(cache == null){
			cache = new NodeG(data, null, null);
		}else{
			if(cache.data.compareTo(data)>0){
				cache.left = insert(cache.left,data);
			}else{
				cache.right = insert(cache.right, data);
			}
		}
		return cache;
	}

	public void preOrder(){
		preOrder(root);
	}

	private void preOrder(NodeG root){
		if(root != null){
			System.out.print(" "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(){
		inOrder(root);
	}

	private void inOrder(NodeG root){
		if(root != null){
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}

	public void postOrder(){
		postOrder(root);
	}

	private void postOrder(NodeG root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" "+root.data);
		}
	}

	public boolean search(T data){
		return search(root, data);
	}

	private boolean search(NodeG root, T data){
		if(root != null){
			if(root.data == data){
				return true;
			}else if(root.data.compareTo(data)>0) {
				return search (root.left, data);
			}else{
				return search (root.right, data);
			}
		}else {
			return false;
		}
	}

	public void mirrorTree(){
		root = mirrorTree(root);
	}

	private NodeG mirrorTree(NodeG root){

		if(root ==null){
			return root;
		}
		NodeG left = mirrorTree(root.left);
		NodeG right = mirrorTree(root.right);

		root.right = left;
		root.left = right;

		return root;
	}

	public void flattenTree(){
		flattenTree(root);
	}

	public void flattenTree(NodeG root){
		NodeG cache = root;
		Stack<NodeG> nodeObj = new Stack();
		while(cache != null && !nodeObj.empty()){
			if(cache.right !=null){
				nodeObj.add(cache.right);

			}
			if(cache.left != null){
				cache.right = cache.left;
				cache.left = null;
			}else if(!nodeObj.empty()){
				cache.right = nodeObj.pop();
			}
			cache = cache.right;
		}
	}

	public boolean bfs(T data){
		return bfs(root, data);
	}

	private boolean bfs(NodeG root, T data){
		if(root == null)
			return false;
		LinkedList<NodeG> linkedLst = new LinkedList();
		linkedLst.addLast(root);
		while(!linkedLst.isEmpty()){
			NodeG temp = linkedLst.remove();
			if(temp.data == data){
				return true;
			}else{
				if(temp.left != null)
					linkedLst.addLast(temp.left);
				if(temp.right != null)
					linkedLst.addLast(temp.right);
			}
		}
		return false;
	}
}



class DemoBinarySearchTree{
	public static void main(String[] args){

		Tree tree = new Tree();
		tree.insert("A");
		tree.insert("B");
		tree.insert("C");
		tree.insert("D");
		tree.insert("E");
		tree.insert("F");

		tree.preOrder();
		System.out.println();
		tree.inOrder();
		System.out.println();
		tree.postOrder();
		System.out.println();
		System.out.println(" "+tree.search("D"));
		System.out.println(" "+tree.search("Z"));

		tree.mirrorTree();
		tree.inOrder();

		System.out.println();

		tree.flattenTree();
		tree.inOrder();

		System.out.println();
		System.out.println(" "+tree.bfs("E"));
		System.out.println(" "+tree.bfs("X"));

	}
}
