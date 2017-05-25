package actions.page;

import org.openqa.selenium.WebDriver;

public class NewUserPage extends AbstractPage{
	
	public NewUserPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterNewUser (String firstName, String lastName, String email, String password, String mobileArea, String mobileNumber, String address, String birthday, String marital, String gender, String salutation ,String type)
	{
		type(driver, interfaces.NewUserPage.txtFirstName, firstName);
		type(driver, interfaces.NewUserPage.txtLastName, lastName);
		type(driver, interfaces.NewUserPage.txtEmail, email);
		type(driver, interfaces.NewUserPage.txtPassword, password);
		type(driver, interfaces.NewUserPage.txtMobile, mobileNumber);
		selectDropdownItem(driver, interfaces.NewUserPage.cbbAreaMobile, interfaces.NewUserPage.dynamicAreaMobile, mobileArea);
		type(driver, interfaces.NewUserPage.txtAddress, address);
		type(driver, interfaces.NewUserPage.txtBirthday, birthday);
		selectDropdownItem(driver, interfaces.NewUserPage.cbbSalutation, interfaces.NewUserPage.dynamicSalutation, salutation);
		type(driver, interfaces.NewUserPage.txtType, type);
		selectDropdownItem(driver, interfaces.NewUserPage.cbbGender, interfaces.NewUserPage.dynamicGender, gender);
		selectDropdownItem(driver, interfaces.NewUserPage.cbbMarital, interfaces.NewUserPage.dynamicMarital, marital);
	}
	
	public void createNewUser (String firstName, String lastName, String email, String password, String mobileArea, String mobileNumber, String address, String birthday, String marital, String gender, String salutation ,String type)
	{
		enterNewUser (firstName, lastName, email, password, mobileArea, mobileNumber, address, birthday, marital, gender, salutation, type);
		selectImage(driver);
		click(driver, interfaces.NewUserPage.btnSave);
	}
	
	public void selectAreaMobile (String mobileArea)
	{
		selectDropdownItem(driver, interfaces.NewUserPage.cbbAreaMobile, interfaces.NewUserPage.dynamicAreaMobile, mobileArea);
	}
	
	public void selectGender (String gender)
	{
		selectDropdownItem(driver, interfaces.NewUserPage.cbbGender, interfaces.NewUserPage.dynamicGender, gender);
	}
	
	public void selectMarital (String marital)
	{
		selectDropdownItem(driver, interfaces.NewUserPage.cbbMarital, interfaces.NewUserPage.dynamicMarital, marital);
	}
	
	public void selectSalutation (String salutation)
	{
		selectDropdownItem(driver, interfaces.NewUserPage.cbbSalutation, interfaces.NewUserPage.dynamicAreaMobile, salutation);
	}
	
	private WebDriver driver;
}
