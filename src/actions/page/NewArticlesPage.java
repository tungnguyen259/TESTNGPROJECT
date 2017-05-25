package actions.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class NewArticlesPage extends AbstractPage{	
		
		public NewArticlesPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void createNewArticles (String title, String category, String type, String shortDescription, String desctiption, String publishStatus, String order)
		{
			type(driver, interfaces.NewArticlesPage.txtTitle, title);
			
			selectDropdownItem(driver, interfaces.NewArticlesPage.cbbCategory, interfaces.NewArticlesPage.dynamicCategory, category);
			selectDropdownItem(driver, interfaces.NewArticlesPage.cbbtype, interfaces.NewArticlesPage.dynamicType, type);
			
			type(driver, interfaces.NewArticlesPage.txtShortDescription, shortDescription);
			enterValueIntoFrame(desctiption);
			if (publishStatus.equals("published"))
				click (driver, interfaces.NewArticlesPage.checkboxPublished);
			click(driver, interfaces.NewArticlesPage.btnSave);
		}
		
		public void enterValueIntoFrame(String description)
		{
			driver.switchTo().frame(driver.findElement(interfaces.NewArticlesPage.txtDescriptionArea));	
			WebElement editable = driver.switchTo().activeElement();
			editable.sendKeys(description);
			driver.switchTo().defaultContent();
		}
		

		
		private WebDriver driver;
	}
