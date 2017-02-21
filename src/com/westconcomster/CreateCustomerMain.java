package com.westconcomster;

import org.openqa.selenium.WebDriver;

public class CreateCustomerMain{
	
	public void createCustomer(String region,WebDriver driver) throws InterruptedException{
		

		CreateCustomer cc= new CreateCustomer();
		cc.clickCustNavigation();
		cc.clickAddCustomer();
		cc.clickManagerDropdown();
		cc.selectManager();
		cc.clickResellerInfoNextBtn();
		// Company Information
		cc.companyName();
		cc.companyId();
		cc.companyAddress();
		cc.companyCity();
		cc.companyState();
		
		if(region.equals("BR"))
		{
			cc.companyZipCodeBR();
			cc.companyPhone();
			cc.clickCompanyNextBtn();
			// Additional Details
			cc.contactFirstName();
			cc.contactLastName();
			cc.contactEmail();
			cc.contactPhone();
			cc.companyTaxId();
			cc.companyGenCompanyName();
			cc.orgStateTaxCode();
			cc.orgMunicipalTaxCode();
			cc.nfeName();
			cc.nfeEmail();			
			cc.scrollDown();
			cc.adddetailNextBtn();
			// details
			cc.createCustBtn();
		}
		else if(region.equals("ZA")||region.equals("NA")||region.equals("MX"))
		{
			if(region.equals("ZA")){
				cc.companyZipCodeZA();
			}
			else{
				cc.companyZipCodeMX();
				}
			cc.companyPhone();
			cc.clickCompanyNextBtn();
			// Additional Details
			cc.contactFirstName();
			cc.contactLastName();
			cc.contactEmail();
			cc.contactPhone();
			cc.companyGenCompanyName();
			cc.scrollDown();
			cc.adddetailNextBtn();
			// details
			cc.createCustBtn();	
		}
		else{
			
			cc.companyZipCodeCO();
			cc.companyPhone();
			cc.clickCompanyNextBtn();
			// Additional Details
			cc.contactFirstName();
			cc.contactLastName();
			cc.contactEmail();
			cc.contactPhone();
			cc.companyTaxId();
			cc.companyGenCompanyName();
			cc.scrollDown();
			cc.adddetailNextBtn();
			// details
			cc.createCustBtn();
			
		}
		
		 
	}
		
	
}
