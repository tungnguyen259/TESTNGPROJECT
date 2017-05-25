package interfaces;

import org.openqa.selenium.By;

public class VehiclePage{

	public static By linkDelete = By.xpath("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/tbody/tr[1]//a[text()='Delete']");
	public static By btnSearch = By.xpath("//input[@id='DublinTheme_wt1_block_wtMainContent_wt8']");
	public static By btnReset = By.xpath("//input[@id='DublinTheme_wt1_block_wtMainContent_wt43']");
	public static By txtSearch = By.xpath("//input[@id='DublinTheme_wt1_block_wtMainContent_wtSearchInput']");
	
	public static By tbVehicle=By.id("DublinTheme_wt1_block_wtMainContent_wtVehicleTable");
	public static By idLink = By.xpath("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/thead/tr/th[1]/div");
	public static String dynamicLink = "//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/thead/tr/th[text()='%s']";
	
	public static String dynamicVehicle=("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/tbody/tr[1]/td/a[text()='%s']");
	public static String dynamicColour=("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/tbody/tr[1]/td[contains(text(),'%s')]");
	public static String dynamicModel=("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/tbody/tr[1]/td[contains(text(),'%s')]");
	public static String dynamicVariant=("//table[@id='DublinTheme_wt1_block_wtMainContent_wtVehicleTable']/tbody/tr[1]/td[contains(text(),'%s')]");
	
	public static By link = By.xpath("//th[@class='TableRecords_Header SortColumns_Sortable']");
	
	
}
