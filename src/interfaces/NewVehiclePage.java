package interfaces;

import org.openqa.selenium.By;

public class NewVehiclePage {
	public static By cbbModel = By.xpath("//select[@id='DublinTheme_wt76_block_wtMainContent_wtVehicle_VehicleModelId']");
	public static String dynamicModel = ("//option[contains(text(),'%s')]");
	
	public static By cbbVariant = By.xpath("//select[@id='DublinTheme_wt76_block_wtMainContent_wtVehicle_VariantId']");
	public static String dynamicVariant = ("//option[contains(text(),'%s')]");
	
	public static By cbbColour = By.xpath("//select[@id='DublinTheme_wt76_block_wtMainContent_wtVehicle_ColourId']");
	public static String dynamicColour = ("//option[contains(text(),'%s')]");
	
	public static By cbbManufacture = By.xpath("//select[@id='DublinTheme_wt76_block_wtMainContent_wtVehicle_ColourId']");
	public static String dynamicManufacture = ("//option[contains(text(),'%s')]");
	
	public static By txtChassis = By.xpath("//input[@id='DublinTheme_wt76_block_wtMainContent_wtVehicle_ChassisNo']");
	public static By btnSave = By.xpath("//input[@id='DublinTheme_wt76_block_wtMainContent_wt47']");
	
}
