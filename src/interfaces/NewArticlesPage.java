package interfaces;

import org.openqa.selenium.By;

public class NewArticlesPage {
	public static By txtTitle = By.xpath("//input[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_Title']"); 
	public static By cbbCategory = By.xpath("//select[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_Category']");
	public static By cbbtype = By.xpath("//select[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_Type']");	
	public static By txtShortDescription = By.xpath("//textarea[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_ShortDescription']");
	public static By txtDescriptionArea = By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']");
	public static By checkboxPublished = By.xpath("//input[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_Published']");
	public static By btnOrder = By.xpath("//input[@id='DublinTheme_wt24_block_wtMainContent_wtArticle_Order']");
	public static By btnSave= By.xpath("//input[@id='DublinTheme_wt24_block_wtMainContent_wt21']");
	public static By btnCancel= By.xpath("//input[@id='DublinTheme_wt24_block_wtMainContent_wt28']");
	public static By txtDescriptionTextArea = By.xpath("//div[@id='cke_DublinTheme_wt24_block_wtMainContent_wtArticle_Description']");
	
	public static String dynamicCategory = ("//option[text()='%s']");
	public static String dynamicType = ("//option[text()='%s']");
}
