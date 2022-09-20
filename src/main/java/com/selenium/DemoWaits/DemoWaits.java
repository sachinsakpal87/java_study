//package com.selenium.DemoWaits;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotVisibleException;
//import org.openqa.selenium.NotFoundException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.testng.annotations.Test;
//
//import com.google.common.collect.ImmutableSet;
//
//public class DemoWaits {
//	@Test
//	public void testWait() {
//
//
//		String userDir = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", userDir + "/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		driver.get("https://www.freecrm.com/index.html");
//		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
//
////		Wait wait = new WebDriverWait(driver,300);
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Log In')]")));
////		//Thread.sleep(1000);
////
////		new FluentWait<>(driver)
////				.withTimeout(Duration.ofMillis(1000))
////				.ignoreAll(ImmutableSet.of(NotFoundException.class, ElementNotVisibleException.class))
////				.until(wd->wd.findElements(By.xpath("//span[contains(text(),'Loged In')]")));
//
//		new FluentWait<>(we)
//				.withTimeout(Duration.ofMillis(100000))
//				.ignoreAll(ImmutableSet.of(NotFoundException.class, ElementNotVisibleException.class))
//				.until(webElement->webElement.isDisplayed());
//
//	}
//}
