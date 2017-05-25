package actions.page;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractPage extends actions.common.AutomationAction
{
	public void selectMenuItem (WebDriver driver, String item, String subItem)
	{
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
		sleep(3);
		click(driver, By.xpath(String.format(interfaces.AbstractPage.panelManageItem, "Booking Management")));
		sleep(2);
		click(driver, By.xpath(String.format(interfaces.AbstractPage.panelManageItem, item)));
		sleep(2);
			} else
		click(driver, By.xpath(String.format(interfaces.AbstractPage.panelManageSubItem, subItem)));
		}
	}	
		
	public void selectImage(WebDriver driver) {
		click(driver, interfaces.AbstractPage.btnUploadImage);
		sleep(2);
		try {
			Runtime.getRuntime().exec("C:/Users/TungN/Desktop/test.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep(5);
	}
	/**
	 * check page display correct
	 * 
	 * @param driver
	 * @param pageName
	 * @return true/false
	 */
	public boolean isPageDisplay(WebDriver driver, String pageName) {
		waitForControl(driver,interfaces.AbstractPage.titlePanel, actions.common.Constant.longWaitTime);
		if (isControlDisplay(driver, interfaces.AbstractPage.titlePanel)) {
			String text = driver.findElement(interfaces.AbstractPage.titlePanel).getText();
			return (text.equals(pageName));
		} else
			return false;
	}

	/**
	 * check MessageDisplay correct with text
	 * 
	 * @param driver
	 * @param pageName
	 * @return true/false
	 */
	public boolean isMessageDisplay(WebDriver driver, String message) {
		waitForControl(driver,interfaces.AbstractPage.successfullyMessage, actions.common.Constant.longWaitTime);
		if (isControlDisplay(driver,interfaces.AbstractPage.successfullyMessage)) {
			String text = driver.findElement(interfaces.AbstractPage.successfullyMessage).getText();
			if (text.equals(message))
				return true;
			else
				return false;
		} else
			return false;
	}
}
