package com.restassured.restapi.com.qa.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.restapi.com.qa.base.TestBase;
import com.restassured.restapi.com.qa.client.RestClient;
import com.restassured.restapi.com.qa.data.Users;
import com.restassured.restapi.com.qa.utils.TestUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class TestClass extends TestBase {
    TestBase testBase;
    String url;
    RestClient client;
    @BeforeTest
    public void setUp(){
        testBase = new TestBase();
        String baseURL =properties.getProperty("BaseUrl");
        String listUser =properties.getProperty("getUser");
        url = baseURL+"/"+listUser;
        client = new RestClient();
    }

    @Test
    public void getRequest() throws IOException {
        CloseableHttpResponse response  = client.get(url);
        final int statusCode = response.getStatusLine().getStatusCode();

        final String string = EntityUtils.toString(response.getEntity());
        System.out.println("Response "+string);
        final JSONObject jsonObject = new JSONObject(string);

        System.out.println(TestUtils.getValueByJPath(jsonObject,"/data[0]/email"));

//        System.out.println("Status Code is "+statusCode);
//
//        final String string = EntityUtils.toString(response.getEntity());
//        System.out.println("Response "+string);
//        final JSONObject jsonObject = new JSONObject(string);
//        System.out.println("Json object is"+jsonObject);
//
//        final Header[] allHeaders = response.getAllHeaders();
//        final HashMap<String, String> stringStringHashMap = new HashMap<>();
//        for (Header header : allHeaders){
//            stringStringHashMap.put(header.getName(),header.getValue());
//        }
//
//        System.out.println(Arrays.asList(allHeaders));
//        System.out.println();
//        for (Map.Entry entry : stringStringHashMap.entrySet()){
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }

    }

    @Test
    public void postRequest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Users users = new Users("Sachin","Automation");
//        objectMapper.writeValue(new File("/Users/sachin.sakpal/Study/fork_study/src/main/java/com/restassured/restapi/com/qa/data/users.json"),users);
        String userJson = objectMapper.writeValueAsString(users);
        HashMap map = new HashMap<>();
        map.put("Content-Type","application/json");
        CloseableHttpResponse response  = client.post(url,userJson,map);
        final int statusCode = response.getStatusLine().getStatusCode();

//        client.post(url,)
    }
}
