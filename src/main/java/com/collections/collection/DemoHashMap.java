package com.collections.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Map is key value pair hence duplicate keys are not allowed
 * Hash hence its unordered.
 * null is allowed as a key as well as value
 * duplicate key will be overriden.
 * duplicate values are allowed.
 */
public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<String, String> objCollection = new HashMap<String, String>();
		objCollection.put("1", "Sachin");
		objCollection.put("2", "Sakpal");
		objCollection.put("1", "Vishwas");
		objCollection.put("3", "Mahipat");
//        objCollection.put("4", null);
//        objCollection.put("5", null);
		objCollection.put("6", "Mahipat");
		objCollection.put(null, "Vishwas");
		objCollection.put(null, "Mahipat");
		objCollection.put(null, "temp");
		System.out.println(objCollection);

		System.out.println(objCollection.get(null));

		System.out.println("Get value for Key 6 :: " + objCollection.get(6));

		System.out.println(" Check if key is available :: " + objCollection.containsKey("9"));
		System.out.println(" Check if key is available :: " + objCollection.containsKey("5"));
		System.out.println(" Check if key is available :: " + objCollection.containsKey(null));

		System.out.println(" Check if value is available :: " + objCollection.containsValue("9"));
		System.out.println(" Check if value is available :: " + objCollection.containsValue("Vishwas"));
		System.out.println(" Check if value is available :: " + objCollection.containsValue(null));

//        Collection<String> values = objCollection.values();
//        values.iterator();

//        Iterate map
//        First get keyset
		Set<String> keySet = objCollection.keySet();

//        Second get iterator using keySet
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			//String key = itr.next();
			System.out.println("Value for is : " + objCollection.get(itr.next()));
		}

//        Using Map Entry which will provide both key and value
		for (Map.Entry<String, String> entry : objCollection.entrySet()) {
			System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
		}

		List<Map.Entry<String, String>> listr = new LinkedList<>(objCollection.entrySet());
//        Collections.sort(listr,(o1, o2) -> {
//            return o1.getValue().compareTo(o2.getValue());
//        });

		Collections.sort(listr, Comparator.comparing(Map.Entry::getValue));

		for (Map.Entry<String, String> entry : listr) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		HashMap last = new HashMap();
		last.put("le", "kyu");
		last.put(1, 6);
		last.put(null, "asc");
		last.put(Integer.valueOf(10), null);

		System.out.println(last);
	}
}
