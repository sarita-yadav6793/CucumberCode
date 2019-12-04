package Utils;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import DataProvider.ExcelFileReader;
import Utils.CommonFunctionsLibrary;
import Utils.Driver;
import Utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public static CommonFunctionsLibrary cfl;
	public ExcelFileReader efr;
	private Logger logger= Logger.getLogger(this.getClass());
	
	@Before
	public void initialiseDriver() throws IOException {
		if(driver==null) {
			logger.info(Driver.class.getName() + "--------------Initialise Driver--------------");
			driver=DriverFactory.getDriver();
			driver.manage().window().maximize();
			
		}
		else {
			logger.info("----------------Driver already initialised------------------");
		}
		String url= CommonFunctionsLibrary.readPropertiesData("URL");
		driver.get(url);
	}
	
	@After
	public WebDriver closeDriver() {
		logger.info(Driver.class.getName()+"------------Close Driver--------------");
		DriverFactory.closeDriver(driver);
		return driver=null;
	}
	
}
