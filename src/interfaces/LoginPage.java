package interfaces;

import org.openqa.selenium.By;

public class LoginPage {
	public static By txtUsername = By.xpath("//input[@id='WebPatterns_wt4_block_wtUsername_wtUserNameInput']");
	public static By txtPassword = By.xpath("//input[@id='WebPatterns_wt4_block_wtPassword_wtPasswordInput']");
	public static By btnLogin = By.xpath("//input[@id='WebPatterns_wt4_block_wtAction_wtLoginButton']");
}
