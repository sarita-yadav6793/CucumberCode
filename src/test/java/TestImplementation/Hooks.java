package TestImplementation;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.ScreenCapture;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import DataProvider.ExcelFileReader;
import Utils.CommonFunctionsLibrary;
import Utils.Driver;
import Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	
	//public static WebDriver driver;
	public static CommonFunctionsLibrary cfl;
	public ExcelFileReader efr;
	private Logger logger= Logger.getLogger(this.getClass());
	Driver d= new Driver();
	
	
	@Before
	public void initializeDriver() throws IOException {
		PropertyConfigurator.configure(CommonFunctionsLibrary.readPropertiesData("log4jpath"));
		d.initialiseDriver();	
	}
	
	@After(order = 1)
	 public void afterScenario(Scenario scenario) {
	 if (scenario.isFailed()) {
	 String screenshotName = scenario.getName().replaceAll(" ", "_");
	 try {
		 File sourcePath = ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
		 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
		 Files.copy(sourcePath, destinationPath);   
		 Reporter.addScreenCaptureFromPath(destinationPath.toString());
	 } catch (Exception e) {
		 e.printStackTrace();
	 } 
	 }
	 }
	
	@After(order = 0)
	public void  close() {	
		 d.closeDriver();
	}
	
}
