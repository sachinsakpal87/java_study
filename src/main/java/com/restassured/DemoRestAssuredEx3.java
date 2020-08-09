package com.restassured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DemoRestAssuredEx3 {

	@Test
	public void testDynamicResource() throws FileNotFoundException {
		RestAssured.baseURI = "http://216.10.245.166";
		String uri = "/Library/Addbook.php";
		String path = "D:\\work\\java_study\\src\\main\\java\\com\\restassured\\book.json";

		Response response = given()
				.header("Content-Type","application/json")
//				.authentication()
				.when()
				.body(new FileInputStream(new File(path)))
				.get(uri)
				.then()
				.extract().response();

		System.out.println(response.asString());
		JsonPath jsonPath = new JsonPath(response.asString());
		System.out.println((String) jsonPath.get("ID"));
	}
}
