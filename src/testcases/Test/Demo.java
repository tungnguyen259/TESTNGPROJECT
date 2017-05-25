package testcases.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void f()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("");
	}
	
	@BeforeClass
	public void b ()
	{
		//do any things
	}
	
	@AfterClass
	public void c()
	{
		//do any things
		//test commit code
		// Push again
		
	}
	
	
}
