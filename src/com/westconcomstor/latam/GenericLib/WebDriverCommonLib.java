package com.westconcomstor.latam.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void waitForPageToLoad() {
		DriverSelectBrowser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public WebElement waitForXpathPresent(String wbxPath) {
		WebDriverWait wait = new WebDriverWait(DriverSelectBrowser.driver, 20);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbxPath)));
		return element;
	}

	public void waitForNamePresent(String wbName) {

		WebDriverWait wait = new WebDriverWait(DriverSelectBrowser.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(wbName)));

	}

	public boolean verifyText(String wbXpath, String expMsg) {

		boolean verify = false;
		String actMsg = DriverSelectBrowser.driver.findElement(By.xpath(wbXpath)).getText();

		if (actMsg.equals(expMsg)) {
			verify = true;
			System.out.println(expMsg + "= msg is verified == Pass");

		} else {
			System.out.println(expMsg + "= msg is not verified == fail");
		}

		return verify;

	}

	public void acceptAlert() {
		Alert alt = DriverSelectBrowser.driver.switchTo().alert();
		alt.accept();
	}

	public void cancelAlert() {
		Alert alt = DriverSelectBrowser.driver.switchTo().alert();
		alt.dismiss();
	}

	public void getTitle(WebDriver driver) throws InterruptedException {

		String title = driver.getTitle();
		Thread.sleep(5000);
		boolean imgStat = driver.findElement(By.xpath("//aside[@id='sidebar-wrapper']/a/img")).isDisplayed();
		if (imgStat == true) {
			System.out.println("image is displayed >>>>>> Pass");
		} else {
			System.out.println("image is not displayed >>>>>> Fail");
		}
		System.out.println(title);
	}

	public void verifyCustCreationToastMsg(WebDriver driver) {
		WebElement toast = driver.findElement(By.xpath("//div[@id='toast-container']/div/div[2]"));
		String toastMsg = toast.getText();
		if (toastMsg.equals("Customer was created successfully.")) {
			System.out.println("Customer created successfully.");
		} else {
			System.out.println("ERROR after clicking SUBMIT BUTTON");
		}
	}

}
