package com.jenkin.test.jenkintest;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebPageDriver {	
	WebDriver driver = null;

	public WebDriver getDriver(){
		WebPageDriver pageDriver = new WebPageDriver();
		String browserName= pageDriver.loadProperties();
		if(browserName.equalsIgnoreCase("firefox")){				
			driver =  new FirefoxDriver();
		}
		
		return driver; 
	}
	
	private String loadProperties(){
		Properties prop = new Properties();
		InputStream input = null;		
		try {
			//input = new FileInputStream("test.properties");
			input = getClass().getClassLoader().getResourceAsStream("test.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}		
		catch (IOException e) {			
			e.printStackTrace();
		}
 
		return prop.getProperty("browser");
	}
}
