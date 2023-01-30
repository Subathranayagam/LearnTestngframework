package org.learntestngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnParallelTesting {
	@Test
	public void openGoogle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}
	@Test
	public void openBing()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
	}
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite" parallel = "methods" thread-count="2">
//	  <test thread-count="5" name="Test">
//	 
//	  
//	<classes>
//	      <class name="org.learntestngframework.LearnParallelTesting">
//	     
//	    
//	      
//	</class>
//	   
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->



}
