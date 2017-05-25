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
import actions.page.NewArticlesPage;
import actions.page.UserManagementPage;

@Listeners(actions.configure.TestListeners.class)
public class Module3 extends AbstractTest{

@Parameters({"browser"})
@BeforeClass(alwaysRun = true)  
  public void f (String browser) {
	  driver = openBrowser(browser);  
  }
  
  @Test (description = "Verify user can create new Article with valid information")
  public void TC031 () {
	  loginPageObject = new LoginPage(driver);
	  UserManagementPageObject = new UserManagementPage(driver);
	  loginPageObject = new LoginPage(driver);
	  NewArticlesPageObject = new NewArticlesPage(driver);
	  ArticlesPageObject = new ArticlesPage(driver);
	  
	  //Step 1: Open browser
	  navigateBrowser(driver, Constant.url);
	  
	  //Step 2: Login BE
	  loginPageObject.login(Constant.username, Constant.password);	
	  UserManagementPageObject.selectMenuItem(driver, "Article Management", "Create new Article");

	  //Step 3: Enter article data
	  NewArticlesPageObject.createNewArticles(title, category, type, shortDescription, description, "published", order);
	  
	  // VP; Check data has just created
	  verifyTrue(ArticlesPageObject.isMessageDisplay(driver, message));
	  verifyTrue(ArticlesPageObject.isPageDisplay(driver, pageName));
	  ArticlesPageObject.searchArticles(title);
	  verifyTrue(ArticlesPageObject.checkArticlesData(title, shortDescription, type));
	  
	  // Delete article
	  ArticlesPageObject.DeleteArticle(title);
  }
  
  @Test (description = "Verify user can Reset search data")
  public void TC032 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click reset button
	  ArticlesPageObject.selectActionButtons("Reset");;
	  
	  //VP Data resets
	  verifyTrue(ArticlesPageObject.checkSearchDataReset());
  }
  
  @Test (description = "Verify user can sort data with ID Ascent")
  public void TC033 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Id");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Id"));
  }
  
  @Test (description = "Verify user can sort data with ID Descent")
  public void TC034 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Id");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Id"));
  }
  
  @Test (description = "Verify data sort by Ascent Title")
  public void TC035 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Title");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Title"));
  }
   
  @Test (description = "Verify user can sort data with Title Ascent")
  public void TC036 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Title");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Title"));
  }
  
  @Test (description = "Verify data sort by Ascent Short Description")
  public void TC037 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Short Description");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Short Description"));
  }
   
  @Test (description = "Verify user can sort data with Short Description Ascent")
  public void TC038 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Short Description");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Short Description"));
  }
  
  @Test (description = "Verify data sort by Ascent Type")
  public void TC039 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Type");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Type"));
  }
   
  @Test (description = "Verify data sort by Descent Type")
  public void TC040 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Type");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Type"));
  }
  
  @Test (description = "Verify data sort by Ascent Order")
  public void TC041 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Order");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Order"));
  }
   
  @Test (description = "Verify data sort by Descent Order")
  public void TC042 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Order");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Order"));
  }
  
  @Test (description = "Verify data sort by Ascent Create Date")
  public void TC043 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Created Date");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkDescentSort("Created Date"));
  }
   
  @Test (description = "Verify data sort by Descent Create Date")
  public void TC044 () {
	  
	  //Step 1: Open browser 
	  //Step 2: Login BE
	  //Step 3: Enter article data
	 // Step 4: Click on ID link
	  ArticlesPageObject.selectLink("Created Date");
	  
	  //VP: Make sure data sort correct
	  verifyTrue(ArticlesPageObject.checkAscentSort("Created Date"));
  }
  
  
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		closeBrowser(driver);
	}
	
	  private WebDriver driver;
	  private LoginPage loginPageObject;
	  private ArticlesPage ArticlesPageObject;
	  private UserManagementPage UserManagementPageObject;
	  private NewArticlesPage NewArticlesPageObject;
  
  // Data test
  private String title ="A-Class Testing Article Create";
  private String shortDescription ="A180 Urban";
  private String category ="Sport";
  private String type ="News";
  private String description ="Check Description Article";
  private String order= "20";
  private String message = "Article 'A-Class Testing Article Create' was successfully created.";
  private String pageName = "Articles";

  
}