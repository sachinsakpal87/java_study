package com.selenium.DemoElementNotClickableAtPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoElementNotClickableAtPoint {

	/**
	 * Element not clickable at point exception occurred because even if site is loaded
	 * in the browser. some ajax call was is progress which can be seen as a spinner which
	 * was overlapping login button hence error was given that it may receive hit at
	 * point(919,177) with element id="preloader"
	 */
	@Test
	public void testDemoElementNotClickableAtPoint() {
		String userDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDir + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("testing");
//		WebElement loginBtn = driver.findElement(By.cssSelector(".input-group-btn"));

//		Below Method will not work as explained above
//		loginBtn.click();

//		//Lets try with wait which will also not help see below
//		WebDriverWait wait = new WebDriverWait(driver, 3);
//		wait.until(ExpectedConditions.visibilityOf(loginBtn));
//		loginBtn.click();

//		Lets wait till spinner gets invisible (Web element details were present in exception
//		id = preloader used same from exception
		/*WebDriverWait wait = new WebDriverWait(driver, 3);
		boolean flag = wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("preloader"))));
		if(flag) {
			loginBtn.click();
		}*/

		//There is third way to execute it is using javascriptExecutor

		WebElement loginBtn = driver.findElement(By.cssSelector(".input-group-btn"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Before");
		js.executeScript("arguments[0].click();", loginBtn);
		System.out.println("after");
	}
}
