//package com.collection.binary_search_tree;
//package com.binary_search_tree;
//import java.util.LinkedList;
//
//class Node{
//	int data;
//	Node left, right;
//
//	Node(){
//		this.data=0;
//		this.left = null;
//		this.right = null;
//	}
//	Node(int data){
//		this.data=data;
//		this.left = null;
//		this.right = null;
//	}
//	public int getData() {
//		return data;
//	}
//	public Node getLeft() {
//		return left;
//	}
//	public Node getRight() {
//		return right;
//	}
//	public void setData(int data) {
//		this.data = data;
//	}
//	public void setLeft(Node left) {
//		this.left = left;
//	}
//	public void setRight(Node right) {
//		this.right = right;
//	}
//}
//
//class BST{
//
//	private Node root;
//
//	BST(){
//		root = null;
//	}
//
//	void insert(int data){
//		root = insert(root, data);
//	}
//	private Node insert(Node r , int data){
//
//		if(r==null){
//			r = new Node(data);
//		}else{
//			if(data <= r.getData()){
//				r.left = insert(r.left, data);
//			}else{
//				r.right = insert(r.right, data);
//			}
//		}
//		return r;
//
//	}
//
//	void inorder(){
//		inorder(this.root);
//	}
//
//	private void inorder(Node r){
//		if(r != null){
//			inorder(r.getLeft());
//			System.out.println(r.getData()+" ");
//			inorder(r.getRight());
//		}
//	}
//
//	void Preorder()
//	{
//		Preorder(this.root);
//
//	}
//	private void Preorder(Node r){
//		if(r != null){
//			System.out.println(r.getData()+" ");
//			Preorder(r.getLeft());
//			Preorder(r.getRight());
//		}
//	}
//	public boolean isEmpty()
//	{
//		return root == null;
//	}
//
//	boolean search(int data){
//		return search(data,root);
//	}
//
//	private boolean search(int data, Node root){
//		boolean found = false;
//		while(root != null && ! found )
//		{
//			int rval = root.data;
//			if(rval==data){
//				found = true;
//				break;
//			}
//			else if (data<rval)
//				return search(data, root.getLeft());
//			if (data>rval)
//				return search(data, root.getRight());
//		}
//		return found;
//
//	}
//	boolean binaryTreeBFS (int value){
//		return binaryTreeBFS (root, value);
//	}
//
//	private boolean binaryTreeBFS (Node root, int value){
//
//		if (root == null)
//	    return false;
//
//		LinkedList<Node> queue = new LinkedList<Node>();
//		Node tempNode;
//		queue.addLast(root);
//
//		while (!queue.isEmpty()){
//			tempNode = (Node) queue.remove();
//			if (tempNode.data == value)
//				return true;
//			else{
//				if (tempNode.left != null)
//					queue.addLast(tempNode.left);
//				if (tempNode.right != null)
//					queue.addLast(tempNode.right);
//	    }
//	  }
//	  return false;
//	}
//
//}
//
//public class DemoBSTWorking {
//
//	public static void main(string_demo[] args) {
//		// TODO Auto-generated method stub
//
//		BST tr = new BST();
//		tr.insert(6);
//		tr.insert(4);
//		tr.insert(7);
//		tr.insert(5);
//		tr.insert(8);
//		tr.insert(3);
//		tr.insert(2);
//		tr.insert(9);
//
//		tr.Preorder();
//
//
////System.out.println(" Element is "+ tr.search(5));
//		System.out.println(" Element is "+ tr.binaryTreeBFS(5));
//	}
//
//}
