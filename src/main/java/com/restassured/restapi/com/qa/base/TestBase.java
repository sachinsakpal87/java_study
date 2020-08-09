package com.restassured.restapi.com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public Properties properties;

    public TestBase() {
    properties = new Properties();
        try {
            System.getProperty("user.dir");
            properties.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/java/com/restassured/restapi/com/qa/config/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestBase obj = new TestBase();
    }
}
