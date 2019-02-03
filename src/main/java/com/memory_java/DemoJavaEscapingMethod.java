package com.memory_java;

import java.util.HashMap;

public class DemoJavaEscapingMethod {
	public static HashMap<String,String> mp = new HashMap<>(10000000);
	static int count = 0;
	public static void main(String[] args) {

//		System.out.println(Runtime.getRuntime().freeMemory()/1024);
//		long start = System.currentTimeMillis();
//		System.out.println(start);
		for (int i=0; i<10000000; i++) {
			new Thread(() -> {
				mp.put("a"+(++count) , "val");
				fun();
			}).start();
		}

		for (int i=0; i<10000000; i++) {
			new Thread(() -> {
				mp.put("a"+(++count) , "val");
				fun();
			}).start();
		}
//		new Thread(()->{
//				fun();
//			}).start();

//		long end = System.currentTimeMillis();
//		System.out.println(" end "+ end);
//		System.out.println(end-start);
////		System.out.println(Runtime.getRuntime().freeMemory()/1024);
//
//		System.out.println("**************************");
//		start = System.currentTimeMillis();
//		System.out.println(start);
//		fun1();
//		end = System.currentTimeMillis();
//		System.out.println("Value of end "+ end);
//		System.out.println(end-start);
	}
	static int fun(){
		int j=2;
//		for (int i=1; i<1000000000; i++) {
			DemoJavaEscapingMethod obj = new DemoJavaEscapingMethod();
//			j=i*i;
//		}
		return j;
	}

	static void fun1(){
		int j=2;
//		for (int i=1; i<1000000000; i++) {
			DemoJavaEscapingMethod obj = new DemoJavaEscapingMethod();
//			j=i*i;
//		}
	}
}
