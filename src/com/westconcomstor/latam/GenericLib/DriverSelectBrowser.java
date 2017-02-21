package com.westconcomstor.latam.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class DriverSelectBrowser{
	
	public static WebDriver driver;
	public static WebDriver getBrowser() throws InterruptedException{
		
		if (Constants.browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "/Users/Swapnil/Selenium/chromedriver");
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(Constants.url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		else if (Constants.browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "");
			
		}
		
		else if (Constants.browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "/Users/Swapnil/Selenium/geckodriver");
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(Constants.url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		
		else
		{
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
			driver = new SafariDriver();
			driver.manage().window().maximize();
			driver.get(Constants.url);
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		return driver;

	}
}
