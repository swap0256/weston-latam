package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class MO365AddOns extends DriverSelectBrowser{
	
	public void mo365AddOns(WebDriver driver,String region) throws InterruptedException{
		
		//1. Office 365 Extra File Storage
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][ms53fc25f7-6639-4f78-bb44-3c2dfec3ed40][include]']")).click();
		WebElement aOn2=driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][ms53fc25f7-6639-4f78-bb44-3c2dfec3ed40][include]']/option[1]"));
		aOn2.sendKeys("YES");
		aOn2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		//2. Exchange Online Advanced Threat Protection
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][msa2706f86-868d-4048-989b-0c69e5c76b63][include]']")).click();
		WebElement aOn3=driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][msa2706f86-868d-4048-989b-0c69e5c76b63][include]']/option[1]"));
		aOn3.sendKeys("YES");
		aOn3.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		//3. Skype for Business Cloud PBX
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][ms4260988e-990d-479c-ae7b-f01ce8e1bb4d][include]']")).click();
		WebElement aOn4=driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms796b6b5f-613c-4e24-a17c-eba730d49c02][ms4260988e-990d-479c-ae7b-f01ce8e1bb4d][include]']/option[1]"));
		aOn4.sendKeys("YES");
		aOn4.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		//4. Office 365 Advanced eDiscovery
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms91fd106f-4b2c-4938-95ac-f54f74e9a239][ms6b648c1e-f472-46c0-8379-09f50a3315e0][include]']")).click();
		WebElement aOn7=driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms91fd106f-4b2c-4938-95ac-f54f74e9a239][ms6b648c1e-f472-46c0-8379-09f50a3315e0][include]']/option[1]"));
		aOn7.sendKeys("YES");
		aOn7.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		//5. Delve Analytics
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms91fd106f-4b2c-4938-95ac-f54f74e9a239][ms45320ec9-9b8e-49d0-b900-f14141a0abd1][include]']")).click();
		WebElement aOn8=driver.findElement(By.xpath(".//select[@name='root[product][licenses][addons][microsoftaddonsms91fd106f-4b2c-4938-95ac-f54f74e9a239][ms45320ec9-9b8e-49d0-b900-f14141a0abd1][include]']/option[1]"));
		aOn8.sendKeys("YES");
		aOn8.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		
	}

}
