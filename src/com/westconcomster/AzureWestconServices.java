package com.westconcomster;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.westconcomstor.latam.GenericLib.DriverSelectBrowser;

public class AzureWestconServices extends DriverSelectBrowser{

	public void azureWestconServices(WebDriver driver,String region) throws InterruptedException{
		
		if(region.equals("BR")){
			//Select Westcon Services
			
			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconBackupSetup®][include]']")).click();
			WebElement wsP1=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP1.sendKeys("YES");
			wsP1.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconDisasterRecovery®][include]']")).click();
			WebElement wsP2=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP2.sendKeys("YES");
			wsP2.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconCloudVPN®][include]']")).click();
			WebElement wsP3=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP3.sendKeys("YES");
			wsP3.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconServerMigration®][include]']")).click();
			WebElement wsP4=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[4]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP4.sendKeys("YES");
			wsP4.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconFileServerMigration®][include]']")).click();
			WebElement wsP5=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[5]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP5.sendKeys("YES");
			wsP5.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconApplicationServerMigration®][include]']")).click();
			WebElement wsP6=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[6]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP6.sendKeys("YES");
			wsP6.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconLoginSeguro®][include]']")).click();
			WebElement wsP7=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[7]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP7.sendKeys("YES");
			wsP7.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconProjetosEspeciais(HorasComerciais)-Bundle5horas][include]']")).click();
			WebElement wsP8=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[8]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP8.sendKeys("YES");
			wsP8.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconProfessionalServices][WestconProjetosEspeciais(HorasNãoComerciais)-Bundle5horas][include]']")).click();
			WebElement wsP9=driver.findElement(By.xpath(".//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[9]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsP9.sendKeys("YES");
			wsP9.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			
			//CheckBoxes
			WebElement chk1 = (new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@name='root[product][westconProfessionalServices][BackupAddon][WestconBackupAssessment®]']"))));
			chk1.click();
			chk1.sendKeys(Keys.TAB);
			WebElement chk2 = driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][EmailservicesAddons][WestconADSync®]']"));
			chk2.click();
			chk2.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			WebElement chk3 =driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][EmailservicesAddons][WestconFederationServer®]']"));
			chk3.click();
			chk3.sendKeys(Keys.TAB);
			
			//Westcon Managed Services
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleBackup®(monthly)][include]']")).click();
			WebElement wsMS1=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS1.sendKeys("YES");
			wsMS1.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleDisaterRecovery®(monthly)][include]']")).click();
			WebElement wsMS2=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS2.sendKeys("YES");
			wsMS2.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleBancodeDados®(monthly)][include]']")).click();
			WebElement wsMS3=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS3.sendKeys("YES");
			wsMS3.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleMaquinaVirtual(monthly)][include]']")).click();
			WebElement wsMS4=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[4]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS4.sendKeys("YES");
			wsMS4.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleCloudVPN®(monthly)][include]']")).click();
			WebElement wsMS5=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[5]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS5.sendKeys("YES");
			wsMS5.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleLoginSeguro®(monthly)][include]']")).click();
			WebElement wsMS6=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[6]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS6.sendKeys("YES");
			wsMS6.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//select[@name='root[product][westconManagedServices][WestconControleCriptografia®(monthly)][include]']")).click();
			WebElement wsMS7=driver.findElement(By.xpath("		.//*[@id='editorjsonform']/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[7]/div/div[2]/div/div/div[1]/div/div[1]/select"));
			wsMS7.sendKeys("YES");
			wsMS7.sendKeys(Keys.TAB);
			Thread.sleep(1000);

			
		}
		else if(region.equals("CO")){
					
					//Checkboxes
					Thread.sleep(1000);
					WebElement chk1 = driver.findElement(By.xpath(".//input[@name='root[product][addons][MSAzNetBasic]']"));
					chk1.click();
					chk1.sendKeys(Keys.TAB);
					Thread.sleep(1000);
					WebElement chk2 =driver.findElement(By.xpath(".//input[@name='root[product][addons][MSAzNet-Standard]']"));
					chk2.click();
					chk2.sendKeys(Keys.TAB);
					Thread.sleep(1000);
					WebElement chk3 =driver.findElement(By.xpath(".//input[@name='root[product][addons][MSAzVm]']"));
					chk3.click();
					chk3.sendKeys(Keys.TAB);
					Thread.sleep(1000);
					WebElement chk4 =driver.findElement(By.xpath(".//input[@name='root[product][addons][MSAzStorage]']"));
					chk4.click();
					chk4.sendKeys(Keys.TAB);
					Thread.sleep(1000);
					WebElement chk5 =driver.findElement(By.xpath(".//input[@name='root[product][addons][MSCloud-HrStandard]']"));
					chk5.click();
					chk5.sendKeys(Keys.TAB);
					Thread.sleep(1000);
					WebElement chk6 =driver.findElement(By.xpath(".//input[@name='root[product][addons][MSCloud-HrAdvance]']"));
					chk6.click();
					chk6.sendKeys(Keys.TAB);
					System.out.println(">>>>>>>>>>>> Westcon Services Added");

			
		}
		else if(region.equals("NA")||region.equals("ZA")){
			
			//Select Westcon Services
			WebElement ws1 = driver.findElement(By.xpath("//input[@name='root[product][westconProfessionalServices][SoftwareAssetManagementAssessment]']"));
			ws1.click();
			WebElement ws2 = driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][AzureBackupServices-ExchangeServers]']"));
			ws2.clear();
			ws2.sendKeys("1");
			WebElement ws3 = driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][AzureBackupServices-SharepointServers]']"));
			ws3.clear();
			ws3.sendKeys("1");
			WebElement ws4 = driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][AzureBackupServices-SQLServers]']"));
			ws4.clear();
			ws4.sendKeys("1");
			WebElement ws5 = driver.findElement(By.xpath(".//input[@name='root[product][westconProfessionalServices][AzureBackupServices-WindowsServers]']"));
			ws5.clear();
			ws5.sendKeys("1");
			ws5.sendKeys(Keys.TAB);
			System.out.println(">>>>>>>>>>>> Westcon Services added");
			
		}
		else if(region.equals("MX")){
			
			System.out.println("MX Has no Westcon Services so clicking on Next button");
			
		}
	}
	
}
