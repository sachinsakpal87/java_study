package com.collection.queue;

public class DemoQueue {

	private int[]arr ;
	private int front=0, rear=0 ,size =0,len;
	public DemoQueue(int size) {
		arr = new int[size];
		len = size;
	}

	private void enQueue(int data) {
		if(!isFull()) {
			arr[rear] = data;
			rear = (rear + 1)%len;
			size = size + 1;
		}else {
			System.out.println("Queue is full ");
		}
	}

	private boolean isFull(){
		return getSize()>=len?true:false;
	}

	private boolean isEmpty(){
		return getSize()==0?true:false;
	}

	private int getSize(){
		return size;
	}

	private int deQueue(){
		int data = 0;
		if(!isEmpty()) {
			data = arr[front];
			arr[front] = 0;
			front = (front + 1) % len;
			size = size - 1;
		}else {
			System.out.println("Queue is empty");
		}
		return data;
	}

	private void show(){
		for (int i=0; i<getSize(); i++){
			System.out.print(arr[(i+front)%len]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DemoQueue demoQueue = new DemoQueue(2);
		demoQueue.enQueue(5);
		demoQueue.enQueue(4);
		demoQueue.show();
		System.out.println(demoQueue.deQueue());
		System.out.println(demoQueue.deQueue());
		System.out.println(demoQueue.deQueue());
		demoQueue.show();
		demoQueue.enQueue(8);
		demoQueue.enQueue(9);
		demoQueue.show();

	}
}
