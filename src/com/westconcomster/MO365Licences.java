package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class MO365Licences extends DriverSelectBrowser{
	
	public void mo365Licences(WebDriver driver,String region) throws InterruptedException{
		
		//Windows 10 Enterprise E5
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][msf7f342b3-177c-41f2-8896-7b06c54fc977][include]']")).click();
		WebElement moLicense1=driver.findElement(By.xpath(".//select[@name='root[product][licenses][msf7f342b3-177c-41f2-8896-7b06c54fc977][include]']/option[1]"));
		moLicense1.sendKeys("YES");
		System.out.println("Windows 10 Enterprise E5 Selected");

/*			//Office 365 Business Essentials
		Thread.sleep(5000);
		WebElement moBE = driver.findElement(By.xpath(".//select[@name='root[product][licenses][msbd938f12-058f-4927-bba3-ae36b1d2501c][include]']"));
		moBE.click();
		WebElement moLicense2=driver.findElement(By.xpath(".//select[@name='root[product][licenses][msbd938f12-058f-4927-bba3-ae36b1d2501c][include]']/option[1]"));
		moLicense2.sendKeys("YES");
		//moLicense2.sendKeys(Keys.TAB);
		System.out.println("Office 365 Business Essentials");
					
		//Skype for Business Online (Plan 2)
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms14c61739-b45a-42c0-832c-d330972d3173][include]']")).click();
		Thread.sleep(1000);
		WebElement moLicense3 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms14c61739-b45a-42c0-832c-d330972d3173][include]']/option[1]"));
		moLicense3.sendKeys("YES");
		//moLicense3.sendKeys(Keys.TAB);
		System.out.println("Skype for Business Online (Plan 2)");
					
		//Exchange Online (Plan 1)
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms195416c1-3447-423a-b37b-ee59a99a19c4][include]']")).click();
		WebElement moLicense6 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms195416c1-3447-423a-b37b-ee59a99a19c4][include]']/option[1]"));
		moLicense6.sendKeys("YES");
		//moLicense6.sendKeys(Keys.TAB);
		System.out.println("Exchange Online (Plan 1)");
*/			
		//Office 365 Enterprise E3
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms796b6b5f-613c-4e24-a17c-eba730d49c02][include]']")).click();
		WebElement moLicense4 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms796b6b5f-613c-4e24-a17c-eba730d49c02][include]']/option[1]"));
		moLicense4.sendKeys("YES");
		System.out.println("Office 365 Enterprise E3");
		
		//Office 365 Enterprise E1
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms91fd106f-4b2c-4938-95ac-f54f74e9a239][include]']")).click();
		WebElement moLicense5 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][ms91fd106f-4b2c-4938-95ac-f54f74e9a239][include]']/option[1]"));
		moLicense5.sendKeys("YES");
		System.out.println("Office 365 Enterprise E1");
		
		
		System.out.println(">>>>>>>>>>>> Three Licences Added");

		
	}

}
