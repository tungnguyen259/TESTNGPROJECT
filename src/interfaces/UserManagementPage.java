package interfaces;
import org.openqa.selenium.By;

public class UserManagementPage {
	
	public static By btnCreateNewUser = By.xpath("//a[@id='DublinTheme_wt29_block_wtActions_wt55']");
	public static By btnSyncUser = By.xpath("//input[@id='DublinTheme_wt29_block_wtTitle_wt27']");
	public static By btnSearch = By.xpath("//input[@id='DublinTheme_wt29_block_wtMainContent_wt62']");
	public static By btnReset = By.xpath("//input[@id='DublinTheme_wt29_block_wtMainContent_wt46']");
	public static By txtSearch = By.xpath("//input[@id='DublinTheme_wt29_block_wtMainContent_wtSearchInput']");
	public static String dynamicFirstName = ("//a[contains(text(),'%s')]");
	public static String dynamicEmail = ("//a[contains(text(),'%s')]");
	public static String dynamicLastName=("//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/tbody/tr/td[contains(text(),'%s')]");
	public static String dynamicMobile=("//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/tbody/tr/td[contains(text(),'%s')]");
	public static String dynamicAddress=("//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/tbody/tr/td[contains(text(),'%s')]");
	public static By linkDelete = By.xpath("//a[contains(text(),'Delete')]");
	public static By tbUser=By.id("DublinTheme_wt29_block_wtMainContent_wtProfileTable");
	public static By link = By.xpath("//th[@class='TableRecords_Header SortColumns_Sortable']/div");
	public static By idLink = By.xpath("//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/thead/tr/th[1]/div");
	public static String dynamicLink = ("//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/thead/tr/th[contains(text(),'%s')]");
	//idlink .//table[@id='DublinTheme_wt29_block_wtMainContent_wtProfileTable']/thead/tr/th/Div[contains(text(),'Id')]
	
}
