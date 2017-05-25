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
import actions.page.NewUserPage;
import actions.page.UserManagementPage;

@Listeners(actions.configure.TestListeners.class)
public class Module1 extends AbstractTest{

@Parameters({"browser"})
@BeforeClass(alwaysRun = true)  
  public void f (String browser) {
	  driver = openBrowser(browser);  
  }
  
  @Test (description = "Verify user can create new user with valid information")
  public void TC001 () {
	  loginPageObject = new LoginPage(driver);
	  UserManagementPageObject = new UserManagementPage(driver);
	  loginPageObject = new LoginPage(driver);
	  NewUserPageObject = new NewUserPage(driver);
	  
//		log.info("Step 2: Enter valid username into Username field");
//		log.info("Step 3: Enter valid password into Password field");
//		log.info("Step 4: Click on 'Log in' button");
	  
	  //Step 1: Open browser
	  navigateBrowser(driver, Constant.url);
	  
	  //Step 2: Login BE
	  loginPageObject.login(Constant.username, Constant.password);	
	  
	  //Step 3: Create new user
	  UserManagementPageObject.selectMenuItem(driver, item, subItem);
	  NewUserPageObject.createNewUser(firstName, lastName, email, createPass, "+84", phone, address, "1-1-2016", "Single", "Male", "Mr.", "Premium Ower");  
	  
	  //VP: Verify that user is created correctly
	  verifyTrue(UserManagementPageObject.isMessageDisplay(driver, message));
	  verifyTrue(UserManagementPageObject.isPageDisplay(driver, pageName));
	  UserManagementPageObject.searchUser("", email);
	  verifyTrue(UserManagementPageObject.checkUserInformation(firstName, lastName, email, phone, address));
  
	  //Step 4: Delete user
	  UserManagementPageObject.deleteUser(email);
	  
  }
  
  @Test (description = "Verify user can reset search data")
  public void TC002 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on Reset button
	  UserManagementPageObject.selectActionButtons(resetButton);
	  
	  //VP: Make sure search data reset
	  verifyTrue(UserManagementPageObject.checkSearchDataReset());
  }
  
  @Test (description = "Verify ID sort with Ascent")
  public void TC003 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("id");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("id"));
  }
  
  @Test (description = "Verify ID sort with descent")
  public void TC004 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("id");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("id"));
  }
  
  @Test (description = "Verify firstname sort with Descent")
  public void TC005 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("First Name");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("First Name"));
  }
  
  @Test (description = "Verify firstname sort with Ascent")
  public void TC006 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("First Name");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("First Name"));
  }
  
  @Test (description = "Verify firstname sort with Descent")
  public void TC007 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("Last Name");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("Last Name"));
  }
  
  @Test (description = "Verify lastname sort with Ascent")
  public void TC008 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("Last Name");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("Last Name"));
  }
  
  @Test (description = "Verify email sort with Descent")
  public void TC009 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("Email");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("Email"));
  }
  
  @Test (description = "Verify email sort with Ascent")
  public void TC010 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("Email");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("Email"));
  }
  
  @Test (description = "Verify mobile sort with Descent")
  public void TC011 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("Mobile Phone");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("Mobile Phone"));
  }
  
  @Test (description = "Verify mobile sort with Ascent")
  public void TC012 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("Mobile Phone");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("Mobile Phone"));
  }
  
  @Test (description = "Verify address sort with Descent")
  public void TC013 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 1st time
	  UserManagementPageObject.selectLink("Address");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkDescentSort("Address"));
  }
  
  @Test (description = "Verify address sort with Ascent")
  public void TC014 () {
	  
	  //Step 1: Open browser	  
	  //Step 2: Login BE	  
	  //Step 3: Click on ID link 2nd times
	  UserManagementPageObject.selectLink("Address");
	  
	  //VP: Make sure search data sort correctly
	  verifyTrue(UserManagementPageObject.checkAscentSort("Address"));
  }
  
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		closeBrowser(driver);
	}
	
  private WebDriver driver;
  private LoginPage loginPageObject;
  private UserManagementPage UserManagementPageObject;
  private NewUserPage NewUserPageObject;
  
  // Data test
  private String item="User Management";
  private String subItem="Create new User";
  private String resetButton ="Reset";
  private String email ="testingrml15@gmail.com";
  private String firstName ="Nguyen";
  private String lastName ="Tung";
  private String phone ="0905509548";
  private String createPass="123456@t";
  private String address ="Nguyen Van Troi";
  private String message = "Profile 'Nguyen' was successfully created.";
  private String pageName = "Users ";
  
}
