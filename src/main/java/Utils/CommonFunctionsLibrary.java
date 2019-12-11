package Utils;

import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import DataProvider.PropertiesFileReader;

public class CommonFunctionsLibrary extends Driver{
	private Logger logger;	
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
	
		//retrieve value from default properties file
		public static String readPropertiesData(String key) throws IOException {
			
			String val= pfr.readDefaultProperties(key);
			return val;
			
		}
		
		//retrieve value from data properties file
		public static String readData(String key) throws IOException {
					
			String val= pfr.readPropData(key);
			return val;
					
		}
		
		//generate random number
		public static int generateRandomNumber() {
			Random r = new Random();
			int random_no= r.nextInt(100000);
			return random_no;
		}
	
	
	
}
		