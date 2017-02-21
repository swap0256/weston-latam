package com.westconcomster;

import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class Orders extends DriverSelectBrowser{

	public static void main(String[] args) throws InterruptedException {
		
		String region = new CreateCustomerBR().brOrderTest();
		Thread.sleep(5000);
		String region1 = new CreateCustomerCO().coOrderTest(region);
		Thread.sleep(5000);
		String region2 = new CreateCustomerZA().zaoOrderTest(region1);
		Thread.sleep(5000);
		String region3 = new CreateCustomerNA().naOrderTest(region2);
		Thread.sleep(5000);
		new CreateCustomerMX().mxOrderTest(region3);
	}

}
