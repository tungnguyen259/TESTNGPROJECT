package interfaces;

import org.openqa.selenium.By;

public class AbstractPage {
		public static By btnUploadImage = By.xpath("//input[@class='ThemeGrid_Width8 ThemeGrid_MarginGutter SmartInput ReadOnly' and @type='file']");
		public static By panelManage = By.xpath("//div[@class='Menu_TopMenus OSInline']//a");
		public static String panelManageItem = ("//div[@class='Menu_TopMenus OSInline']//a[contains(text(),'%s')]");
		public static String panelManageSubItem = ("//div[@class='Menu_TopMenus OSInline']//a[text()='%s']");
		public static By successfullyMessage = By.xpath("//span[@class='Feedback_Message_Text']");
		public static By titlePanel =By.xpath("//div[@class='Heading1 Title PH OSInline']");
}


