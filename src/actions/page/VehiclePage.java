package actions.page;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.common.Constant;

public class VehiclePage extends AbstractPage {

		public VehiclePage(WebDriver driver) {
			this.driver = driver;
		}
		
		public boolean checkVehicleData(String model, String variant, String colour)
		{
		String vehicle = model.concat(" "+variant);
		click(driver, interfaces.VehiclePage.idLink);	
		click(driver, interfaces.VehiclePage.idLink);
		boolean a = isControlDisplay(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicModel, model)));
		boolean b = isControlDisplay(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicColour, colour)));
		boolean c =  isControlDisplay(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicVariant, variant)));
		boolean d =  isControlDisplay(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicVehicle, vehicle)));
			return (a && b && c && d);
		}
		
		public void deleteNewlyVehicle(String model, String variant)
		{
			String vehicle =  model.concat(" "+variant);
			type(driver, interfaces.VehiclePage.txtSearch, vehicle);
			click(driver, interfaces.VehiclePage.btnSearch);
			click(driver, interfaces.VehiclePage.idLink);	
			click(driver, interfaces.VehiclePage.idLink);
			sleep(2);
			click(driver, interfaces.VehiclePage.linkDelete);
			driver.switchTo().alert().accept();
		}
		
		public boolean checkSearchDataReset ()
		{
		String a = driver.findElement(interfaces.VehiclePage.txtSearch).getText();
		boolean b = isControlDisplay(driver, interfaces.VehiclePage.tbVehicle);
		if (a.equals("")) return b;
		else return false;
		}
		
		public void selectActionButtons(String button)
		{
			sleep(3);
			//waitForControl(driver, interfaces.UserManagementPage.btnCreateNewUser, Constant.longWaitTime);
			//if(button.equals("CreateNewUser"))click(driver, interfaces.VehiclePage.btnCreate);
			//if(button.equals("SyncUser"))click(driver, interfaces.UserManagementPage.btnSyncUser);
			if(button.equals("Search"))click(driver, interfaces.VehiclePage.btnSearch);
			if(button.equals("Reset"))click(driver, interfaces.VehiclePage.btnReset);
		}
		
		public boolean checkDescentSort (String column)
		{
			int colID;
			//sleep(Constant.shortWaitTime);//wait for table load
			WebElement tableElement = findElement(driver, interfaces.VehiclePage.tbVehicle);
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
			
			if(column.equals("Vehicle")) {
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
			
			if(column.equals("Brand")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[4]"));
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
			
			if(column.equals("Model")) {
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
			
			if(column.equals("Variant")) {
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
			
			if(column.equals("Colour")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[7]"));
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
			
			if(column.equals("Vehicle ID")) {			
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
			WebElement tableElement = findElement(driver, interfaces.VehiclePage.tbVehicle);
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
			
			if(column.equals("Vehicle")) {
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
			
			if(column.equals("Brand")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[4]"));
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
			
			if(column.equals("Model")) {
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
			
			if(column.equals("Variant")) {
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
			
			if(column.equals("Colour")) {
				ArrayList<String> obtainedList = new ArrayList<>(); 
				List<WebElement> elementList = tableElement.findElements(By.xpath("tbody/tr/td[7]"));
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
			
			if(column.equals("Vehicle ID")) {			
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
			if(link.equals("Id")){
			click(driver, interfaces.VehiclePage.idLink);
			}
			if(link.equals("Vehicle")||link.equals("Vehicle ID")||link.equals("Brand")||link.equals("Model")||link.equals("Variant")||link.equals("Colour")){
				waitForControl(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicLink, link)), Constant.shortWaitTime);
				click(driver, By.xpath(String.format(interfaces.VehiclePage.dynamicLink, link)));
			}
			sleep(3);
		}
		
		
		private WebDriver driver;

	}

	

