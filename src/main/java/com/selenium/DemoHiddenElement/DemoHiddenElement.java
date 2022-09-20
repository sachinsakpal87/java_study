//package com.selenium.DemoHiddenElement;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class DemoHiddenElement {
//
//	WebDriver webDriver;
//	@BeforeTest
//	public void setup(){
//		String userDir = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.dirver",userDir+"/chromedriver.exe");
//		webDriver = new ChromeDriver();
//	}
//	@Test
//	public void testLetsCodeItHidden(){
//		webDriver.get("https://learn.letskodeit.com/p/practice");
//		WebElement textBox = webDriver.findElement(By.id("displayed-text"));
//		System.out.println("textbox is displayed :: "+textBox.isDisplayed());
//
//		WebElement hideButton = webDriver.findElement(By.id("hide-textbox"));
//		hideButton.click();
//		System.out.println("textbox is displayed :: "+textBox.isDisplayed());
//
//		WebElement showButton = webDriver.findElement(By.id("show-textbox"));
//		showButton.click();
//		System.out.println("textbox is displayed :: "+textBox.isDisplayed());
//
//	}
//
//	@Test
//	public void testExpediaHiddenElement(){
//
////		This example is not valid as expedia now not destroying the element
////		webDriver.get("https://www.expedia.co.in/");
////		webDriver.findElement(By.cssSelector("button.gcw-traveler-amount-select")).click();
////		WebElement ageSelect = webDriver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]//div[@class='children-wrapper']//select[@data-gcw-storeable-name='gcw-child-age-1-1']"));
////		System.out.println("textbox is displayed :: "+ageSelect.isDisplayed());
//
//		////div[@id='traveler-selector-hp-hotel']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']
//	}
//
//	@AfterTest
//	public void tearDown() throws InterruptedException {
//		if(webDriver != null){
//			Thread.sleep(5000);
//			webDriver.quit();
//		}
//	}
//}
