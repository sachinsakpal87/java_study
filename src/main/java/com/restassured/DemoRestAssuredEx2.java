package com.restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DemoRestAssuredEx2 {

	@Test
	public void TestAddResource(){
		RestAssured.baseURI = "http://216.10.245.166";
		String resource = "/maps/api/place/add/json";

		String body = "{\"location\":{\"lat\" : -38.383494,\"lng\" : 33.427362" +
				"},\"accuracy\":50,\"name\":\"Frontline house\",\"phone_number\":\"(+91) 983 893 3937\"," +
				"\"address\" : \"29, side layout, cohen 09\",\"types\": [\"shoe park\",\"shop\"]," +
				"\"website\" : \"http://google.com\",\"language\" : \"French-IN\"}";

		String response = given()
				.queryParam("key","qaclick123")
				.body(body)
				.when()
				.get(resource)
				.then()
				.assertThat().statusCode(200)
				.and()
				.extract().body().asString();

		System.out.println(response);

		JsonPath jsonPath = new JsonPath(response);
		String place_id = jsonPath.get("place_id");

		System.out.println(place_id);


		String delResource = "/maps/api/place/delete/json";

		given()
				.queryParam("key","qaclick123")
				.body("{\"place_id\":\""+place_id+"\"}")
				.when()
				.get(delResource)
				.then()
				.assertThat()
				.statusCode(200);
	}

}
