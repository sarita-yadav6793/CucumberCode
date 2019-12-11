package DataProvider;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import Utils.CommonFunctionsLibrary;

public class PropertiesFileReader {
	public static String propvalue= null;
	public String readDefaultProperties(String key) {
		try (InputStream input = new FileInputStream("configs\\default.properties")){
		Properties prop = new Properties();
		prop.load(input);
		propvalue= prop.getProperty(key);
		
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		return propvalue;
	}
	
	public String readPropData(String key) {
		try (InputStream input = new FileInputStream(CommonFunctionsLibrary.readPropertiesData("dataPath"))){
		Properties prop = new Properties();
		prop.load(input);
		propvalue= prop.getProperty(key);
		
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		return propvalue;
	}
}
