package com.qa.fb.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	
	public WebDriver init_driver(String browserName)  {
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		   if(prop.getProperty("headless").equals("yes")) {
			   FirefoxOptions options = new FirefoxOptions();
			   options.addArguments("--headless");
			   driver= new FirefoxDriver(options);
		   }else {
			   driver = new FirefoxDriver();
		   }
		}
		return driver;
	}
	
	public Properties init_properties() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\KeywordDrivenFramework\\src\\main\\java\\com\\qa\\fb\\keyword\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		return prop;
	}
}

