package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.westconcomstor.latam.GenericLib.Constants;
import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class CreateCustomer extends DriverSelectBrowser implements Constants{
	
	public void clickCustNavigation() throws InterruptedException{
		
		driver.findElement(By.xpath(Constants.customerPageNavigation)).click();
		Thread.sleep(5000);
	}
	
	public void clickAddCustomer() throws InterruptedException{
		driver.findElement(By.xpath(Constants.addNewCustomer)).click();
		Thread.sleep(5000);
	}
	
	public void clickManagerDropdown() throws InterruptedException{
		
		driver.findElement(By.xpath(Constants.clickManagerDropDown)).click();
		Thread.sleep(1000);
	}
	
	public void selectManager() throws InterruptedException{
		
		driver.findElement(By.xpath(Constants.selectManagerDropDown)).click();
	}
	
	public void clickResellerInfoNextBtn() throws InterruptedException{
		
		driver.findElement(By.xpath(Constants.selectManagerNext)).click();
		Thread.sleep(3000);
	}
	
	public void companyName() throws InterruptedException{
		driver.findElement(By.xpath(Constants.companyField)).sendKeys(Constants.companyName);
		
	}
	
	public void companyId() throws InterruptedException{
		driver.findElement(By.xpath(Constants.custIdField)).sendKeys(Constants.custId);
		
	}
	
	public void companyAddress() throws InterruptedException{
		
		driver.findElement(By.xpath(Constants.streetAddressField)).sendKeys(Constants.streetAddress);
		
	}
	
	public void companyCity() throws InterruptedException{
		driver.findElement(By.xpath(Constants.cityfield)).sendKeys(Constants.city);
		
	}
	
	public void companyState() throws InterruptedException{
		driver.findElement(By.xpath(Constants.stateField)).sendKeys(Constants.state);
		
	}
	
	public void companyZipCodeBR() throws InterruptedException{
		driver.findElement(By.xpath(Constants.zipCodeField)).sendKeys(Constants.zipCodeBR);
		
	}
	
	public void companyZipCodeCO() throws InterruptedException{
		driver.findElement(By.xpath(Constants.zipCodeField)).sendKeys(Constants.zipCodeCO);
		
	}
	
	public void companyZipCodeZA() throws InterruptedException{
		driver.findElement(By.xpath(Constants.zipCodeField)).sendKeys(Constants.zipCodeZA);
		
	}
	
	public void companyZipCodeNA() throws InterruptedException{
		driver.findElement(By.xpath(Constants.zipCodeField)).sendKeys(Constants.zipCodeNA);
		
	}
	
	public void companyZipCodeMX() throws InterruptedException{
		driver.findElement(By.xpath(Constants.zipCodeField)).sendKeys(Constants.zipCodeMX);
		
	}
	
	public void companyPhone() throws InterruptedException{
		driver.findElement(By.xpath(Constants.phoneField)).sendKeys(Constants.phone);
		
	}
	
	public void clickCompanyNextBtn() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constants.companyNextButton)).click();
		Thread.sleep(3000);
	}
	
	public void contactFirstName() throws InterruptedException{
		driver.findElement(By.xpath(Constants.contactFirstNameField)).sendKeys(Constants.contactFirstName);
		
	}
	
	public void contactLastName() throws InterruptedException{
		driver.findElement(By.xpath(Constants.contactLastNameField)).sendKeys(Constants.contactLastName);
		
	}
	
	public void contactEmail() throws InterruptedException{
		driver.findElement(By.xpath(Constants.contactEmailField)).sendKeys(Constants.contactEmail);
		
	}
	
	public void contactPhone() throws InterruptedException{
		driver.findElement(By.xpath(Constants.contactPhoneField)).sendKeys(Constants.contactPhone);
		
	}
	
	public void companyTaxId() throws InterruptedException{
		driver.findElement(By.xpath(Constants.companyTaxIdField)).sendKeys(Constants.companyTaxId);
		
	}
	
	public void companyGenCompanyName() throws InterruptedException{
		driver.findElement(By.xpath(Constants.companyCompanyField)).sendKeys(Constants.companyCompanyName);
		driver.findElement(By.xpath(Constants.companyCompanyField)).sendKeys(Keys.TAB);
		
	}
	
	public void orgStateTaxCode() throws InterruptedException{
		driver.findElement(By.xpath(Constants.orgStateTaxCode)).sendKeys(Constants.orgStateTax);
		
	}
	
	public void orgMunicipalTaxCode() throws InterruptedException{
		driver.findElement(By.xpath(Constants.orgMunicipalTaxCode)).sendKeys(Constants.orgMunicipalTax);
		
	}
	
	public void nfeName() throws InterruptedException{
		driver.findElement(By.xpath(Constants.nfeName)).sendKeys(Constants.nfeContactName);
		
	}
	public void nfeEmail() throws InterruptedException{
		driver.findElement(By.xpath(Constants.nfeEmail)).sendKeys(Constants.nfeContactEmail);
		driver.findElement(By.xpath(Constants.nfeEmail)).sendKeys(Keys.TAB);
		
	}
	
	public void scrollDown() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(3000);
	}
	
	public void adddetailNextBtn() throws InterruptedException{
	 
		driver.findElement(By.xpath(Constants.adddetailsNextBtn)).click();
		Thread.sleep(5000);
	}
	
	public void createCustBtn(){
		driver.findElement(By.xpath(Constants.createCustBtn)).click();
	}
	
}
