package com.collections.collection;

import java.util.ArrayList;
import java.util.Vector;

class Test {
	Vector<Integer> vector = new Vector<>(5000);
	ArrayList<Integer> obj = new ArrayList<Integer>(5000);
	int data = 0;
	int data2 = 0;

	Test(int data) {
		this.data = data;
		this.data2 = data;
	}

	void add() {
		synchronized (this) {
			data++;
		}
		synchronized (this) {
			data2++;
		}
		obj.add(data);
		vector.add(data2);
//        }
	}

	void display() {
		System.out.println(obj);
		System.out.println(vector);
	}
}

public class DemoThreadOnArrayList {

	public static void main(String[] args) throws InterruptedException {

		final Test obj = new Test(1000);
		Thread T1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					obj.add();
				}
			}
		});

		Thread T2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					obj.add();
				}
			}
		});

		T1.start();
		T2.start();

		T1.join();
		T2.join();

		obj.display();
	}
}
