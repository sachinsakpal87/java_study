package com.JSON;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * JSON Object is always a MAP
 */
public class DemoJsonObject {
	public static void main(String[] args) {
		Map<String, String> mapObj = new HashMap<>();
		mapObj.put("name", "sachin");
		mapObj.put("id", "5");
		mapObj.put("age", "27");

		System.out.println(JSONValue.toJSONString(mapObj));
		System.out.println(JSONObject.toJSONString(mapObj));

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "sakpal");
		jsonObject.put("id", 21);
		jsonObject.put("address", "pune");
		jsonObject.put("isActive", true);

		System.out.println(jsonObject.toJSONString());
	}
}
