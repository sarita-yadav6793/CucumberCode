package Utils;

import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import DataProvider.ExcelFileReader;
import DataProvider.PropertiesFileReader;

public class CommonFunctionsLibrary extends Driver{
	private Logger logger;	
	static ExcelFileReader efr= new ExcelFileReader();
	static PropertiesFileReader pfr = new PropertiesFileReader();
	
	public CommonFunctionsLibrary() {
		
	}
	
	// enter text in text box
	public void enterTextInTextBox(WebElement element, String txt) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		if(element.isEnabled()) {
			element.clear();
			element.click();
			element.sendKeys(txt);
		}
	}
	
	//select checkbox
	public void selectCheckBox(WebElement element) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(!element.isSelected()) {
			element.click();
		}
	}
	
	// click button
	public void clickButton(WebElement element) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	// select radio button
	public void selectRadio(WebElement element) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		if(!element.isSelected()) {
			element.click();
		}
	}
	
	//select dropdown by value
	public void selectDDByValue(WebElement element, String val) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select select= new Select(element);
		select.selectByValue(val);
	}
	
	//select drop down by text
		public void selectDDByText(WebElement element, String txt) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Select select= new Select(element);
			select.selectByVisibleText(txt);
		}
	
	//read value from excel
		public static String readDataExcel(String key) throws IOException{
			Map<String, String> m = efr.readExcel().get("DataSheet");
			String value = m.get(key);
			
			return value;
			
		}
		
		//retrieve value from properties file
		public static String readPropertiesData(String key) throws IOException {
			
			String val= pfr.readProperties(key);
			return val;
			
		}
		
		//generate random number
		public static int generateRandomNumber() {
			Random r = new Random();
			int random_no= r.nextInt(100000);
			return random_no;
		}
	
	
	
}
		