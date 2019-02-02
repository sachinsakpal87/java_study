package com.collections.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * hashtable is key value pair hence duplicate keys are not allowed
 * null is not allowed as a key as well as value
 * hash hence order is not maintained
 * synchronized
 */
public class DemoHashTable {

	public static void main(String[] args) {
		Hashtable<String, String> objCollection = new Hashtable<String, String>();
		objCollection.put("1", "Sachin");
		objCollection.put("2", "Sakpal");
		objCollection.put("1", "Vishwas");
		objCollection.put("3", "Mahipat");
		objCollection.put("4", "Mahipat");
		objCollection.put("5", "pratibha");
//		objCollection.put(null, "Vishwas");
//		objCollection.put("Mahipat",null);
//        objCollection.put(null, null);
		System.out.println(objCollection);
//        System.out.println(objCollection.get(null));

		Set<String> keySet = objCollection.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			//string_demo key = itr.next();
			System.out.println("Value for is : " + objCollection.get(itr.next()));
		}

		for (Map.Entry<String, String> entry : objCollection.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Hashtable objCollection1 = new Hashtable();
		objCollection1.put("1", "sachin");
		objCollection1.put(2, 555);
		System.out.println(objCollection1);
	}
}
