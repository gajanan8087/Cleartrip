package com.flightbooking.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.flightbooking.util.Testutil;

public class Base {
	
		
	
	public static WebDriver driver;
	public static Properties prop;
	 
	
	public Base() {
		prop=new Properties();
		try {
			FileInputStream fis =new FileInputStream("E:\\Projects\\ClearTrip1\\src\\main\\java\\com"
					+ "           \\flightbooking\\configuration\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void initalization() {
		String browserName=prop.getProperty("Browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver78.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver64bit.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
	}

}
