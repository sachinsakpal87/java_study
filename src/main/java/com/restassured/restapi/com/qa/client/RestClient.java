package com.restassured.restapi.com.qa.client;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

    public CloseableHttpResponse get(String url) throws IOException {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpGet getReq = new HttpGet(url);
        return closeableHttpClient.execute(getReq);
    }

    public CloseableHttpResponse get(String url, HashMap<String,String> headers) throws IOException{
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpGet getReq = new HttpGet(url);
        for (Map.Entry<String,String> entry : headers.entrySet()){
            getReq.addHeader(entry.getKey(),entry.getValue());
        }
        return closeableHttpClient.execute(getReq);
    }

    public CloseableHttpResponse post(String url, String payLoad, HashMap<String,String> headers) throws IOException {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.setEntity(new StringEntity(payLoad));
        for (Map.Entry<String,String> entry : headers.entrySet()){
            post.addHeader(entry.getKey(),entry.getValue());
        }
        return closeableHttpClient.execute(post);
    }
}
