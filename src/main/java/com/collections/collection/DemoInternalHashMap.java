package com.collections.collection;

import java.util.HashMap;

public class DemoInternalHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> obj = new HashMap<String, Integer>();
//        obj.put("abcdef", 1);
//        obj.put("abcdfG", 2);
		obj.put("FB", 1);
		obj.put("Ea", 2);
		obj.put(null, 3);

		System.out.println(obj.get("Ea"));
	}
}
