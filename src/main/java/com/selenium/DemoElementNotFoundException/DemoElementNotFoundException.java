package com.selenium.DemoElementNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoElementNotFoundException {

	@Test
	public void testDemoElementNotFoundException() {
		String userDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", userDir + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/");
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();

//		driver.findElement(By.id("user_email")).sendKeys("abcdefg@gmail.com");

		//Above call will fail because of time out issue to fix this we can either add implicit
		//implicit wait or explicit wait

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("user_email")).sendKeys("abcdefg@gmail.com");

//		Above approach is again not that efficient as we are not sure of exact time it will take
//		So lets use explicit wait

		WebDriverWait wait = new WebDriverWait(driver, 3);
//		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
//		email.sendKeys("abcdefg@gmail.com");

		//Failed due to incorrect locator (For this page href is complete url
//		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();

//		Below link is removed hence not working.
//		driver.findElement(By.xpath("//a[contains(@href,'/sign_in')]")).click();

		//Failed due to iframe

		driver.get("https://learn.letskodeit.com/p/practice");
//		driver.findElement(By.id("search-courses")).sendKeys("Java");

		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.id("search-courses")).sendKeys("Java");
		driver.switchTo().defaultContent();
	}
}
