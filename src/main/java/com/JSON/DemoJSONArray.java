package com.JSON;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

public class DemoJSONArray {
	public static void main(String[] args) {
		JSONArray array = new JSONArray();
		array.add("sachin");
		array.add(21);
		array.add("Pune");

		System.out.println(array.toJSONString());

		List lst = new ArrayList();
		lst.add("sachin");
		lst.add(21);
		lst.add("Pune");

		System.out.println(JSONArray.toJSONString(lst));
	}
}
