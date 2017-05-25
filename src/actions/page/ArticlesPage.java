package actions.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.common.Constant;

	public class ArticlesPage extends AbstractPage{	
		
		public ArticlesPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void selectActionButtons(String button)
		{
			sleep(3);
			//waitForControl(driver, interfaces.UserManagementPage.btnCreateNewUser, Constant.longWaitTime);
			//if(button.equals("CreateNewUser"))click(driver, interfaces.ArticlesPage.bt);
			//if(button.equals("SyncUser"))click(driver, interfaces.UserManagementPage.btnSyncUser);
			if(button.equals("Search"))click(driver, interfaces.ArticlesPage.btnSearch);
			if(button.equals("Reset"))click(driver, interfaces.ArticlesPage.btnReset);
		}
		
		public boolean checkArticlesData(String title, String shortDescription, String type)
		{		
			click(driver, interfaces.ArticlesPage.idLink);	
			click(driver, interfaces.ArticlesPage.idLink);
		boolean a = isControlDisplay(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicTitle, title)));
		boolean b = isControlDisplay(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicShortDescription, shortDescription)));
		boolean c =  isControlDisplay(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicType, type)));
		//boolean d =  isControlDisplay(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicOrder, order)));
			return (a && b && c);
		}
		
		public void searchArticles (String information)
		{	
			type(driver, interfaces.ArticlesPage.txtSearch, information);
			selectActionButtons("Search");
		}
		
		public void DeleteArticle (String information)
		{	
			type(driver, interfaces.ArticlesPage.txtSearch, information);
			selectActionButtons("Search");
			click(driver, interfaces.ArticlesPage.idLink);	
			click(driver, interfaces.ArticlesPage.idLink);
			sleep(2);
			click(driver, interfaces.ArticlesPage.linkDelete);
			driver.switchTo().alert().accept();
		}
		
		public boolean checkSearchDataReset ()
		{
		boolean a = driver.findElement(interfaces.ArticlesPage.txtSearch).isDisplayed();
		boolean b = isControlDisplay(driver, interfaces.ArticlesPage.tbArticles);
		return a&&b;
		}
		
		public boolean checkDescentSort (String column)
		{
			int colID;
			//sleep(Constant.shortWaitTime);//wait for table load
			WebElement tableElement = findElement(driver, interfaces.ArticlesPage.tbArticles);
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
			
			if(column.equals("Title")) {
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
						
			if(column.equals("Type")) {
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
			
			if(column.equals("Order")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[6]/div"));
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
			
			if(column.equals("Create Date")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[7]/div"));
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
			
			if(column.equals("Short Description")) {			
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
			WebElement tableElement = findElement(driver, interfaces.ArticlesPage.tbArticles);
			List<WebElement> rows = tableElement.findElements(By.xpath("tbody/tr"));
			if(column.equals("Id")){
				 colID = rows.get(0).findElements(By.xpath("td")).size() - 8;
					for (int i = 0; i < rows.size()-1; i++) {
						int ID1 = Integer.parseInt(rows.get(i).findElements(By.xpath("td[1]/div")).get(colID).getText());
						int ID2= Integer.parseInt(rows.get(i+1).findElements(By.xpath("td[1]/div")).get(colID).getText());
						if (ID1 > ID2)
							return false;
					}
				}
			
			if(column.equals("Title")) {
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
						
			if(column.equals("Type")) {
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
			
			if(column.equals("Order")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[6]/div"));
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
			
			if(column.equals("Create Date")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[7]/div"));
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
			
			if(column.equals("Short Description")) {			
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
		
		public void selectLink (String link)
		{
			sleep(3);
			if(link.equals("Id")||link.equals("Order")||link.equals("Created Date")){
			click(driver, By.xpath(String.format(interfaces.ArticlesPage.orderLink, link)));
			}
			if(link.equals("Title")||link.equals("Short Description")||link.equals("Type")){
				waitForControl(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicLink, link)), Constant.shortWaitTime);
				click(driver, By.xpath(String.format(interfaces.ArticlesPage.dynamicLink, link)));
			}
			sleep(3);
		}
		private WebDriver driver;
}
