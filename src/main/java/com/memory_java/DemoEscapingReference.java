package com.memory_java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class EscapingRef{
	private Map<String, String>demoMap = new HashMap();

//	public Map<String, String> getDemoMap() {
//		return demoMap;
//	}

//	public Map<String, String> getDemoMap() {
//		return new HashMap<>(demoMap);
//	}

	public Map<String, String> getDemoMap() {
		return Collections.unmodifiableMap(demoMap);
	}


	public void setDemoMap(String key, String value) {
		this.demoMap.put(key,value);
	}

	public String toString() {
		return "EscapingRef{" +
				"demoMap=" + demoMap +
				'}';
	}
}
public class DemoEscapingReference {
	public static void main(String[] args) {
		EscapingRef ref = new EscapingRef();
		ref.setDemoMap("first","Sachin");
		ref.setDemoMap("second","vishwas");
		ref.setDemoMap("third","Sakpal");

		System.out.println(ref.toString());

//		To avoid below condition either return new hash map or return immutable hash map
//		ref.getDemoMap().clear();

		ref.getDemoMap().clear();

		System.out.println(ref.toString());
	}
}
