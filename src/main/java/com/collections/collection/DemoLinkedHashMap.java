package com.collections.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map is key value pair hence duplicate keys are not allowed
 * null is allowed as a key as well as value
 * Linked hence order is maintained in LinkedHashMap
 */
public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> objCollection = new LinkedHashMap<String, String>();
		objCollection.put("1", "Sachin");
		objCollection.put("a", "Sachin1");
		objCollection.put("2", "Sakpal");
		objCollection.put("1", "Vishwas");
		objCollection.put("3", "Mahipat");
		objCollection.put("4", "Mahipat");
		objCollection.put(null, "Vishwas");
		objCollection.put(null, "Mahipat");
//        objCollection.put(null, null);
		System.out.println(objCollection);

		System.out.println(objCollection.get(null));
		Set<String> keySet = objCollection.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Value for " + key + " is : " + objCollection.get(key));
		}

		for (Map.Entry<String, String> entry : objCollection.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
		}
	}
}
