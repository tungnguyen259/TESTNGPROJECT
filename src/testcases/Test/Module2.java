package testcases.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import actions.common.AbstractTest;
import actions.common.Constant;
import actions.page.LoginPage;
import actions.page.NewVehiclePage;
import actions.page.UserManagementPage;
import actions.page.VehiclePage;

@Listeners(actions.configure.TestListeners.class)
public class Module2 extends AbstractTest{

@Parameters({"browser"})
@BeforeClass(alwaysRun = true)  
  public void f (String browser) {
	  driver = openBrowser(browser);  
  }
  
  @Test (description = "Verify user can create new Vehicle with valid information")
  public void TC015 () {
	  loginPageObject = new LoginPage(driver);
	  UserManagementPageObject = new UserManagementPage(driver);
	  loginPageObject = new LoginPage(driver);
	  NewVehiclePageObject = new NewVehiclePage(driver);
	  VehiclePageObject = new VehiclePage(driver);
	  
	  //Step 1: Open browser
	  navigateBrowser(driver, Constant.url);
	  
	  //Step 2: Login BE
	  loginPageObject.login(Constant.username, Constant.password);	

	  //Step 3: Enter Create Vehicle Screen
	  UserManagementPageObject.selectMenuItem(driver, "Vehicle", "Create new Vehicle");
	  
	  //Step 4: Create new Vehicle
	  NewVehiclePageObject.createNewVehicle(model, variant, colour, chassis, manufacture);
	  
	  //VP: Check data created
	  verifyTrue(VehiclePageObject.isPageDisplay(driver, pageName));
	  verifyTrue(VehiclePageObject.checkVehicleData(model, variant, colour));
	
	  //Delete new vehicle has just created
	  VehiclePageObject.deleteNewlyVehicle(model, variant);
  }
  
  @Test (description = "Verify user can reset search data")
  public void TC016 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter Vehicle Screen  
	  //Step 4: Enter text into search textbox and click search
	  //Step 5: Click Reset
	  VehiclePageObject.selectActionButtons("Reset");
	
	  //Vp; Data resets
	  verifyTrue(VehiclePageObject.checkSearchDataReset());
  }
  
  @Test (description = "Verify ID sort with Ascent")
  public void TC017 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Id");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Id"));
  }
  
  @Test (description = "Verify ID sort with descent")
  public void TC018 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("id");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("id"));
  }
  
  @Test (description = "Verify firstname sort with Descent")
  public void TC019 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Vehicle");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Vehicle"));
  }
  
  @Test (description = "Verify firstname sort with Ascent")
  public void TC020 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Vehicle");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Vehicle"));
  }
  
  @Test (description = "Verify firstname sort with Descent")
  public void TC021 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Vehicle ID");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Vehicle ID"));
  }
  
  @Test (description = "Verify lastname sort with Ascent")
  public void TC022 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Vehicle ID");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Vehicle ID"));
  }
  
  @Test (description = "Verify email sort with Descent")
  public void TC023 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Brand");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Brand"));
  }
  
  @Test (description = "Verify email sort with Ascent")
  public void TC024 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Brand");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Brand"));
  }
  
  @Test (description = "Verify mobile sort with Descent")
  public void TC025 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Model");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Model"));
  }
  
  @Test (description = "Verify mobile sort with Ascent")
  public void TC026 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Model");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Model"));
  }
  
  @Test (description = "Verify address sort with Descent")
  public void TC027 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Variant");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Variant"));
  }
  
  @Test (description = "Verify address sort with Ascent")
  public void TC028 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Variant");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Variant"));
  }
  
  @Test (description = "Verify Colour sort with Descent")
  public void TC029 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  VehiclePageObject.selectLink("Colour");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Colour"));
  }
  
  @Test (description = "Verify Colour sort with Ascent")
  public void TC030 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Colour");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkAscentSort("Colour"));
  }
  
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		closeBrowser(driver);
	}
	
	  private WebDriver driver;
	  private LoginPage loginPageObject;
	  private UserManagementPage UserManagementPageObject;
	  private NewVehiclePage NewVehiclePageObject;
	  private VehiclePage VehiclePageObject;
  
  // Data test
  private String model ="A-Class";
  private String variant ="A180 Urban";
  private String colour ="White";
  private String chassis ="TungAdded";
  private String manufacture ="2009";
  private String message = "A vehicle was successfully created.";
  private String pageName = "Vehicles";
  
}