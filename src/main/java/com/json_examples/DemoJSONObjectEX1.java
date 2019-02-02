package com.json_examples;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * json_examples Object is always a MAP
 */
public class DemoJSONObjectEX1 {
	public static void main(String[] args) {

		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", "sakpal");
		jsonObject1.put("id", 21);
		jsonObject1.put("address", "pune");
		jsonObject1.put("isActive", true);

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", "sachin");
		jsonObject2.put("id", 22);
		jsonObject2.put("address", "pune");
		jsonObject2.put("isActive", false);

		JSONArray jsonArray = new JSONArray();
		jsonArray.add(jsonObject1);
		jsonArray.add(jsonObject2);

		System.out.println(jsonArray.toJSONString());

		for (Object obj : jsonArray) {
			System.out.println(((JSONObject) obj).toJSONString());
		}
	}
}
