package com.collection.stack;

public class DemoStack {
	int [] arr;
	int top=0,len;
	public DemoStack(int size) {
		arr = new int[size];
		len =size;
	}
	private boolean isEmpty() {
		return top<=0?true:false;
	}

	private boolean isFull() {
		return getSize()>=len?true:false;
	}

	private int pop() {
		int data = 0;
		if(!isEmpty()) {
			top--;
			data = arr[top];
		}else {
			System.out.println("Stack is Empty");
		}
		return  data;
	}

	private int peek() {
		int data = 0;
		if(!isEmpty()) {
			data = arr[top];
		}else {
			System.out.print("Stack is Empty");
		}
		return  data;
	}

	private int getSize() {
		return top;
	}

	private void push(int i) {
		if(isFull()){
			System.out.println("Stack is Full");
		}else {
			arr[top] = i;
			top++;
		}
	}

	private void show(){
		for (int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private DemoStack reverse() {
		DemoStack dummy = new DemoStack(getSize());
		while (!isEmpty()){
			dummy.push(pop());
		}
		return dummy;
	}

	public static void main(String[] args) {
		DemoStack demoStack = new DemoStack(3);
		demoStack.show();
		demoStack.push(1);
		demoStack.push(2);
		demoStack.push(3);
		demoStack.push(4);
		DemoStack reverse = demoStack.reverse();
		reverse.show();
		demoStack.show();
		DemoStack demoStack1 = demoStack.reverse();
		System.out.println(demoStack.pop());
		System.out.println(demoStack.peek());
		System.out.println(demoStack.getSize());
		System.out.println(demoStack.isEmpty());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.pop());
		System.out.println(demoStack.isEmpty());
	}
}
