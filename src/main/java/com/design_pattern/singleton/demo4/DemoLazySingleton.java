package com.design_pattern.singleton.demo4;

class LazySingleton{
	private static LazySingleton instance;

	private LazySingleton() {
	}

	/**
	 * Below getInstance is not thread safe as if two thread found
	 * that instance is null at same time will create two new instances.
	 * One way to overcome use synchronization
	 */
//	public static synchronized LazySingleton getInstance(){
//		if (instance == null) {
//			instance = new LazySingleton();
//		}
//		return instance;
//	}

	//Double check lock
	public static LazySingleton getInstance(){
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

}

public class DemoLazySingleton {
	public static void main(String[] args) {
		LazySingleton obj = LazySingleton.getInstance();
	}
}
