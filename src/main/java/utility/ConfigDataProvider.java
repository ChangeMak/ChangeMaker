package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
	String Path="C:\\Users\\HP\\ChangeMaker\\ConfigData\\Config Properties";
	FileInputStream file=new FileInputStream(Path);
	 pro=new Properties();
	 pro.load(file);
	
	}
	
	
	public String getConFig() {
		
		return pro.getProperty("Base_URL_QA1");
		
		
	}

}
