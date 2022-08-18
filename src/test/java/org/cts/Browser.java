package org.cts;


import org.utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browser extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		winMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		WebElement txtUser=driver.findElement(By.id("email"));
		fill(txtUser,"greens");
		WebElement txtPass=driver.findElement(By.name("pass"));
		fill(txtPass,"greens@123");
		WebElement btn=driver.findElement(By.name("login"));
		btnClick(btn);
		
	}
	

}
