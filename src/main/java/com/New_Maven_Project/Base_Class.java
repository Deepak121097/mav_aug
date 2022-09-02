package com.New_Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_Class {
   public static WebDriver driver;
   @Test(invocationCount = 1,invocationTimeOut = 10000)
   public static WebDriver get_browser(String name) {
if (name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Chrome_exe_file\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
}driver.manage().window().maximize();
return driver;
}
   
	
	
	
	
	
	
	
}
