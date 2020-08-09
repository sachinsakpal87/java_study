package com.restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DemoGithub {

    @Test
    public void getGitHubRepo(){

//        4067f1a51418a033f3f87b656368707761196d10

        RestAssured.baseURI = "https://api.github.com";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
       String str =  given()
                .param("token","4067f1a51418a033f3f87b656368707761196d10")
               .log().all()
                .when()
                .get("/users/sachinsakpal/repos")
                .then()
                .extract()
                .body()
                .asString();

        System.out.println(str);
    }
}
