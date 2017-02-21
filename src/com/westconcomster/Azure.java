package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.westconcomstor.latam.GenericLib.Constants;
import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class Azure extends DriverSelectBrowser{

	public void azureOrder(WebDriver driver,String region) throws InterruptedException{
		String winHandleBefore = driver.getWindowHandle();
		driver.findElement(By.xpath("//p[contains(.,'Buy Now')]")).click();
		
		//Select the customer
		for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	    System.out.println(">>>>>>>>>>inside child window");
	    
	    //Search for the customer
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(.//*[@id='search_value'])[4]")).clear();
	    driver.findElement(By.xpath("(.//*[@id='search_value'])[4]")).sendKeys(Constants.companyName);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(".//*[@id='customersList']/div[1]/ul/div[1]/div/div[2]/div/ecommerceselectable-customer/div/div[3]/div")).click();
		
	    //Select AZURE
	    driver.findElement(By.xpath("(.//*[@id='search_value'])[5]")).clear();
	    driver.findElement(By.xpath("(.//*[@id='search_value'])[5]")).sendKeys("AZURE");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ecommerceselectable-product/div/div[3]/div/p")).click();
	    (new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='quoteName']"))).sendKeys("LATAM_Azure_Order");
	    
	    Select dropdown = new Select(driver.findElement(By.name("root[contract][supportLevel]")));
	    dropdown.selectByIndex(1);
	    //Add reseller Margin
	    driver.findElement(By.name("root[contract][resellermargin]")).clear();
	    driver.findElement(By.name("root[contract][resellermargin]")).sendKeys("10");
	    System.out.println(">>>>>>>Reseller Margin Added");
	    driver.findElement(By.name("root[contract][billenduser]")).click();
	    System.out.println(">>>>>>>>Bill End User");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
				
		//Add Estimate Price
		driver.findElement(By.xpath("//input[@name='root[product][categories][estimatedPrice]']")).clear();
		driver.findElement(By.xpath("//input[@name='root[product][categories][estimatedPrice]']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@name='root[product][categories][estimatedPrice]']")).sendKeys(Keys.TAB);

		AzureWestconServices azWS = new AzureWestconServices();
		azWS.azureWestconServices(driver, region);
		
		//Total price
		WebElement price=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()[contains(.,'Total:')]]")));
		String totalAmt = price.getText().substring(price.getText().indexOf(":")+1).trim();
		System.out.println(">>>>>>>>>>>TotalAmount :"+totalAmt);
			    
		//Click Next Button
		(new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//.[contains(text(),'Next')]")))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//button[contains(text(),'Submit Order')]")).click();
		System.out.println(">>>>>>>>Order Submitted ");
		Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//input[@name='root[microsoft_info][domain_prefix]']")).isDisplayed() ){
		//Add domain
			WebElement domain1 = (new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='root[microsoft_info][domain_prefix]']"))));
			domain1.sendKeys(Constants.domian);
			domain1.sendKeys(Keys.TAB);
			Thread.sleep(10000);
			break;
			    }
			    	    
		//PO Number
		String orderNumber = driver.findElement(By.xpath(".//ecommercewizardstep[4]/section/div/div[2]/p")).getText().replaceAll("\\D", "").trim();;
		System.out.println(">>>>>>>>>>>Order number :" +orderNumber);
			    
		//Click on Close Button
		driver.findElement(By.xpath("//ecommercewizardstep[4]/section/div/div[2]/article/button[2]")).click();
			    
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(10000);
		
		//*******Verify Order on Portal
		String orderScreenOrder = driver.findElement(By.xpath(".//*[@id='orders']/div/section[2]/div[1]/div[2]/div/div[2]/div/order/div[1]/div/div[1]/div[3]/div/div[1]/div[2]/div[2]")).getText();
		System.out.println(">>>>>>>>>> OrderID :" +orderScreenOrder);
		if (orderScreenOrder.equals(orderNumber)){
			 
			System.out.println(">>>>>> PASS <<<<<<< Azure Order Created Successfully on portal");
			    }
		else
			    {
			    	System.out.println("Order FAILED");
			    }

		}
	}
}
	
