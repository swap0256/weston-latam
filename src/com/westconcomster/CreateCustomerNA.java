package com.westconcomster;

import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;
import com.westconcomstor.latam.GenericLib.WebDriverCommonLib;

public class CreateCustomerNA{
	
	public String naOrderTest(String region) throws InterruptedException{

//		String region = "NA";
		System.out.println("***************In Region NA*************");
		DriverSelectBrowser.getBrowser();
		// ****login to Bluesky
		LoginBluesky loginblue = new LoginBluesky();
		loginblue.login(region,DriverSelectBrowser.driver);

		// ******Verify Title
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.getTitle(DriverSelectBrowser.driver);
		
		// ********Create Customer
		CreateCustomerMain ccm = new CreateCustomerMain();
		ccm.createCustomer(region,DriverSelectBrowser.driver);


		// *******Verify Create Customer Toast Message
		wlib.verifyCustCreationToastMsg(DriverSelectBrowser.driver);

		Thread.sleep(5000);
		
		//******* Create MO365 Order for the same Customer
		MO365 mo = new MO365();
		mo.mo365Order(DriverSelectBrowser.driver,region);
		Thread.sleep(5000);
		
		//******* Create Azure Order for the same Customer
		Azure az = new Azure();
		az.azureOrder(DriverSelectBrowser.driver,region);
		Thread.sleep(5000);
		
		DriverSelectBrowser.driver.quit();
		String region3 = "MX";
		return region3;
	}
}
