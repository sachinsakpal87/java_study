package com.algos.binary_search_tree;
class nod{
    nod left, right;
    int data;

    public nod(int data,nod left, nod right) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public nod getLeft() {
        return left;
    }

    public void setLeft(nod left) {
        this.left = left;
    }

    public nod getRight() {
        return right;
    }

    public void setRight(nod right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
class bs{
    nod root;

    public bs() {
        this.root = null;
    }

    public void insert(int data){
        root = insert(data,root);
    }

    private nod insert(int data, nod root) {
        if(root==null){
            return new nod(data,null,null);
        }else {
            if(root.data > data){
                root.left = insert(data,root.left);
            }else {
                root.right = insert(data,root.right);
            }
        }
        return root;
    }

    public void inorder(){
     inorder(root);
    }
    public void preorder(){
        preorder(root);
    }
    public void postorder(){
        postorder(root);
    }

    public boolean search(int data){
        return search(root,data);
    }

    private boolean search(nod root, int data) {
        boolean flag = false;
        if(root == null)
            return flag;
        if(root.data == data){
            flag = true;
        }else {
            if(root.data> data){
                return search(root.left,data);
            }else {
                return search(root.right,data);
            }
        }
        return flag;
    }

    private void inorder(nod root) {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    private void preorder(nod root) {
        if(root == null)
            return;
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data);

    }
    private void postorder(nod root) {
        if(root == null)
            return;
        System.out.print(root.data);
        inorder(root.left);
        inorder(root.right);
    }
}
public class temp {
    public static void main(String[] args) {
        bs ob = new bs();
        ob.insert(6);
        ob.insert(3);
        ob.insert(9);
        ob.insert(1);
        ob.insert(5);
        ob.insert(8);
        ob.insert(7);
        ob.insert(25);
        ob.insert(24);
        ob.inorder();
        System.out.println();
        ob.preorder();
        System.out.println();
        ob.postorder();
        System.out.println(ob.search(9));

    }
}
