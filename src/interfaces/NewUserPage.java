package interfaces;

import org.openqa.selenium.By;

public class NewUserPage {
	
	public static By txtFirstName = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_FirstName']");
	public static By txtLastName = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_LastName']");
	public static By txtPassword = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtUser_Password']");
	public static By txtMobile = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtUser_MobilePhone']");
	public static By txtAddress = By.xpath("//textarea[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_Address']");
	public static By txtBirthday = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_BirthDay']");
	public static By txtEmail = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtUser_Email']");	
	public static By txtType = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_Type']");
	public static By cbbAreaMobile = By.xpath("//select[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_CountryCodeId']");
	public static String dynamicAreaMobile = ("//option[text()='%s']");
	public static By cbbGender = By.xpath("//select[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_GenderId']");
	public static String dynamicGender = ("//option[text()='%s']");
	public static By cbbMarital = By.xpath("//select[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_MaritalStatusId']");
	public static String dynamicMarital = ("//option[text()='%s']");
	public static By cbbSalutation = By.xpath("//select[@id='DublinTheme_wt39_block_wtMainContent_wtProfile_SalutationId']");
	public static String dynamicSalutation = ("//option[text()='%s']");
	public static By btnSave = By.xpath("//input[@id='DublinTheme_wt39_block_wtMainContent_wt61']");

}
