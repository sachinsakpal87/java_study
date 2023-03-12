package com.algos.binary_search_tree;

import java.util.Stack;


// This is comment commit lets see what happens
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
        while (!flag && root != null) {
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

    public void inOrderWithoutRecursion() {
        inOrderWithoutRecursion(this.root);
    }

    private void inOrderWithoutRecursion(Node root) {
        Node cache = root;
        if (cache == null) {
            return;
        }
        Stack<Node> nodeStack = new Stack<>();
        while (cache != null || nodeStack.size() > 0) {
            while (cache != null) {
                nodeStack.push(cache);
                cache = cache.left;
            }
            cache = nodeStack.pop();
            System.out.println(cache.data);
            cache = cache.right;
        }
    }

    public void mirrorTree() {
        this.root = mirrorTree(this.root);
    }

    private Node mirrorTree(Node root) {
        if (root == null)
            return root;
        Node left = mirrorTree(root.left);
        Node right = mirrorTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public void flattenTree() {
        flattenTree(this.root);
    }

    private void flattenTree(Node root) {
        Node cache = root;
        Stack<Node> nodeStack = new Stack<>();
        while (cache != null || !nodeStack.empty()) {
            if (cache.right != null) {
                nodeStack.add(cache.right);
            }
            if (cache.left != null) {
                cache.right = cache.left;
                cache.left = null;
            } else if (!nodeStack.empty()) {
                Node temp = nodeStack.pop();
                cache.right = temp;
            }
            cache = cache.right;
        }
    }
}
//             4            4
//            / \          / \
//         2      5     null   2
//        / \      \          / \
//     1     3      6     null   1
//                   \            \
//                    7            3
//                                  \
//                                   5
//                                    \
//                                     6
//                                      \
//                                       7


