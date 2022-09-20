package com.algorithm.code;

class Queue {
    int arr[], head, tail, size = 0, len = 0;

    Queue(int size) {
        len = size;
        arr = new int[size];
        head = 0;
        tail = 0;
    }

    public void add(int val) {
        if(!isFull()) {
            arr[head] = val;
            head = (head + 1) % len;
            size++;
        }else {
            System.out.println("Full...");
        }
    }

    public boolean isFull(){
        return size>= len;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public void delete() {
        if(!isEmpty()) {
            int val = arr[tail];
            tail = (tail + 1) % len;
            size--;
        }else {
            System.out.println("Empty...");
        }
    }

    public void print(){
        for (int i=0; i<size;i++){
            System.out.print(arr[(tail+i)%len]+"->");
        }
        System.out.println();
    }
}

class stack{
    int arr[], head, size=0, len;
    stack(int size){
        len = size;
        arr =  new int[size];
    }
    public boolean isFull(){
        return size >= len;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public void add(int val){
        if(!isFull()) {
            arr[head] = val;
            head++;
            size++;
        }else {
            System.out.println("stack is full..");
        }
    }

    public int delete(){
        int val = 0;
        if(!isEmpty()) {
            head--;
            val = arr[head];
            arr[head] = 0;
        }else {
            System.out.println("stack is Empty..");
        }
        return val;
    }

    public void print(){
        for (int i=0; i<head; i++){
            System.out.print(arr[i]+"->");
        }
        System.out.println();
    }
}

public class Temp {
    public static void main(String[] args) {
////        Queue obj = new Queue(5);
//        stack obj = new stack(5);
//        obj.add(1);
//        obj.add(2);
//        obj.add(3);
//        obj.add(4);
//        obj.add(5);
//        obj.add(6);
//        obj.add(7);
//        obj.delete();
//        obj.print();
//        obj.add(7);
//        obj.print();
        System.out.println('j'+'a'+'v'+'a');
    }
}
//
