package TestRunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import DataProvider.ConfigFileReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="Resources/Features",
		glue= {"TestImplementation"},
		plugin = {"html:target/cucumber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true)

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() throws IOException {
		 Reporter.loadXMLConfig(ConfigFileReader.getReportConfigPath());
		 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	     

}
}
	
	