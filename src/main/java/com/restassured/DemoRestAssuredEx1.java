package com.restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DemoRestAssuredEx1 {

	@Test
	public void TestRestAssure(){
		RestAssured.baseURI = "https://maps.googleapis.com";
		given()
				.log().all()
				.param("location","-33.8670522,151.1957362")
				.param("radius","500")
				.param("key","AIzaSyBJQjdCskD669w2TZWyfI3N5m4AIbMMP14")
				.when()
				.get("/maps/api/place/nearbysearch/json")
				.then()
				.assertThat()
				.statusCode(200)
				.and().contentType(ContentType.JSON)
//				.and().body("results[0].geometry.location.lat",equalTo("-33.86882"))
				.and().body("results[0].name",equalTo("Sydney"))
				.and().header("Server","scaffolding on HTTPServer2");

	}

}
