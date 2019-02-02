package com.collections.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Map is key value pair hence duplicate keys are not allowed
 * Its Tree hence keys are sorted
 * null is not allowed as a key.
 * Heterogenious object is not allowed it will throw ClassCastException
 */
public class DemoTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> objCollection = new TreeMap<String, String>();
		objCollection.put("1", "Sachin");
		objCollection.put("9", "Sakpal");
		objCollection.put("8", "Vishwas");
		objCollection.put("3", "Mahipat");
		objCollection.put("4", "Mahipat");
		objCollection.put("5", null);
		objCollection.put("6", null);

		//	objCollection.put(null, "Vishwas");
//		objCollection.put(null, "Mahipat");
//		objCollection.put(null, null);

		System.out.println(objCollection);

		//System.out.println(objCollection.get(null));

		Set<String> keySet = objCollection.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			//string_demo key = itr.next();
			System.out.println("Value for is : " + objCollection.get(itr.next()));
		}

		Set<Map.Entry<String, String>> entrySet = objCollection.entrySet();
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
		}

		Set<Integer> iasc = Stream.of(1).collect(Collectors.toSet());
	}
}
