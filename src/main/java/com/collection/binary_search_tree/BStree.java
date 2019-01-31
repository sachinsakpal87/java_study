package com.collection.binary_search_tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BStree {
    Node root;

    BStree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    public Node insert(int data, Node root) {
        if (root == null) {
            root = new Node(data, null, null);
        } else {
            if (root.data >= data) {
                root.left = insert(data, root.left);
            } else {
                root.right = insert(data, root.right);
            }
        }
        return root;
    }

    public boolean search(int data) {
        return search(data, root);
    }

    public boolean search(int data, Node root) {
        boolean flag = false;
        while (flag == false && root != null) {
            if (root.data == data) {
                flag = true;
                break;
            } else if (data < root.data) {
                return search(data, root.left);
            } else if (data > root.data) {
                return search(data, root.right);
            }

        }
        return flag;
    }

    public void inorder() {
        inorder(this.root);
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " -> ");
            inorder(root.right);
        }
    }

    public void mirrorTree(){
        this.root = mirrorTree(this.root);
    }

    private Node mirrorTree(Node root) {
        if(root==null)
            return root;
        Node left = mirrorTree(root.left);
        Node right = mirrorTree(root.right);

        root.left=right;
        root.right = left;
        return root;

    }
}
