package com.westconcomster.pageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.westconcomstor.latam.GenericLib.WebDriverCommonLib;

import org.testng.Assert;

public class login extends WebDriverCommonLib{

	WebDriver driver;
	@FindBy(xpath="")
	private WebElement titleTest;
	
	@FindBy(id="email")
	private WebElement userIDEdit;

	@FindBy(xpath="")
	private WebElement passwordEdit;

	@FindBy(xpath="")
	private WebElement loginBtn;
	
	@FindBy(xpath="")
	private WebElement errMsg;
	
	@FindBy(xpath="")
	private WebElement forgotPass;
	
	
	public login(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uid){
		userIDEdit.sendKeys(uid);
	}
	
	public void setUserPwd(String pwd){
		passwordEdit.sendKeys(pwd);
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
	
	public void validateErrorMessage(){
		
		String errorMassage= errMsg.getText();
		Assert.assertEquals(errorMassage, "Email address or password is incorrect");
	}
	
	public void logintoportal(String un,String pw)
	{
		
		userIDEdit.sendKeys(un);
		passwordEdit.sendKeys(pw);
		loginBtn.click();
	}
	
	
}
