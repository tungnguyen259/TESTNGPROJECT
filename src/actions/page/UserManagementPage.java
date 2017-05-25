package actions.page;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.common.Constant;

public class UserManagementPage extends AbstractPage{
	
	public UserManagementPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Select any button on User page
	 * @param config
	 * @return None
	 */
	public void selectActionButtons(String button)
	{
		sleep(3);
		waitForControl(driver, interfaces.UserManagementPage.btnCreateNewUser, Constant.longWaitTime);
		if(button.equals("CreateNewUser"))click(driver, interfaces.UserManagementPage.btnCreateNewUser);
		if(button.equals("SyncUser"))click(driver, interfaces.UserManagementPage.btnSyncUser);
		if(button.equals("Search"))click(driver, interfaces.UserManagementPage.btnSearch);
		if(button.equals("Reset"))click(driver, interfaces.UserManagementPage.btnReset);
	}
	
	/**
	 * Search user with email
	 * @param information to search
	 * @return None
	 */
	public void searchUser (String searchType, String information)
	{	
		type(driver, interfaces.UserManagementPage.txtSearch, information);
		selectActionButtons("Search");
	}
	
	/**
	 * Delete user with email
	 * @param email
	 * @return None
	 */
	public void deleteUser (String email)
	{	
		type(driver, interfaces.UserManagementPage.txtSearch, email);
		selectActionButtons("Search");
		sleep(2);
		click(driver, interfaces.UserManagementPage.linkDelete);
		driver.switchTo().alert().accept();
	}
	
	/**
	 * Check user is created successfully 
	 * @param create user data
	 * @return true/false
	 */
	public boolean checkUserInformation (String firstName, String lastName, String email, String phone, String address)
	{	
		boolean a = isControlDisplay(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicFirstName, firstName)));
		boolean b = isControlDisplay(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicAddress, address)));
		boolean c =  isControlDisplay(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicMobile, phone)));
		boolean d =  isControlDisplay(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicEmail, email)));
		boolean e =  isControlDisplay(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLastName, lastName)));
		return (a && b && c && d && e);
	}
	
	/**
	 * Check search text is blank data and table displays
	 * @param create user data
	 * @return true/false
	 */
	public boolean checkSearchDataReset ()
	{
	String a = driver.findElement(interfaces.UserManagementPage.txtSearch).getText();
	boolean b = isControlDisplay(driver, interfaces.UserManagementPage.tbUser);
	if (a.equals("")) return b;
	else return false;
	}
	
	/**
	 * Check Descent Sort
	 * @param column
	 * @return true/false
	 */
	public boolean checkDescentSort (String column)
	{
		int colID;
		//sleep(Constant.shortWaitTime);//wait for table load
		WebElement tableElement = findElement(driver, interfaces.UserManagementPage.tbUser);
		List<WebElement> rows = tableElement.findElements(By.xpath("tbody/tr"));
		if(column.equals("Id")){
			 colID = rows.get(0).findElements(By.xpath("td")).size() - 8;
				for (int i = 0; i < rows.size()-1; i++) {
					int ID1 = Integer.parseInt(rows.get(i).findElements(By.xpath("td[1]/div")).get(colID).getText());
					int ID2= Integer.parseInt(rows.get(i+1).findElements(By.xpath("td[1]/div")).get(colID).getText());
					if (ID1 < ID2)
						return false;
				}
			}
		
		if(column.equals("First Name")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[2]/a"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Email")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[4]/a"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Mobile Phone")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[5]"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Address")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[6]"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Last Name")) {			
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[3]"));
		for(WebElement we:elementList){
		   obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();    
		for(String s:obtainedList){
		sortedList.add(s);
		}
		Collections.sort(sortedList);
		if(!sortedList.equals(obtainedList))
		return false;	
		}
		return true;
	}
	
	/**
	 * Check Ascent Sort
	 * @param column
	 * @return true/false
	 */
	public boolean checkAscentSort (String column)
	{
		int colID;
		//sleep(Constant.shortWaitTime);//wait for table load
		WebElement tableElement = findElement(driver, interfaces.UserManagementPage.tbUser);
		List<WebElement> rows = tableElement.findElements(By.xpath("tbody/tr"));
		if(column.equals("Id")){
			 colID = rows.get(0).findElements(By.xpath("td")).size() - 8;
				for (int i = 0; i < rows.size()-1; i++) {
					int ID1 = Integer.parseInt(rows.get(i).findElements(By.xpath("td[1]/div")).get(colID).getText());
					int ID2= Integer.parseInt(rows.get(i+1).findElements(By.xpath("td[1]/div")).get(colID).getText());
					if (ID1 < ID2)
						return false;
				}
			}
		
		if(column.equals("First Name")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[2]/a"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Email")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[4]/a"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Mobile Phone")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[5]"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Address")) {
			ArrayList<String> obtainedList = new ArrayList<>(); 
			List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[6]"));
			for(WebElement we:elementList){
			   obtainedList.add(we.getText());
			}
			ArrayList<String> sortedList = new ArrayList<>();    
			for(String s:obtainedList){
			sortedList.add(s);
			}
			Collections.sort(sortedList);
			Collections.reverse(sortedList);
			if(!sortedList.equals(obtainedList))
			return false;	
		}
		
		if(column.equals("Last Name")) {			
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[3]"));
		for(WebElement we:elementList){
		   obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();    
		for(String s:obtainedList){
		sortedList.add(s);
		}
		Collections.sort(sortedList);
		Collections.reverse(sortedList);
		if(!sortedList.equals(obtainedList))
		return false;	
		}
		return true;
	}
	
	/**
	 * Select item on header
	 * @param column
	 * @return None
	 */
	public void selectLink (String link)
	{
		sleep(3);
		if(link.equals("id")){
		click(driver, interfaces.UserManagementPage.idLink);
		}
		if(link.equals("First Name")){
			waitForControl(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)), Constant.shortWaitTime);
			click(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)));
		}
		if(link.equals("Last Name")){
			waitForControl(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)), Constant.shortWaitTime);
			click(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)));
		}
		if(link.equals("Email")){
			waitForControl(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)), Constant.shortWaitTime);
			click(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)));
		}
		if(link.equals("Mobile Phone")){
			waitForControl(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)), Constant.shortWaitTime);
			click(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)));
		}
		if(link.equals("Address")) {
			waitForControl(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)), Constant.shortWaitTime);
			click(driver, By.xpath(String.format(interfaces.UserManagementPage.dynamicLink, link)));
		}
		sleep(3);
		//if(link.equals(link)) click(driver, interfaces.UserManagementPage.link);
	}

	private WebDriver driver;
}
