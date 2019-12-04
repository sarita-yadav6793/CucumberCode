package Utils;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import DataProvider.ExcelFileReader;

public class Driver {	
	public static CommonFunctionsLibrary cfl;
	public ExcelFileReader efr;
	public static WebDriver driver;
	private Logger logger= Logger.getLogger(this.getClass());
	
	public void initialiseDriver() throws IOException {
		if(driver==null) {
			logger.info(Driver.class.getName() + "--------------Initialise Driver--------------");
			driver=DriverFactory.getDriver();
			driver.manage().window().maximize();
			
			
		}
		else {
			logger.info("----------------Driver already initialised------------------");
		}
		String url=CommonFunctionsLibrary.readPropertiesData("URL");
		driver.get(url);
	}
	
	
	public WebDriver closeDriver() {
		logger.info(Driver.class.getName()+"------------Close Driver--------------");
		DriverFactory.closeDriver(driver);
		return driver=null;
	}
	
	

}
