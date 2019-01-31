package com.Threading.Thread;

class A extends Thread {

	static int objVar = 0;
	String objname = "";

	A(String objname) {
		this.objname = objname;
		System.out.println("Thread" + (++objVar) + " " + objname.toString() + " Created");
	}
//	@Override
//	public void run() {
//		for(int i=0; i<100; i++){
//			System.out.println(objname.toString()+" running");
//		}
//	}
}

public class MyThread {

	public static void main(String args[]) {

		A obj = new A("Thread1");
		A obj1 = new A("Thread2");
		obj.start();
		obj1.start();
		for (int i = 0; i < 300; i++) {
			System.out.println(obj.getState());
			System.out.println(obj1.getState());
		}
	}
}
