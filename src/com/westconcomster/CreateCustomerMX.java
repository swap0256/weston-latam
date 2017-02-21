package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import com.westconcomstor.latam.GenericLib.Constants;
import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;
import com.westconcomstor.latam.GenericLib.WebDriverCommonLib;

public class CreateCustomerMX{
	
		public static void main(String[] args) throws InterruptedException {
		}
		
		public void mxOrderTest(String region) throws InterruptedException{
			
			DriverSelectBrowser.getBrowser();
			long startTime = System.nanoTime();
			System.out.println("Start Time" + startTime);
			
			
			System.out.println("***************In Region MX*************");
			// ****login to Bluesky
			LoginBluesky loginblue = new LoginBluesky();
			loginblue.login(region,DriverSelectBrowser.driver);

			// ******Verify Title
			WebDriverCommonLib wlib = new WebDriverCommonLib();
			wlib.getTitle(DriverSelectBrowser.driver);

			// Navigate to Create Customer
			DriverSelectBrowser.driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
			Thread.sleep(5000);
			DriverSelectBrowser.driver.findElement(By.xpath("//p[contains(text(),'Add Customer')]")).click();
			Thread.sleep(2000);
			DriverSelectBrowser.driver.findElement(By.xpath("//article[@class='padding-40-top']/div/dropdown/div/button")).click();
			DriverSelectBrowser.driver.findElement(By.xpath("//ul[@ng-click='toggleSelect()']/li[3]/a")).click();
			// Next button-1
			DriverSelectBrowser.driver.findElement(By.xpath("//article[@class='col-xs-12 padding-20-top center-text ng-scope']/button")).click();
			
			// Step-2 Company info
			// Company Name
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='customer']")).sendKeys(Constants.companyName);
			// ID
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='idOptional']")).sendKeys("TEST-ID");
			// Street address
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Test Street Address");
			// City
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Test City");
			// State
			DriverSelectBrowser.driver.findElement(By.name("state")).sendKeys(Constants.state);
			// ZipCode
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@class='input_size_medium form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern ng-not-modified']")).sendKeys(Constants.zipCodeMX);
			// phone
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Constants.phone);
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Keys.TAB);
			Thread.sleep(5000);
			// Next Button-2
			DriverSelectBrowser.driver.findElement(By.xpath("//form[@name='createCustomerStep2']/div[2]/article/div[2]/button")).click();

			// Step-3 MCP
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@name='root[microsoft_info][domain_prefix]']")).sendKeys("domain" + genData.generateRandomAlphaNumeric(5));
//			Thread.sleep(2000);
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][contact][first_name]']")).sendKeys("selenium");
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][contact][last_name]']")).sendKeys("test1");
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][contact][email]']")).sendKeys("selenium@test1.com");
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][contact][phone_number]']")).sendKeys("45896236");
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][company][generalDetails][companyName]']")).sendKeys("tothenew");
			DriverSelectBrowser.driver.findElement(By.xpath("//input[@name='root[country_info][company][generalDetails][companyName]']")).sendKeys(Keys.TAB);
			Thread.sleep(10000);

			// click on Next button
			JavascriptExecutor jse = (JavascriptExecutor)DriverSelectBrowser.driver;
			jse.executeScript("window.scrollBy(0,800)", "");
			Thread.sleep(5000);
			DriverSelectBrowser.driver.findElement(By.xpath("//form[@class='ng-pristine ng-valid ng-scope']/div[2]/article/div[2]/button")).click();
			Thread.sleep(2000);

			// Step-4 details
			Thread.sleep(5000);
			DriverSelectBrowser.driver.findElement(By.xpath("//div[@class='ng-scope']/article/div[2]/button")).click();
			Thread.sleep(2000);

			// *******Verify Create Customer Toast Message
			wlib.verifyCustCreationToastMsg(DriverSelectBrowser.driver);

			Thread.sleep(5000);

			MO365 mo = new MO365();
			mo.mo365Order(DriverSelectBrowser.driver,region);
			Thread.sleep(5000);
			Azure az = new Azure();
			az.azureOrder(DriverSelectBrowser.driver,region);
			Thread.sleep(5000);
			
			DriverSelectBrowser.driver.quit();
//			long endTime = System.nanoTime();
//			long totalTime = endTime - startTime;
//			System.out.println("end time" + endTime);
//			System.out.println(totalTime);
//			driver.quit();

		}

}
