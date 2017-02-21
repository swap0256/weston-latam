package com.westconcomstor.latam.GenericLib;

public interface Constants {
String filePath="";
String userIDNA = "admin@nae2etestvar.com"; //Use this User field for Regions : TZ,GH,MU,KE,BW,ZM,RW,UG
String passwordNA = "nae2etestvar@0101"; //Use this pwd field for Regions : TZ,GH,MU,KE,BW,ZM,RW,UG
String userIDZA = "admin@zae2etestvar.com";
String passwordZA = "zae2etestvar@0101"; // Use this USer field for Regions : ZW
String userIDBR = "admin@bre2etestvar.com";
String passwordBR = "bre2etestvar@0101";
String userIDCO = "admin@coe2etestvar.com";
String passwordCO = "coe2etestvar@0101";
String userIDMX = "admin@mxe2etestvar.com";
String passwordMX = "mxe2etestvar@0101";
String url="https://bluesky.wgcloudconnect.com";
String browser = "firefox";
String zipCodeBR = "12345-878";
String zipCodeNA = "1234";
String zipCodeZA = "1234";
String zipCodeCO = "1234";
String zipCodeMX = "12345";
String phone = "098765432";
String state = "Test State";
String city = "Test City";
String companyName = "LATAM_Auto" + new GenerateData().generateRandomNumber(7);
String domian = "domain"+ new GenerateData().generateRandomNumber(7);
String custId = "TAXID";
String streetAddress="Test Street Address";
String contactFirstName="selenium";
String contactLastName="Test";
String contactEmail="selenium@test.com";
String contactPhone="98987890";
String companyTaxId="67657";
String companyCompanyName="ToTheNEW";
String orgStateTax="76787";
String orgMunicipalTax="121241";
String nfeContactName="SeleniumTest";
String nfeContactEmail="seleniumtest@gmail.com";

//Customer Page 1
String addNewCustomer = ".//p[contains(text(),'Add Customer')]";
String customerPageNavigation = "//span[contains(text(),'Customers')]";
String clickManagerDropDown = "//article[@class='padding-40-top']/div/dropdown/div/button";
String selectManagerDropDown = "//ul[@ng-click='toggleSelect()']/li[3]/a";
String selectManagerNext = "(//button[@type='button'])[.='Next step']"; 

//Company Information
String companyField=".//input[@name='customer']";
String custIdField=".//input[@name='idOptional']";
String streetAddressField=".//input[@name='address']";
String cityfield=".//input[@name='city']";
String stateField=".//input[@name='state']";
String zipCodeField="//div[@name='zipCode']/input";
String phoneField = "//input[@name='phone']";
String companyNextButton = "//form[@name='createCustomerStep2']/div[2]/article/div[2]/button";

//Main Contact
String contactFirstNameField="//input[@name='root[country_info][contact][first_name]']";
String contactLastNameField="//input[@name='root[country_info][contact][last_name]']";
String contactEmailField="//input[@name='root[country_info][contact][email]']";
String contactPhoneField="//input[@name='root[country_info][contact][phone_number]']";

//Company General Details fields
String companyTaxIdField="//input[@name='root[country_info][company][generalDetails][taxID]']";
String companyCompanyField="//input[@name='root[country_info][company][generalDetails][companyName]']";

//Organisation Information Fields
String orgStateTaxCode="//input[@class='form-control'and@name='root[country_info][company][organization][stateTaxCode]']";
String orgMunicipalTaxCode="//input[@class='form-control'and@name='root[country_info][company][organization][municipalTaxCode]']";

//Contact responsible for Nfe
String nfeName="//input[@name='root[country_info][company][nfeContact][name]']";
String nfeEmail="//input[@name='root[country_info][company][nfeContact][email]']";
String adddetailsNextBtn="//button[@class='submit btn btn-default bigest-button pull-left']";

//Data Confirmation
String createCustBtn=".//section/div/article/div[2]/button";



}
