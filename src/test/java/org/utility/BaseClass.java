package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	 public static void launchBrowser() {
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 }
	 public static void winMax() {
		 driver.manage().window().maximize();
		 
	 }
	 public static void loadUrl(String url) {
		 driver.get(url);
	 }
	 public static void printTitle() {
		System.out.println(driver.getTitle()); 
	 }
	 public static void printCurrentUrl() {
		 System.out.println(driver.getCurrentUrl());
	 }
	 public static void fill(WebElement ele,String value) {
		 ele.sendKeys(value);
	 }
	 public static void btnClick(WebElement ele) {
		 ele.click();
		
	 }
	 

}
