package actions.page;

import org.openqa.selenium.WebDriver;

public class NewVehiclePage extends AbstractPage {
	public NewVehiclePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewVehicle(String model, String variant, String colour, String chassis, String manufacture) {		
		selectDropdownItem(driver,interfaces.NewVehiclePage.cbbModel ,interfaces.NewVehiclePage.dynamicModel, model);
		selectDropdownItem(driver,interfaces.NewVehiclePage.cbbVariant ,interfaces.NewVehiclePage.dynamicVariant, variant);
		selectDropdownItem(driver,interfaces.NewVehiclePage.cbbColour ,interfaces.NewVehiclePage.dynamicColour, colour);
		selectDropdownItem(driver,interfaces.NewVehiclePage.cbbManufacture ,interfaces.NewVehiclePage.dynamicManufacture, manufacture);
		type(driver, interfaces.NewVehiclePage.txtChassis, chassis);
		selectImage(driver);
		click(driver, interfaces.NewVehiclePage.btnSave);
	}
	
	private WebDriver driver;
	}
