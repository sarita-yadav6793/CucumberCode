package DataProvider;

import java.io.IOException;

import Utils.CommonFunctionsLibrary;

public class ConfigFileReader {
	
	public static String getReportConfigPath() throws IOException{
		String reportConfigPath = CommonFunctionsLibrary.readPropertiesData("reportConfigPath");
		if(reportConfigPath!= null) 
			return reportConfigPath;
		else 
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file");		
	}

}
