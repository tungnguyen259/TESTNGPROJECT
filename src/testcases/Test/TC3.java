package testcases.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import actions.common.AbstractTest;
import actions.common.Constant;
import actions.page.ArticlesPage;
import actions.page.LoginPage;
import actions.page.MobileLoginPage;
import actions.page.NewArticlesPage;
import actions.page.NewUserPage;
import actions.page.NewVehiclePage;
import actions.page.UserManagementPage;
import actions.page.VehiclePage;

@Listeners(actions.configure.TestListeners.class)
public class TC3 extends AbstractTest{

@Parameters({"browser"})
@BeforeClass(alwaysRun = true)  
  public void f (String browser) {
	  driver = openBrowser(browser);  
  }
  
  @Test (description = "Verify user can create new user with valid information")
  public void TC015 () {
	  loginPageObject = new LoginPage(driver);
	  UserManagementPageObject = new UserManagementPage(driver);
	  loginPageObject = new LoginPage(driver);
	  NewUserPageObject = new NewUserPage(driver);
	  NewVehiclePageObject = new NewVehiclePage(driver);
	  VehiclePageObject = new VehiclePage(driver);
	  NewArticlesPageObject = new NewArticlesPage(driver);
	  ArticlesPageObject = new ArticlesPage(driver);
	  MobileLoginPageObject = new MobileLoginPage(driver);
	  //Step 1: Open browser
	  navigateBrowser(driver, Constant.url);
	  loginPageObject.login(Constant.username, Constant.password);
	  
	  UserManagementPageObject.selectMenuItem(driver, "Vehicle", "Vehicles");
	  //Step 3: Click on ID link 2nd times
	  VehiclePageObject.selectLink("Variant");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(VehiclePageObject.checkDescentSort("Variant"));
	  //MobileLoginPageObject.LoginMobileApp("Tung", "Nguyen");
	  
	  //Step 2: Login BE
  }
  
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		//closeBrowser(driver);
	}
	
	  private WebDriver driver;
	  private LoginPage loginPageObject;
	  private ArticlesPage ArticlesPageObject;
	  private UserManagementPage UserManagementPageObject;
	  private NewUserPage NewUserPageObject;
	  private NewVehiclePage NewVehiclePageObject;
	  private VehiclePage VehiclePageObject;
	  private NewArticlesPage NewArticlesPageObject;
	  private MobileLoginPage MobileLoginPageObject;
  
  // Data test
  private String model ="A-Class";
  private String variant ="A180 Urban";
  private String colour ="White";
  private String chassis ="TungAdded";
  private String manufacture ="2009";

  
}