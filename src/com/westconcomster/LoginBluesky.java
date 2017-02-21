package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.westconcomstor.latam.GenericLib.Constants;

public class LoginBluesky{
	

	public void login(String region,WebDriver driver ) throws InterruptedException{
		Thread.sleep(3000);
		
		if(region.equals("NA")){
		driver.findElement(By.id("email")).sendKeys(Constants.userIDNA);
		driver.findElement(By.id("password")).sendKeys(Constants.passwordNA);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		}
		else if(region.equals("ZA")){
		driver.findElement(By.id("email")).sendKeys(Constants.userIDZA);
		driver.findElement(By.id("password")).sendKeys(Constants.passwordZA);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
				
		}
		else if(region.equals("BR")){
		Thread.sleep(7000);
		driver.findElement(By.id("email")).sendKeys(Constants.userIDBR);
		driver.findElement(By.id("password")).sendKeys(Constants.passwordBR);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
					
		}
		else if(region.equals("CO")){
		driver.findElement(By.id("email")).sendKeys(Constants.userIDCO);
		driver.findElement(By.id("password")).sendKeys(Constants.passwordCO);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
					
		}
		else if(region == "MX"){
		driver.findElement(By.id("email")).sendKeys(Constants.userIDMX);
		driver.findElement(By.id("password")).sendKeys(Constants.passwordMX);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
					
		}
	}

}
