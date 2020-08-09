package com.restassured.restapi.com.qa.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestUtils {

    JSONArray array;

    public static String getValueByJPath(JSONObject jsonObject, String path){
        Object obj = jsonObject;
        for (String s : path.split("/")){
            if(!s.isEmpty()){
                if(!(s.contains("[")||s.contains("]"))){
                    obj = ((JSONObject) obj).get(s);
                }else {
                    obj=((JSONArray)((JSONObject) obj).get(s.split("[\\[\\]]")[0])).get(Integer.parseInt(s.split("[\\[\\]]")[1]));
                }
            }
        }
        return obj.toString();
    }

}
