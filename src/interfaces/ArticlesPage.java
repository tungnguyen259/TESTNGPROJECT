package interfaces;

import org.openqa.selenium.By;

public class ArticlesPage {

		public static By txtSearch = By.xpath("//input[@id='DublinTheme_wt20_block_wtMainContent_wtSearchInput']");
		public static By btnSearch = By.xpath("//input[@id='DublinTheme_wt20_block_wtMainContent_wt72']");
		public static By btnReset = By.xpath("//input[@id='DublinTheme_wt20_block_wtMainContent_wt34']");
		public static By tbArticles = By.xpath("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']");
		
		public static By idLink = By.xpath("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/thead/tr/th[1]/div");
		public static String orderLink = ("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/thead/tr/th/div[text()='%s']");
		public static String dynamicLink = "//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/thead/tr/th[text()='%s']";
		
		public static String dynamicTitle=("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr[1]/td/a[text()='%s']");
		public static String dynamicShortDescription=("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr[1]/td[contains(text(),'%s')]");
		//public static String dynamicpublished=("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr/td[contains(text(),'%s')]");
		public static String dynamicType=("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr[1]/td[contains(text(),'%s')]");
		//public static String dynamicOrder=("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr[1]/td/a[contains(text(),'%s')]");
		
		public static By linkDelete=By.xpath("//table[@id='DublinTheme_wt20_block_wtMainContent_wtArticleTable']/tbody/tr[1]/td/a[contains(text(),'Delete')]");
		
		public static By link = By.xpath("//th[@class='TableRecords_Header SortColumns_Sortable']");

		
}
