package actions.page;

import org.openqa.selenium.WebDriver;

public class MobileLoginPage extends AbstractPage{
	
		public MobileLoginPage(WebDriver driver) {
			this.driver = driver;
		}
	private WebDriver driver;
	
	public void LoginMobileApp(String userName, String passWord)
	{
		sleep(5);
		click(driver, interfaces.MobileLoginPage.btnLogin);
	}
}
