package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class MO365WestconServices extends DriverSelectBrowser{

	public void mo365WestconServices(WebDriver driver,String region) throws InterruptedException{
		
		if(region.equals("BR")){
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconMobility®][include]']")).click();
			WebElement wsP1=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconMobility®][include]']/option[1]"));
			wsP1.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconCriptografia®][include]']")).click();
			WebElement wsP2=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconCriptografia®][include]']/option[1]"));
			wsP2.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconSolutionPack®][include]']")).click();
			WebElement wsP3=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconSolutionPack®][include]']/option[1]"));
			wsP3.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconE-mailMigration®(IMAP)][include]']")).click();
			WebElement wsP4=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconE-mailMigration®(IMAP)][include]']/option[1]"));
			wsP4.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconE-mailMigration®(Exchange)][include]']")).click();
			WebElement wsP5=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconE-mailMigration®(Exchange)][include]']/option[1]"));
			wsP5.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconProjetosEspeciais(HorasComerciais)-Bundle5horas][include]']")).click();
			WebElement wsP6=driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconProjetosEspeciais(HorasComerciais)-Bundle5horas][include]']/option[1]"));
			wsP6.sendKeys("YES");

			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconProjetosEspeciais(HorasNãoComerciais)-Bundle5horas][include]']")).click();
			WebElement wsP7 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconProfessionalServices][WestconProjetosEspeciais(HorasNãoComerciais)-Bundle5horas][include]']/option[1]"));
			wsP7.sendKeys("YES");

			Thread.sleep(1000);
			
/*			//Qty field
			driver.findElement(By.xpath("//input[@name='root[product][licenses][westconProfessionalServices][WestconProjetosEspeciais(HorasNãoComerciais)-Bundle5horas][licenses]']")).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			System.out.println(">>>>>>Westcon Managed services selected");
*/			
			//Checkboxes
			WebElement chk = (new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][EmailservicesAddons][WestconIntranet®]']"))));
			chk.click();

			WebElement chk2 = driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][EmailservicesAddons][WestconADSync®]']"));
			chk2.click();
			
			Thread.sleep(1000);
			WebElement chk3 =driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][EmailservicesAddons][WestconFederationServer®]']"));
			chk3.click();
			
			
			Thread.sleep(1000);
			WebElement chk4 = driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][EmailservicesAddons][WestconOffice365Setup®]']"));
			chk4.click();
						
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleMobility®(monthly)][include]']")).click();
			WebElement wsP8 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleMobility®(monthly)][include]']/option[1]"));
			wsP8.sendKeys("YES");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleCriptografia®(monthly)][include]']")).click();
			WebElement wsP9 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleCriptografia®(monthly)][include]']/option[1]"));
			wsP9.sendKeys("YES");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleSolutionPack®(monthly)][include]']")).click();
			WebElement wsP10 = driver.findElement(By.xpath(".//select[@name='root[product][licenses][westconManagedServices][WestconControleSolutionPack®(monthly)][include]']/option[1]"));
			wsP10.sendKeys("YES");
			
			System.out.println(">>>>>>>>>>>> Westcon Services added");
			
		}
		else if(region.equals("CO")){
			
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365AdministrationServicesS]']")).click();
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365AdministrationServicesM]']")).click();
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365AdministrationServicesL]']")).click();
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365MSO365Migra-S]']")).click();
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365MSO365Migra-M]']")).click();
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][addons][o365MSO365Migra-L]']")).click();
			System.out.println(">>>>>>>>>>>> Westcon Services added");
		
		}
		else if(region.equals("NA")||region.equals("ZA")){
			
			//Select Westcon Services
			driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][SoftwareAssetManagementAssessment]']")).click();
			WebElement wsNAZA1 = driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][Office365Migrationsperseat-Dataonly]']"));
			wsNAZA1.clear();
			wsNAZA1.sendKeys("1");
			Thread.sleep(1000);
			
			WebElement wsNAZA2=driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][Office365Migrationsperseat-Suite]']"));
			wsNAZA2.clear();
			wsNAZA2.sendKeys("1");
			Thread.sleep(1000);
			
			WebElement wsNAZA3=driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][Office365ConfigurationandSupportforNewAccounts]']"));
			wsNAZA3.clear();
			wsNAZA3.sendKeys("1");
			Thread.sleep(1000);
			
			WebElement wsNAZA4=driver.findElement(By.xpath(".//input[@name='root[product][licenses][westconProfessionalServices][ExchangeOnline–ConfigurationandSupportforNewAccounts]']"));
			wsNAZA4.clear();
			wsNAZA4.sendKeys("1");
			Thread.sleep(1000);
			
			System.out.println(">>>>>>>>>>>> Westcon Services added");
		}
		else if(region.equals("MX")){
			
			System.out.println("MX Has no Westcon Services so clicking on Next button");
		}
			
		
	}
}
