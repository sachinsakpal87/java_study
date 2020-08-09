package com.algorithm.code;

class Que{
    int arr[]; int head=0; int tail=0; int len,size=0;
    Que(int size){
        arr = new int[size];
        len = size;
    }

    public void que(int data){
        if(!isFull()) {
            arr[head] = data;
            head = (head +1)%len;
            size++;
        }else {
            System.out.println("que is full");
        }
    }

    private boolean isFull() {
        return size>=len;
    }

    private boolean isEmpty() {
        return size<=0;
    }

    public int deque(){
        int data = 0;
        if(!isEmpty()) {
            data = arr[tail];
            tail = (tail+1)%len;
            size--;
        }else {
            System.out.println("que is empty");
        }
        return data;
    }

    public void print(){
        for (int i=0; i<size; i++){
            System.out.print(arr[(i+tail)%len]+"->");
        }
        System.out.println();
    }
}
public class DemoStackHelp {
    int arr[]; int head=0; int len=0;

    DemoStackHelp(int size){
        arr = new int[size];
        len = size;
    }

    public void push(int val){
        if(!isStackFull()) {
            arr[head] = val;
            head++;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public int pop(){
        int val =0;
        if(!isStackEmpty()) {
            head--;
            val = arr[head];
            arr[head] = 0;
        } else {
            System.out.println("Stack is Empty");
        }
        return val;
    }

    public int peek(){
        int val =0;
        if(!isStackEmpty()) {
            head--;
            val = arr[head];
            head++;
        } else {
            System.out.println("Stack is Empty");
        }
        return val;
    }

    private boolean isStackEmpty() {
        return head <=0;
    }

    private boolean isStackFull() {
        return head>=len;
    }

    public void print(){
        for (int i=0; i<head; i++){
            System.out.print(arr[i]+"->");
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        DemoStackHelp stackHelp = new DemoStackHelp(5);
//        stackHelp.push(1);
//        stackHelp.push(2);
//        stackHelp.push(3);
//        stackHelp.print();
//        stackHelp.push(4);
//        stackHelp.push(5);
//        stackHelp.push(6);
//        stackHelp.print();
//        System.out.println(stackHelp.pop());
//        stackHelp.print();
//        stackHelp.push(6);
//        stackHelp.print();

        Que que = new Que(5);
        que.que(1);
        que.que(2);
        que.que(3);
        que.print();
        que.que(4);
        que.que(5);
        que.que(6);
        que.que(7);
        que.print();
        que.deque();
        que.deque();
        que.que(6);
        que.que(7);
        que.print();

    }
}
