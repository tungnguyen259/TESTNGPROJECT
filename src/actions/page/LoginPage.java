package actions.page;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage{	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 /*
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		type(driver, interfaces.LoginPage.txtUsername, username);
		type(driver, interfaces.LoginPage.txtPassword, password);
		click(driver, interfaces.LoginPage.btnLogin);
	}
	
private WebDriver driver;
}
