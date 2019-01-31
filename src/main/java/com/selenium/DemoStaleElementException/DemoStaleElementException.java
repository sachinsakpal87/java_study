package com.selenium.DemoStaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoStaleElementException {

	/**
	 * In this test case we have created WebElement.
	 * Then Page gets loaded generally accidentally due to ajax call.
	 * And then we are using the element which is causing the stale element.
	 * To avoid below scenario always load element when ever require.
	 */
	@Test
	public void testMethod() {
		String userDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDir + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck"));
		driver.get(driver.getCurrentUrl());
		bmwcheck.click();

//		//Use below code to avoid stale element exception.
//		driver.get("https://learn.letskodeit.com/p/practice");
//		driver.get(driver.getCurrentUrl());
//		WebElement bmwcheck_working = driver.findElement(By.id("bmwcheck"));
//		bmwcheck_working.click();

	}
}
