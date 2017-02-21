package com.westcon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new SafariDriver();
		driver.get("https://awg-latam.verecloud.com");
		
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
